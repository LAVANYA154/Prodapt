package test;
class Emp_Reference 
{ 
public static void main(String[]args) 
{ 
Reference ob=new Reference();
ob.setid(10);
ob.setname("RAGZ");
System.out.println("hello "+ob.getid()+" "+ob.getname()); 

System.out.println(ob.toString());

Reference obj=new Reference();

obj.display(ob); 

obj.display(obj);


}
}