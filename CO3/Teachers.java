import java.util.*;
class Person{
	public String Name;
	public String Gender;
	public String Address;
	public int Age;
	Person(String pname,String pgender,String paddress,int page){

		Name=pname;
		Gender=pgender;
		Address=paddress;
		Age=page;
	}
}
class Employee extends Person{
	public int Empid;
	public String Cname;
	public String Qualification;
	public int Salary;
	Employee(String pname,String pgender,String paddress,int page,int eid,String com_name,String qual,int sal){

		super(pname,pgender,paddress,page);
		Empid=eid;
		Cname=com_name;
		Qualification=qual;
		Salary=sal;
	}
}
public class Teachers extends Employee{
	public String Subject;
	public String Department;
	public int Tid;
	Teachers(String pname,String pgender,String paddress,int page,int eid,String com_name,String qual,int sal,String sub,String dep,int tid){

		super(pname,pgender,paddress,page,eid,com_name,qual,sal);
		Subject=sub;
		Department=dep;
		Tid=tid;
	}

	void display(){
		System.out.println("Name: "+Name);
		System.out.println("Gender: "+Gender);
		System.out.println("Address: "+Address);
		System.out.println("Age: "+Age);
		System.out.println("Employee Id: "+Empid);
		System.out.println("Company Name: "+Cname);
		System.out.println("Qualification: "+Qualification);
		System.out.println("Salary: "+Salary);
		System.out.println("Subject: "+Subject);
		System.out.println("Department: "+Department);
		System.out.println("Teacher ID: "+Tid);
	
	}	

public static void main(String[] args) {
		int i;
		Teachers[] obj=new Teachers[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of teacher details you like to enter");
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("Enter the name of the teacher "+i);
			String a=sc.nextLine();
			a=sc.nextLine();
			System.out.println("Enter the gender of the teacher "+a);
			String b=sc.nextLine();
			System.out.println("Enter the address of the teacher "+a);
			String c=sc.nextLine();
			System.out.println("Enter the age of the teacher "+a);
			int d=sc.nextInt();
			System.out.println("Enter the employee id of the teacher "+a);
			int e=sc.nextInt();
			System.out.println("Enter the company name of the teacher "+a);
			String f=sc.nextLine();
			f=sc.nextLine();
			System.out.println("Enter the qualification of the teacher "+a);
			String g=sc.nextLine();
			System.out.println("Enter the salary of the teacher "+a);
			int h=sc.nextInt();
			System.out.println("Enter the subject of the teacher "+a);
			String j=sc.nextLine();
			j=sc.nextLine();
			System.out.println("Enter the department of the teacher "+a);
			String k=sc.nextLine();
			System.out.println("Enter the teacher id of the teacher "+a);
			int l=sc.nextInt();
			obj[i]=new Teachers(a,b,c,d,e,f,g,h,j,k,l);
		}
		for(i=1;i<=n;i++) {
			System.out.println("-------Teacher Details--------");
			System.out.println();
			System.out.println("**"+i+"**");
			System.out.println();
			obj[i].display();
			
			
		}

	}

}


 
	
	