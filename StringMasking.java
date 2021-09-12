public class StringMasking {

	public static void main(String[] args){

		 String str = "PANKAJ KUMAR";
		 String[] array = str.split(" ");
		 String newString = "";
		 int n=array.length;
		 
		 for(int i=0;i<n;i++) 
		 {
			 for(int j=0;j<array[i].length();j++)
			 {
				if(j>1) 
				{
					newString=newString+"X";
				}
				else
				{
					char s=array[i].charAt(j);
					newString=newString+s;
				}
				
		 }
			 newString=newString+" ";
		 }
		 	 System.out.println("Original String is:\t"+str);
			 System.out.println("Masked String is\t"+newString);
		 
	}
	