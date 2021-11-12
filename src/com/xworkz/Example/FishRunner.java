package com.xworkz.Example;
import com.xworkz.Example.MethodoverridExample.*;

public class FishRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	

	
			
				Fish food1=new Fish();
					System.out.println(food1);
					System.out.println(food1.hashCode());
					System.out.println(System.identityHashCode(food1));
					
					Fish food2=new Fish();
					System.out.println(food2);
					System.out.println(food2.hashCode());
					System.out.println(System.identityHashCode(food2));
					
					food1.setName("shark");
					  food1.setName("Flounder");
					   
					   boolean equal=food1.equals(food2);
					 
					System.out.println(equal);
						
					
			}
		}





