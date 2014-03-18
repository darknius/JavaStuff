
public class TipCalculator {
	
	
	final static double TIP = 0.15;
	static double mealTotal;
	static double mealTip;
	static double grandTotal;
	
	//Construtor
	public TipCalculator(double total)
	{
		setTotal(total);
	}
	//default constructor
	public TipCalculator(){
		this(0.0);
	}
	
	//returns the meal total
	public double getTotal(){
		return mealTotal;
	}
	
	//returns the tip
	public double getTip()
	{
		return mealTip;
	}
	
	//returns the grand total of meal.
	public double getGrandTotal()
	{
		return grandTotal;
	}
	
	//method that calculates the tip and the toal with the tip included.
	public void setTotal (double total)
	{
		mealTotal = total;
		mealTip = total * TIP;
		grandTotal = total + mealTip;
	}
	
}
