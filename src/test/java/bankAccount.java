class bankAccount {
    private double balanceAmount;

    public void depositAmount(double amount) {
        balanceAmount += amount;
    }

    public void withdrawAmount(double amount) {
        balanceAmount -= amount;
    }

    public void addInterest(double interestPercentage) {
        balanceAmount += balanceAmount * interestPercentage / 100;
    }

    public double seeBalance() {
        return balanceAmount;
    }

    bankAccount() {
        balanceAmount = 0;
    }
}