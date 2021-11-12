package com.xworkz.Example;

import com.xworkz.Example.MethodoverridExample.*;

public class SockRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		         Sock sock=new Sock();
			
				System.out.println(sock);
				System.out.println(sock.hashCode());
				System.out.println(System.identityHashCode(sock));
				
				Sock scok2=new Sock();
				System.out.println(scok2);
				System.out.println(scok2.hashCode());
				System.out.println(System.identityHashCode(scok2));
				
				sock.setType("ankel");
				  sock.setType("ankel1");
				   
				   boolean equal=sock.equals(scok2);
				 
				System.out.println(equal);
					
				
		
	}


	}


