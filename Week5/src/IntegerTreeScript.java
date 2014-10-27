/**
 * Created by Squall on 27/10/2014.
 */
public class IntegerTreeScript {
    public static void main(String[] args)
    {
        TreeIntSet start = new TreeIntSet(4);

        start.add(3);
        start.add(4);
        start.add(5);
        start.add(7);
        start.add(8);
        start.add(9);
        start.add(10);
        start.add(11);
        start.add(12);
        start.add(4);

        System.out.println(start.contains(11));
        System.out.println(start.containsVerbose(11));

//        System.out.println(start.getMax());
//        System.out.println(start.getMin());

        System.out.println(start);
//        System.out.println(start.depth());
    }
}
