package logicalPara;

	import java.util.Scanner;//importing the scanner

	public class ParaClass {
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			 int num1,num2,num3, num4 ;
		     
			 int sum=0;
			 String operator = null ;
			 
			 Scanner in=new Scanner(System.in);
		 
			//The program will ask for numbers and it will print the results of number1 until number4
			 System.out.println("enter number1");
			 num1=in.nextInt();// It will ask the user to prompt in a number
			 
			 System.out.println("enter number2");
			 num2=in.nextInt();
			 
			 System.out.println("enter number3");
			 num3=in.nextInt();
			 
			 System.out.println("enter number4");
			 num4=in.nextInt();
			 
			 System.out.println("enter an operator");
			 operator =in.next();
			 
			 
			 // This is a switch statement that will calculate numbers
			 switch (operator){
			 
			 case "+":
				 sum=(num1+num2+num3+num4);// It is going to add numbers
				 break;
			 case "*":
				 sum=num1*num2*num3*num4;//Multiplication of numbers entered
				 break;
			 case "/":
				 sum=num1/num2/num3/num4;// Its going to add numbers entered
				 break;
			 case "-":
				 sum=num1-num2-num3-num4;// its going to Subtract numbers entered
				 
			 }
			 
			 //This SOP is going to print the sum  on a scanner
				System.out.println("your result is " + sum);
				
				
				// If statement that determines if the answer is correct or wrong
				//The answer must be greater than or equals to 50. 
	if	(sum>=50)  {
		
		
		  System.out.println(sum==50 ? "Answer is right " : "The answer is wrong "  ) ;//Ternary 
		 
	 }else 
	      System.out.println("The answer is wrong "); //Its going to print that the answer is wrong because the answer will be less than 50
		  
		}
		
	}






