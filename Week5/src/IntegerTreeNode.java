/**
 * Created by Squall on 27/10/2014.
 */
public class IntegerTreeNode {
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;

    public IntegerTreeNode(int newNum)
    {
        this.value = newNum;
    }

    public void add(int newNumber)
    {
        if (newNumber > this.value)
        {
            if (right == null)
            {
                right = new IntegerTreeNode(newNumber);
            }
            else
            {
                right.add(newNumber);
            }
        }
        else
        {
            if (left == null)
            {
                left = new IntegerTreeNode(newNumber);
            }
            else
            {
                left.add(newNumber);
            }
        }
    }

    public boolean contains(int n)
    {
        if (n == this.value)
        {
            return true;
        }
        else if (n > this.value)
        {
            if (right == null)
            {
                return false;
            }
            else
            {
                return right.contains(n);
            }
        }
        else
        {
            if (left == null)
            {
                return false;
            }
            else
            {
                return left.contains(n);
            }
        }
    }

    public int getMin()
    {
        if (this.left == null)
        {
            return this.value;
        }
        else
        {
            return left.getMin();
        }
    }

    public int getMax()
    {
        if (this.right == null)
        {
            return this.value;
        }
        else
        {
            return right.getMax();
        }
    }

    public int depth()
    {
        int result = 0;
        if (this.right == null && this.left == null)
        {
            result = 0;
        }
        else if (this.right != null && this.left == null)
        {
            result = 1 + this.right.depth();
        }
        else if (this.right == null && this.left != null)
        {
            result = 1 + this.left.depth();
        }
        else
        {
            int lDepth = this.left.depth();
            int rDepth = this.right.depth();
            if (lDepth > rDepth)
            {
                result = 1 + lDepth;
            }
            else
            {
                result = 1 + rDepth;
            }
        }
        return result;
    }

    public String toString()
    {
        if (this.left != null && this.right != null)
        {
            return this.left.toString() + "[" + " L " + this.value + "]" + "[ " + " R " + this.right.toString();
        }
        if (this.left == null && this.right == null)
        {
            return "["+this.value+"]";
        }
        if (this.left != null && this.right == null)
        {
            return this.left.toString() + "[" + " L " + this.value + "]";
        }
        if (this.left == null && this.right != null)
        {
            return "[" + this.value + " R " + "]" + this.right.toString();
        }
        return "";
    }


}
