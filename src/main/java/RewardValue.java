public class RewardValue {
    private double cash;
    private int miles;
    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(int miles) {
        this.miles = miles;
    }
    public double getCashValue() {
        double result = this.miles*0.0035;
        return result;
    }
    public int getMilesValue() {
        double result = this.cash/0.0035;
        return (int) result;
    }
}