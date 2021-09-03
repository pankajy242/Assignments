public class FiveScores {

	  public static void main(String arg[])
	  {
	    int n=5,avg=0,perc;
	 
	    int a[]=new int[n];
	 
	    a[0]=20;
	 
	    a[1]=40;
	 
	    a[2]=50;
	 
	    a[3]=60;
	 
	    a[4]=70;
	 
	    for(int i=0;i<n;i++)
	 
	    avg=avg+a[i];
	    
	 
	    System.out.println("average of  ("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+")  is ="+ avg/n);
	   
	 
	  }
}
