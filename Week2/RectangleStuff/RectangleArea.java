import java.util.Scanner;
public class RectangleArea
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
boolean done = false;
Rectangle rec = new Rectangle();
Point tlTemp = new Point();
Point drTemp = new Point();

while (!done)
{
    System.out.println("Enter The Upper-Left Coordinates for the Rectangle");
    String upLeftString = System.console().readLine();
    System.out.println("Enter the Lower-Right Coordinates for the Rectangle");
    String lowRightString = System.console().readLine();

    int commaIndexUL = upLeftString.indexOf(",");
    int commaIndexLR = lowRightString.indexOf(",");
    tlTemp.x = Double.parseDouble(upLeftString.substring(0, commaIndexUL));
    tlTemp.y = Double.parseDouble(upLeftString.substring(commaIndexUL+1, upLeftString.length()));
    drTemp.x = Double.parseDouble(lowRightString.substring(0, commaIndexLR));
    drTemp.y = Double.parseDouble(lowRightString.substring(commaIndexLR+1, lowRightString.length()));
    
    rec.setUpLeft(tlTemp);
    rec.setDownRight(drTemp);
        
    if ((rec.upLeft.x == rec.downRight.x) && (rec.upLeft.y == rec.downRight.y))
    {
        done = true;
    }
    else
    {
        System.out.println("It is not a valid Rectangle FOOL!");
    }
}
double area = (rec.upLeft.x * rec.upLeft.y);
double perimiter = (rec.upLeft.x + rec.upLeft.y + rec.downRight.x + rec.downRight.y);
System.out.println("Area is " + area);
System.out.println("Perimiter is " + perimiter);


}}

class Rectangle {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
    Point upLeft;
    Point downRight;
    
    public void setUpLeft(Point a)
    {
        upLeft = a;
    }
    
    public void setDownRight(Point a)
    {
        downRight = a;
    }
}
