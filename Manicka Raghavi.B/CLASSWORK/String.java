	
public class String
{
    
    
	public static void main(String[] args) 
	{
	    String str="ABC";
        String str1="ABC";
        
	    System.out.println("str: "+str); 
	    System.out.println("str1: "+str1); 
	    
	    if(str==str1)
	    System.out.println("Both the strings have same address"); 
	    
	    if(str.equals(str))
	    System.out.println("Both the strings have same value"); 
	    
	    System.out.println("str: hashcode "+str.hashCode()); 
	    System.out.println("str1: hashcode "+str1.hashCode()); 
	    
	    System.out.println("str: toString() "+str.toString()); 
	    System.out.println("str1: toString() "+str1.toString());
	    
	}
}