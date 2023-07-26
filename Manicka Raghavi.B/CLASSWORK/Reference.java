package test;
class Reference 
{ 
private int empid;
private String ename;

Reference() 
{ 
 empid=100;
 ename="hello";
} 
int getid()
{ 
return empid;
}

String getname() 
{ 
return ename;
}

void setid(int id) 
{ 
empid=id;
}
void setname(String name) 
{ 
ename=name;  
} 

public String toString()
{ 
return("FROM TOSTRING "+empid+" "+ename);
}
void display(Reference e) 
{ 
System.out.println("DISPLAY METHOD "+ e);
}

}
