public class Percentage {

	public static void main(String[] args) 
{
		int array[]= {80,96,88,91,79};
		float percent=0;
		float sum=0;
		for(int num:array)
			sum=sum+num;
		percent=(sum*100)/500;
		System.out.println("Percentage is:"+percent);	
		}
		


}