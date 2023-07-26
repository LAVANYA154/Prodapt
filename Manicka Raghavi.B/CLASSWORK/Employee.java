class Employee
{ 
int empid=101;

public static void main(String []args) 
{ 
 Employee object=new Employee(); 
 
 object.empid=200;  
 object.display(); 

 Employee object1=new Employee(); 
 object1.display();
 object1.empid=222;
 object1.display(); 

} 
void display() 
{ 
System.out.println(empid);
}

}
