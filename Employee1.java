class Employee1
{
	String name;
	String address;
	
	static String company_name;
	static int salary;

	void displaydata()
	{
	 System.out.println(name +" "+address);
	}

	static String completedTargets()
	{ 
	return "completed targets quickly" ;
 	}

	void AttendingMeetings(String s)
	{
		System.out.println(s);
	}

public static void main (String[]args)
{
Employee1 e1=new Employee1();
Employee1 e2=new Employee1();
Employee1 e3=new Employee1();
e1.address="ambernath";
e1.name="Swapnali";

e2.address="ambernath";
e2.name="Sneha";

e3.address="ambernath";
e3.name="Monu";

e1.displaydata();
e2.displaydata();
e3.displaydata();
System.out.println();
}
}