 import java.util.*;
 class studentexception extends Exception{

 }
 public class studlist {
    int rollno;
    String Name;
    int mark1;
    int mark2;
    int mark3;
    int percentage=(mark1+mark2+mark3)/3;
    public studlist(int rno,String sname,int m1,int m2,int m3,int perc){
        rollno=rno;
        Name=sname;
        mark1=m1;
        mark2=m2;
        mark3=m3;
        percentage=perc;
    }
    
    try{
        if(percentage<40){
            throw new Exception("Failed");
        }
        else{
            System.out.println("Passed");
        }
    }
    catch (Exception e) {
        System.out.println("Exception occures"+e.getMessage());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        studlist obj=new studlist();
        System.out.println("Enter the rollno: ");
        int a=sc.nextInt();
        System.out.println("Enter the Name: ");
        String b=sc.nextLine();
        System.out.println("Enter three marks: ");
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        obj.studlist(a,b,c,d,e);




    }
   
 }
