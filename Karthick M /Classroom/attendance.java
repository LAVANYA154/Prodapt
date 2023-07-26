class attendance
{

 void markattend()
 {
 System.out.println("Mass bunk");
 }

void markattend(String...s)
{
 System.out.println(s.length+" "+"student Present");
 for(String name:s)
 {
  System.out.println(name);
 }
}

public static void main(String a[])
{
 attendance obj=new attendance();
 obj.markattend();
 obj.markattend("karthick","fazil","lenin");
}
}