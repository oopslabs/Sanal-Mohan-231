import java.util.*;
interface total{
	void calculate();
}
class assign implements total{
	Scanner sc=new Scanner(System.in);
	int productid;
	String name;
	int Quantity;
	int unitprice;
	int total;
	assign(){
		System.out.println("Enter the product id");
		productid=sc.nextInt();
		System.out.println("Enter the name");
		name=sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter the Quantity");
		Quantity=sc.nextInt();
		System.out.println("Enter the unit price");
		unitprice=sc.nextInt();
	}
	public void calculate() {
		total=Quantity*unitprice;
	}
	void display() {
		System.out.println(productid+"\t"+name+"\t"+Quantity+"\t"+unitprice+"\t"+total);
	}
	
}
public class bill {

	public static void main(String[] args) {
		assign[] obj=new assign[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the orderno");
		int orderno=sc.nextInt();
		System.out.println("Enter the Date");
		String date=sc.nextLine();
		date=sc.nextLine();
		System.out.println("Enter no of product ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			obj[i]=new assign();
			obj[i].calculate();
			
		}
		System.out.println("OrderNo. "+orderno+"\n\n");
		System.out.println("Date. "+date);
		System.out.println("Product Id\tName\tQuantity\tPrice\tTotal");
		System.out.println("************************************************");
		for(int i=0;i<n;i++) {
			obj[i].display();
		}
		System.out.println("************************************************");
	}

}