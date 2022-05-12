import java.util.*;
class Employee{
	public int empid;
	public String name;
	public int salary;
	public String address;
	Employee(int emp,String empname,int empsalary,String empaddress){
		empid=emp;
		name=empname;
		salary=empsalary;
		address=empaddress;
	}
}
public class teacher extends Employee {
	String department;
	String subjects;

	teacher(int emp,String empname,int empsalary,String empaddress,String dep,String sub) {
		super(emp,empname,empsalary,empaddress);
		department=dep;
		subjects=sub;
		
	}
	void display() {
		System.out.println("Teacher id: "+empid);
		System.out.println("Teacher name: "+name);
		System.out.println("Teacher salary: "+salary);
		System.out.println("Teacher address: "+address);
		System.out.println("Teacher department: "+department);
		System.out.println("Teacher subject: "+subjects);
	}

	public static void main(String[] args) {
		teacher[] obj = new teacher[10];
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teacher : ");
        int n = sc.nextInt();
        System.out.println("Enter details of each teacher : ");

        for (int i = 1; i <= n; ++i) {

            
            System.out.println("Enter details of teacher " + i);
            System.out.println("Enter teacher id ");
            int a = sc.nextInt();
           
            System.out.println("Enter teacher name ");
            String b = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter salary ");
            int c = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter address ");
            String d = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter department ");
            String e = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter subjects ");
            String f = sc.nextLine();
            sc.nextLine();
	    obj[i] = new teacher(a,b,c,d,e,f);
        }
        System.out.println("-----------Teacher Details--------------");
        for (int i = 1; i <= n; ++i) {
        	obj[i].display();
        	
        }
	}

}