import java.util.Scanner;

public class TipCalc extends TipCalculator {
	
	public static void main(String[] args){
		
		String inputCont = "Y ";
		double inputTotal = 0.0;
		Scanner totalInput = new Scanner(System.in);
		TipCalculator calc1 = new TipCalculator();
		boolean runApp = true;
		boolean goodInput = false;
		
		while (runApp){
			System.out.print("Start application? Y or N: ");
			inputCont = totalInput.nextLine();
			
			//while loop will check if user input is a good input, either Y or N.
			//if not an input matching y or n, then display message in else statement.
			while (!goodInput){
				goodInput = false;
				if (inputCont.equalsIgnoreCase("y") || inputCont.equalsIgnoreCase("n")){
					goodInput = true;
				}
				else {
					System.out.println("Please enter either Y to start application or N to quit.");
					inputCont = totalInput.nextLine();
				}
			}
			
			//if user input is y, then code bellow if is executed.
			if (inputCont.equalsIgnoreCase("Y")){	
				
				System.out.print("Please enter the meal's total: ");
				
				//checks if totalInput has a double as an input.
				if(totalInput.hasNextDouble()){
					
					//sets inputTotal to the users input
					inputTotal = totalInput.nextDouble();
				
				} else{
					System.out.println("\nPlease enter your total as a valid number.");
					System.out.println("*********************************************");
					continue;
				}
				
				System.out.println("\nYour total is: " + inputTotal);
				
				//calc1 calls setTotal method and passes inputTotal as the parameter.
				calc1.setTotal(inputTotal);
				
				System.out.println("Your tip amount is: " + mealTip);
				System.out.println("Your grand total with tip is: " + grandTotal);
				System.out.println("************************************************");
				
			}
			
			if (inputCont.equalsIgnoreCase("N")){
				System.out.println("\nGoodbye");
				runApp = false;
			}
		}	
	}
}