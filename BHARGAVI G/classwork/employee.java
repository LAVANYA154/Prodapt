class employee
{
	private int eid;
	private String eName;
	private long salary;
public void seteid(int id)
{
	eid=id;
}
public int geteid()
{
return eid;
}
public void seteName(String name)
{
	eName=name;
}
public String geteName()
{
return eName;
}
public void setsalary(long sal)
{
	salary=sal;
}
public long getsalary()
{
return salary;
}

public String toString()
{
return eid +" " +eName+" " +salary;
}
public void emp(employee...data)
{
for(employee d:data)
{
System.out.println(d);
}
}
}

