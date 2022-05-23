import java.util.*;
interface student{
	String name="Sanal";
	int mark1=100;
	
}
interface sports{
	int sportm=100;
	String sport="Football";
	
	
}
public class Result implements student,sports{
	
	void display() {
		System.out.print(" Name: "+name+"\n Acadamic mark: "+mark1+"\n Sport :"+sport+"\n Sport mark :"+sportm);
		
	}

	public static void main(String args[]) {
		
		Result res=new Result();
		
		System.out.println("-------Student  Details--------");
		res.display();
		
		

	}

}