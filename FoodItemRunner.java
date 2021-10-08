class FoodItemRunner
{
public static void main(String[] args)
{
	FoodItem fooditem1=new FoodItem("Biriyani",200,"Biriyanihouse",2,Type.GOOD,4,OrderType.ONLINE);
	fooditem1.displayDetails();
	fooditem1.printTotalPrice();
	
	

	FoodItem fooditem2=new FoodItem("ICECreame",100,"a2",1,Type.EXCELENT,3,OrderType.OFFLINE);
	fooditem2.displayDetails();
	fooditem2.printTotalPrice();
	
	FoodItem.printTotalFoodItemPrice();
	}
}