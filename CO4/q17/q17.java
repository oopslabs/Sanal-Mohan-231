package CO4Q17;
import java.util.*;
public class q17 {
    public static void main(String args[])
    {
        Map<Integer, String> hm2= new HashMap<Integer, String>();
        hm2.put(new Integer(1), "Hey");
        hm2.put(new Integer(2), "Hai");
        hm2.put(new Integer(3), "Hello");

        System.out.println(hm2);
        hm2.put(new Integer(2), "Hii");
        System.out.println(hm2);

        hm2.remove(new Integer(1));
        System.out.println(hm2);
    }
}
