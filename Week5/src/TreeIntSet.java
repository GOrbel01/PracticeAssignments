/**
 * Created by Squall on 27/10/2014.
 */
public class TreeIntSet implements IntSet{

    private int value;
    private TreeIntSet right;
    private TreeIntSet left;

    public TreeIntSet(int val)
    {
        this.value = val;
    }

    public void add(int i)
    {
        if (i > this.value)
        {
            if (this.right == null)
            {
                this.right = new TreeIntSet(i);
            }
            else
            {
                this.right.add(i);
            }
        }
        else
        {
            if (this.left == null)
            {
                this.left = new TreeIntSet(i);
            }
            else
            {
                this.left.add(i);
            }
        }
    }

    public boolean contains(int i)
    {
        if (i == this.value)
        {
            return true;
        }
        else if (this.value > i)
        {
            if (this.right == null)
            {
                return false;
            }
            else
            {
                return right.contains(i);
            }
        }
        else
        {
            if (this.left == null)
            {
                return false;
            }
            else
            {
                return left.contains(i);
            }
        }
    }

    public boolean containsVerbose(int i)
    {
        if (i == this.value)
        {
            return true;
        }
        else if (this.value > i)
        {
            if (this.right == null)
            {
                return false;
            }
            else
            {   System.out.println("Value R Checked: " + this.value);
                return right.containsVerbose(i);
            }
        }
        else
        {
            if (this.left == null)
            {
                return false;
            }
            else
            {
                System.out.println("Value Checked L" + this.value);
                return left.containsVerbose(i);
            }
        }
    }

    public String toString()
    {
        if (this.left == null && this.right == null)
        {
            return this.left.toString() + ", " + this.right.toString();
        }
        else if (this.left == null && this.right != null)
        {
            return ", " + this.right.toString();
        }
        else if (this.left != null && this.right == null)
        {
            return ", " + this.left.toString();
        }
        else
        {
            return "";
        }
    }

}
