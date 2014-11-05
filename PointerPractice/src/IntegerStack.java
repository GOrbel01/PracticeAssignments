/**
 * Created by Squall on 04/11/2014.
 */
public class IntegerStack implements IntegerStackInterface
{
        private IntStackNode head;

        public void push(int newNodeValue)
        {
            IntStackNode newNode = new IntStackNode(newNodeValue);
            if (head != null)
            {
                newNode.setNext(head);
            }
            head = newNode;
        }

        public int pop()
        {
            if (head == null)
            {
                return 0;
            }
            int result = head.getValue();
            head = head.getNext();
            return result;
        }

        public int peek()
        {
            if (head == null)
            {
                return 0;
            }
            else
            {
                return head.getValue();
            }
        }

        public boolean isEmpty()
        {
            if (head == null)
            {
                return true;
            }
            return false;
        }
}
