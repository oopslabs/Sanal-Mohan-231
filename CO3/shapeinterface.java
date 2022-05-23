import java.util.*;
interface areaperimeter{
	double pi=3.14;
	void getdata();
	void perimeter();
	void area();
}
class circle implements areaperimeter{
	double r;
	Scanner sc=new Scanner(System.in);
	public void getdata() {
		System.out.println("Enter the radius of the circle");
		r=sc.nextDouble();
	}
	public void perimeter() {
		System.out.println("The perimeter of the circle is:	"+(2*pi*r));
	}
	public void area() {
		System.out.println("The area the circle is:	"+(pi*r*r));
	}
	
}
class rectangle implements areaperimeter{
	int l;
	int b;
	Scanner sc=new Scanner(System.in);
	public void getdata() {
		System.out.println("Enter the length of the rectangle");
		l=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		b=sc.nextInt();
	}
	public void perimeter() {
		System.out.println("The perimeter of the rectangle is	:"+(2*(l+b)));
	}
	public void area() {
		System.out.println("The area the rectangle is	:"+(l*b));
	}
	
}
public class shapeinterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		circle c=new circle();
		rectangle re=new rectangle();
		System.out.println("1.circle\n2.rectangle\nEnter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:	c.getdata();
				System.out.println("---Circle details---");
				c.perimeter();
				c.area();
				break;
		case 2:	re.getdata();
				System.out.println("---Rectangle details---");
				re.perimeter();
				re.area();
		}
		
	}

}