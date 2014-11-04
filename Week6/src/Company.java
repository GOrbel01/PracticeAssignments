/**
 * Created by Squall on 03/11/2014.
 */
public class Company {

    public static void main(String[] args)
    {
        Company bank = new Company();
        bank.launch();
    }

    public void launch()
    {
        GenericList<String> nameList = new GenericList<String>();
        GenericList<Integer> niNumberList = new GenericList<Integer>();

        nameList.add("Bill");
        nameList.add("Ben");
        nameList.add("James");
        nameList.add("Tom");

        nameList.printBackToFront();

        niNumberList.add(223453);
        niNumberList.add(444555);

        nameList.remove(1);

        nameList.printBackToFront();

        System.out.println(nameList.getFirst().getNext().getPrevious().getValue());
//        System.out.println(nameList.getFirst().getNext().getNext().getNext().getPrevious().getValue());
        System.out.println(niNumberList.getFirst().getNext().getValue());
    }

}
