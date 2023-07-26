class Dem
{
 String str="Fazil";
}
 
class Test extends Dem
{
 String str1="Karthick";
}

class Main
{
 public static void main(String a[])
 {
  Dem d = new Dem();
  
  Dem d1 = new Test();
  System.out.println(d1.str1);
 }
}