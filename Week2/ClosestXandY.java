import java.util.Scanner;
public class ClosestXandY
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
        Point pointOne = new Point();
        Point pointTwo = new Point();
        Point pointThree = new Point();
        int commaIndex = 0;
        String str1 = "";
        for (int i = 1; i <= 3; i++)
        {  
            str1 = "";
            System.out.println("Enter Coordinates for point " + i + " in the form x,y");
            str1 = System.console().readLine();
            if (i == 1)
            {
                 setValues(pointOne, str1);
            }
            if (i == 2)
            {
                 setValues(pointTwo, str1);                                                      
            }
            if (i == 3)
            {
                 setValues(pointThree, str1);                                                      
            }

        }
        
        if (getDistance(pointOne) < getDistance(pointTwo))
        {
            if (getDistance(pointOne) < getDistance(pointThree))
            {
                System.out.println("Point One's Distances are the Closest!");
            }
        }
        else if (getDistance(pointTwo) < getDistance(pointThree))
        {
            if (getDistance(pointTwo) < getDistance(pointOne))
            {
                System.out.println("Point Two's Distances are the Closest");
            }
        }
        else
        {
            System.out.println("Point Three's Distances are the Closest");
        }
        
        } private static double getDistance(Point p)
        {
            if (p.x > p.y)
            {
                return p.x - p.y;
            }
            else
            {
                return p.y - p.x;
            }
        }
                                      
         private static void setValues(Point p, String str1)
        {
            String firstPart;
            String secondPart;
            
            int commaIndex = str1.indexOf(",");
            firstPart = str1.substring(0, commaIndex);

            double xValOne = Double.parseDouble(firstPart);
           
            secondPart = str1.substring(commaIndex+1, str1.length());
            double xValTwo = Double.parseDouble(secondPart);
            
            p.x = xValOne;
            p.y = xValTwo;
        }
        
        }

class Point {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
            double x;
            double y;
            
            public void setX(double a)
            {
                x = a;
            }
            
            public void setY(double b)
            {
                y = b;
            }
        }
