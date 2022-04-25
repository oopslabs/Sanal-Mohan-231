import java.util.Arrays;
public class sortstring {

	public static void main(String[] args) {
		String[] people= {"Manu","Akhil","Vaishak","Sreelakshmi"};
		Arrays.sort(people);
		for(String elements:people)
		{
			System.out.println(elements);
		}

	}

}