import java.util.*;
public class Student {
    int student_id;
    String student_name;
    String branch;
    public Student(int sid,String sname,String br){
        student_id=sid;
        student_name=sname;
        branch=br;
    }
    void display(){
        System.out.println("Student ID: "+student_id);
        System.out.println("Student Name: "+student_name);
        System.out.println("Branch of Study: "+branch);
    }
    public static void main(String[] args){
        int i;
        Student[] stud = new Student[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            System.out.println("Enter the details of student:"+i);
            System.out.println("Enter the student ID");
            int a=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the student Name");
            String b=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the branch of Study");
            String c=sc.nextLine();
            stud[i]=new Student(a,b,c);
        }
        System.out.println("---Student Details---");
        for(i=1;i<=n;i++){
            System.out.println("Student "+i);
            stud[i].display();
            System.out.println();
        }
    }
}
