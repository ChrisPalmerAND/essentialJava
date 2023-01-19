package dollar_challenge;

public class Coin {
    public double value;
    public int amount;
    public double totalValue;
    public double calculateValue(){
        return this.totalValue =  this.value * this.amount;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public double getValue() {
        return value;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}

