public class ReverseNumber {
	public static void main(String[] args)   
	{  
	int number = 987654, reverse = 0;  
	while(number != 0)   
	{  
	int remaindr = number % 10;  
	reverse = reverse * 10 + remaindr;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  }



