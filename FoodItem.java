class FoodItem
{
	String name;
	float price;
	String hotelname;
	int quality;
	Type type;
	float rating;
	OrderType ordertype;
	static float TotalFoodItemPrice;
	
	
	FoodItem(String name,float price,String hotelname,int quality,Type type,float rating,OrderType ordertype)
	{
		this.name=name;
		this.price=price;
		this.hotelname=hotelname;
		this.quality=quality;
		this.type=type;
		this.rating=rating;
		this.ordertype=ordertype;
		//System.out.println("calling all parameters");
		
	}
	FoodItem(String name,float price,String hotelname)
	{
		this.name=name;
		this.price=price;
		this.hotelname=hotelname;
		
		//System.out.println("calling all parameters");
		
	}
	
	
void displayDetails()
{
	System.out.println(name);
	System.out.println(price);
	System.out.println(hotelname);
	System.out.println(type);
	System.out.println(rating);
	System.out.println(quality);
	System.out.println(ordertype);
	//System.out.println("calling all instance variable into non static method");
	
	
}

void printTotalPrice()
{
	float total=this.price*this.quality;
	System.out.println("TOTAL COST OF THE FOOD ITEM="+total);
	TotalFoodItemPrice=TotalFoodItemPrice+total;
	
}
static void printTotalFoodItemPrice()
{
	System.out.println("total food items price="+TotalFoodItemPrice);
}
void printHotelName()
{
	String name1=this.name;
	System.out.println("print hotel name"+name1);
	float price1=this.price;
	System.out.println("print price"+price1);
	}
}

