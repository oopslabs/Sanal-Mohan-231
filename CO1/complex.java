public class complex {
	int r,i,x,y;
	complex(int real,int img)
	{
		r=real;
		i=img;
	}
	void display()
	{
		System.out.println(r+"+"+"i"+i);
	}

	public static void main(String[] args) {
		complex a=new complex(2,3);
		complex b=new complex(4,5);
		complex c=new complex(0,0);
		System.out.println("the first complex number");
		a.display();
		System.out.println("the second complex number");
		b.display();
		c.r=a.r+b.r;
		c.i=a.i+b.i;
		System.out.println("Sum is:");
		System.out.println(c.r+"+"+"i"+c.i);
		

	}

}
