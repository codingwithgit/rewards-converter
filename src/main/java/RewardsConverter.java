import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
public class RewardValue {
	private double cashValue;
	private double milesValue;
	public RewardValue(double cashValue) {
		// TODO Auto-generated constructor stub
		 this.cashValue = cashValue;
	     this.milesValue = cashValue / 0.0035;;
	}

	public RewardValue(double cashValue,double milesValue) {
		this.milesValue=milesValue;
		this.cashValue=milesValue*0.0035;
	}
	public  double getCashValue() {
		return cashValue;
	}
	public double getMilesValue() {
		return milesValue;
	}

}
