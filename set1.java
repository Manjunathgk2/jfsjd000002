import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set1 {
    public static void main(String[] args) {
        //HashSet<Integer> h = new HashSet<>();
//        TreeSet<Integer> h = new TreeSet<>();
        //Hashset
//        h.add(8);
//        h.add(13);
//        h.add(31);
//        h.add(15);
//        System.out.println(h);
//        h.remove(13);
//        System.out.println(h);
//        System.out.println(h.size());
//        System.out.println(h.contains(16));
//        System.out.println(h.isEmpty());
//        h.clear();
//        System.out.println(h);
        //Treeset
//        h.add(5);
//        h.add(20);
//        h.add(15);
//        h.add(10);
//        System.out.println(h);
//        System.out.println(h.first());
//        h.removeFirst();
//        System.out.println(h);
//        System.out.println(h.contains(16));
//        System.out.println(h.pollLast());
//        System.out.println(h);
//        h.add(45);
//        h.add(3);
//        h.higher(5);
//        System.out.println(h);
//        h.lower(10);
//        System.out.println(h);
//        System.out.println(h.floor(25));
//        System.out.println(h.size());
//        h.clear();
//        System.out.println(h.isEmpty());
        //LinkedHashSet
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        l.add(23);
        l.add(22);
        l.add(45);
        l.add(51);
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        System.out.println(l.getLast());
        System.out.println(l.reversed());
        System.out.println(l.contains(51));
        System.out.println(l.size());
        l.clear();
        System.out.println(l);
    }
}
