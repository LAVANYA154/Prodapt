import java.util.*;
class Greatest_Number 
{
 
public static void main(String[]args)
{
int n1,n2,n3,n4,n5;
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
n4=sc.nextInt();
n5=sc.nextInt();

if(n1>n2 && n1>n3 && n1>n4 && n1>n5) 
System.out.print("n1 greatest");

else if(n2>n1 && n2>n3 && n2>n4 && n2>n5) 
System.out.print("n2 greatest");

else if(n3>n1 && n3>n2 && n3>n4 && n3>n5) 
System.out.print("n3 greatest");

else if(n4>n1&& n4>n2 && n4>n3 && n4>n5) 
System.out.print("n4 greatest"); 

else
System.out.print("n5 greatest");


}
}