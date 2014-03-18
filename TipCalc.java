import java.util.Scanner;

public class TipCalc extends TipCalculator {
	
	public static void main(String[] args){
		
		String inputCont = "Y ";
		double inputTotal = 0.0;
		Scanner totalInput = new Scanner(System.in);
		TipCalculator calc1 = new TipCalculator();
		
		System.out.print("Start application? Y or N: ");
		inputCont = totalInput.nextLine();
		
		
		while(inputCont.equalsIgnoreCase("Y")){	
			
			System.out.print("Please enter the meal's total: ");
			
			//checks if totalInput has a double as an input.
			if(totalInput.hasNextDouble()){
				
				//sets inputTotal to the users input
				inputTotal = totalInput.nextDouble();
				
				System.out.println("Your total is: " + inputTotal);
				
				//calc1 calls setTotal method and passes inputTotal as the parameter.
				calc1.setTotal(inputTotal);
				
				System.out.println("Your tip amount is: " + mealTip);
				System.out.println("Your grand total with tip is: " + grandTotal);
				System.out.println("*******************************************************************");
				
				
			} else{
				System.out.println("Please enter your total as a valid number.");
				System.out.print("Restart application? Y or N: ");
				inputCont = totalInput.nextLine();
			}
			System.out.print("Run again? Y or N: ");
			inputCont = totalInput.nextLine();
		}
	}
}