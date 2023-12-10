package com.datedemo;

public class ExceptionHandling {
	

		public static void main(String[] args) {


			int a=20;
			int b=0;
			
			
			int c;
			
			try
			{
			c=a/b;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Hello Enteer a valid value "+e);
			}
			catch(IllegalArgumentException e)
			{
				
				System.out.println("Hello Enteer a valid value "+e);
			}
			
			finally
			{
				System.out.println("Hello Hi");
			}
			
		

	}

}
