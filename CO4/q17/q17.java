package CO4Q17;
import java.util.*;
public class q17 {
    public static void main(String args[])
    {
        Map<Integer, String> hm2= new HashMap<Integer, String>();
        hm2.put(new Integer(1), "How");
        hm2.put(new Integer(2), "are");
        hm2.put(new Integer(3), "You");

        System.out.println(hm2);
        hm2.put(new Integer(2), "Everyone");
        System.out.println(hm2);

        hm2.remove(new Integer(1));
        System.out.println(hm2);
    }
}
