package passwordValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public boolean validateOldPasswordIsNotMatch(String oldPassword, String newPassword){
        return !oldPassword.equals(newPassword);
    }

    public boolean validatePasswordHasEnoughCharacters(String newPassword){
        return newPassword.length() >= 8;
    }

    public boolean validatePasswordContainsAUppercaseLetter(String newPassword){
        boolean containsUppercase = false;
        for(int i=0; i < newPassword.length(); i++){
            if(containsUppercase == false) {
                char letter = newPassword.charAt(i);
                if (Character.isUpperCase(letter)) containsUppercase = true;
            }
        }
        return containsUppercase;
    }

    public boolean validatePasswordContainsSpecialCharacter(String newPassword){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(newPassword);
        return matcher.find();
    }

    public boolean validatePasswordDoesNotContainUsername(String newPassword, String username){
        return !newPassword.contains(username);
    }

    public boolean runAllChecks(String currentPassword, String username, String newPassword){
        boolean checksPass = true;
        boolean[] allValidationChecks = new boolean[5];
        allValidationChecks[0] = validateOldPasswordIsNotMatch(currentPassword, newPassword);
        allValidationChecks[1] = validatePasswordContainsAUppercaseLetter(newPassword);
        allValidationChecks[2] = validatePasswordContainsSpecialCharacter(newPassword);
        allValidationChecks[3] = validatePasswordDoesNotContainUsername(newPassword, username);
        allValidationChecks[4] = validatePasswordHasEnoughCharacters(newPassword);

        for(int i=0; i < allValidationChecks.length; i++){
            if(checksPass){
                checksPass = allValidationChecks[i];
            }
        }
        return checksPass;
    }

}
