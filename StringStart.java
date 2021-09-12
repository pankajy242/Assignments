import java.util.Scanner;
public class StringStart {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter any string : ");
	     String s = sc.nextLine();
		if(s.startsWith("A") || s.startsWith("a") && s.endsWith("T") || s.endsWith("t"))
		{
			System.out.println("The String starts with A/a and ends with T/t");
		}
		else
		{
			System.out.println("The String dosent starts with A/a and end with T/t");
		}
	}
}