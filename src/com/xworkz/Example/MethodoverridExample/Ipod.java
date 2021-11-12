package com.xworkz.Example.MethodoverridExample;

public class Ipod {
	
	
          private String name;
          private int price;
          private String modelNo;
          
          
          public Ipod()
          {
        	  System.out.println("invoked the no-args ipod");
          }


		public String getName()
		{
			return name;
		}


		public void setName(String name) 
		{
			this.name = name;
		}


		public int getPrice()
		{
			return price;
		}


		public void setPrice(int price)
		{
			this.price = price;
		}
		
		public String getModelNo()
		{
			return modelNo;
		}
		
		
		public void setModelNo(String modelNo) 
		{
			this.modelNo= modelNo;
		}
		
		
         @Override
          public String toString()       
         {
        	  System.out.println("invoked the toString");
        	  return "aa";
          }
          
         
         
         
         
          public boolean equals(Object obj)
          {
        	  System.out.println("invoking ipod from eqaul");
          
          if(obj==null)
          {
        	  System.out.println("passing values");
        	  return false;
          
           }
          if(obj instanceof Ipod) 
          {
        	  System.out.println("correct argument passed");
        	  Ipod casted=(Ipod) obj;
        	  String castModelNo=casted.modelNo;
        	  if(this.modelNo.equals( castModelNo))
              {
	System.out.println("model number matched");
	return false;
        }
          
else
{
	System.err.println("model number not matched");
}
          }
          else
{
	System.err.println("show me correct answers");
}
          
return true;
        	  
          
          }
}
     
         
          

          
          
      


