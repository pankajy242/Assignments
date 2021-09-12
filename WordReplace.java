public class WordReplace {

public static void main(String args[])
	{

		String s="C is Object Oriented. C is Programming Language.";
		String oldString="C";
		String newString="Java";
	    
	    StringBuilder sb = new StringBuilder();
	    int i;
	    int prev = 0;
	    while( (i = s.indexOf(oldString, prev)) >= 0 )
	    {
	        sb.append( s.substring(prev, i) ).append( newString );
	        prev = i + oldString.length();
	    }
	    sb.append(s.substring(prev));
	    System.out.println(sb.toString());
	}
	}