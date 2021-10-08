class MovieTicket
{
String movieName;
String Theater;
float price;
int noOfSeats;
String type;
static float totalPrice;


MovieTicket(String movieName,String Theater,float price,int noOfSeats,String type)
{
	this.movieName=movieName;
	this.Theater=Theater;
	this.price=price;
	this.noOfSeats=noOfSeats;
	this.type=type;
	System.out.println("invoked 5 parameter const");
}
MovieTicket(String movieName,String theater,float price)
{
	this.movieName=movieName;
	this.Theater=Theater;
	this.price=price;
	System.out.println("invoked 3 parameter const");
}
void dispalyDeatils()
{
	System.out.println(this.movieName);
	System.out.println(this.Theater);
	System.out.println(this.price);
	System.out.println(this.noOfSeats);
	System.out.println(this.type);
	
}
void printTotalPrice()
{
	float total=this.price*this.noOfSeats;
	System.out.println("total price:" +total);
	totalPrice=totalPrice+total;
	System.out.println("total Price:" +totalPrice);
	
}
static void printTotalMovieTicketPrice()
{
	System.out.println("Total price:" +totalPrice);
	
}


}
