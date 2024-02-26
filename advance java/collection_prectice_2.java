import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class collection_prectice_2 {
    public static void main(String[] args) {
        Vector<String> arraylist = new Vector<>();
        System.out.println(arraylist);

        arraylist.add("arraylist1");
        arraylist.add("arraylist2");
        arraylist.add("arraylist3");
        arraylist.add("arraylist4");
        arraylist.add("arraylist5");
        arraylist.add("arraylist6");

        Iterator<String> val = (Iterator<String>) arraylist.iterator();

        while (val.hasNext()) {
            System.out.println(val.next());
        }
        System.out.println("enumretion............");
        Enumeration<String> e = arraylist.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        System.out.println(arraylist);
    }
}
