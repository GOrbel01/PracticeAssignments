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
        GenericList<Character> charList = new GenericList<Character>();

        Character zidane = new Character("Zidane", 150, 10);
        Character squall = new Character("Squall", 200, 4);
        Character cloud = new Character("Cloud", 180, 5);

        nameList.add("Bill");
        nameList.add("Ben");
        nameList.add("James");
        nameList.add("Tom");
        nameList.add("Iain");
        nameList.add("Jacob");

        charList.add(zidane);
        charList.add(squall);
        charList.add(cloud);

        Character first = (Character) charList.getFirst().getValue();
        System.out.println(first.getName());

        nameList.printBackToFront();

        niNumberList.add(223453);
        niNumberList.add(444555);

        System.out.println(nameList.get(2).getValue());

        nameList.printBackToFront();

        System.out.println(nameList.getFirst().getNext().getPrevious().getValue());
//        System.out.println(nameList.getFirst().getNext().getNext().getNext().getPrevious().getValue());
        System.out.println(niNumberList.getFirst().getNext().getValue());
    }

}
