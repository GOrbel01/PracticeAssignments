/**
 * Created by Cloud on 04/11/2014.
 */
public class IntegerStackScript {
    public static void main(String[] args)
    {
        IntegerStackScript iscr = new IntegerStackScript();
        iscr.launch();
    }

    public void launch()
    {
        IntegerStack intStack = new IntegerStack();
        testStack(intStack);
    }
    
    public void testStack(IntegerStackInterface stack)
    {
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
}
