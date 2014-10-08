import java.util.Scanner;
public class MailServer
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
boolean done = false;
boolean validCommandEntered = false;
boolean isValid = false;
int progress = 0;
MailInfo mail = new MailInfo();

while (!done)
{
        isValid = false;
        System.out.println("Commands: MAIL FROM, RCPT FROM, DATA, QUIT");
        System.out.print(">>>");
        String command = System.console().readLine();
        if (command.equalsIgnoreCase("QUIT"))
        {           
            done = true;
        }
        if ((command.equalsIgnoreCase("MAIL FROM")) || (command.equalsIgnoreCase("RCPT FROM") && progress >= 1))
        {
            while (!isValid)
            {
                System.out.print(">>> " + command + ":");
                if (command.equalsIgnoreCase("MAIL FROM"))
                {
                    mail.mailFrom = System.console().readLine();
                    if (mail.mailFrom.contains("@"))
                    {
                        if (!(mail.mailFrom.substring(0, 1).equals("@") || mail.mailFrom.substring(mail.mailFrom.length()-1).equals("@")))
                        {
                            System.out.println("OK");
                            isValid = true;
                        }
                        else
                        {
                            System.out.println("Invalid Email Address");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Email Address");
                    }
                    if (progress == 0 && isValid == true)
                    {
                        progress++;
                    }
                }
                
                else if (command.equalsIgnoreCase("RCPT FROM"))
                {
                    mail.rcptFrom = System.console().readLine();
                    if (mail.rcptFrom.contains("@"))
                    {
                        if (!(mail.rcptFrom.substring(0, 1).equals("@") || mail.rcptFrom.substring(mail.rcptFrom.length()-1).equals("@")))
                        {
                            System.out.println("OK");
                            isValid = true;
                        }
                        else
                        {
                            System.out.println("Invalid Email Address");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Email Address");
                    }
                    if (progress == 1 && isValid == true)
                    {
                        progress++;
                    }    
                }
            }
        }
        else if  ((command.equalsIgnoreCase("DATA") && progress >= 2))
        {
            System.out.print(">>> " + command + ":");
            System.out.println();
            String tempMail = "";               
            while (!(tempMail.equals(".")))
            {
                tempMail = System.console().readLine();
                if (!tempMail.equals("."))
                {
                    if (!mail.emailContents.equals(""))
                    {
                        mail.emailContents = mail.emailContents + "\n" + tempMail;
                    }
                    else
                    {
                        mail.emailContents = mail.emailContents + tempMail;
                    }
                }
            }                    
            System.out.println("Sending Email...");
            System.out.println("From: " + mail.mailFrom);
            System.out.println("To: " + mail.rcptFrom);
            System.out.println(mail.emailContents);
            System.out.println("...Done");           
        }
        else
        {
            if (!(command.equalsIgnoreCase("QUIT")))
            {
                System.out.println("Invalid Command");
            }
        }
}
System.out.println("Bye!");

}}

class MailInfo
{private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
    String rcptFrom = "";
    String mailFrom = "";
    String emailContents = "";
}
