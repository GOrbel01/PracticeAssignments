/**
 * Created by Squall on 20/10/2014.
 */
public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;

    public Patient(String name, int age, String illness)
    {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }

    public void addPatient(Patient newPatient)
    {
        if (this.nextPatient == null)
        {
            this.nextPatient = newPatient;
        }
        else
        {
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient patient)
    {
        if (this.nextPatient == null)
        {
            System.out.println("I am in this Loop");
            return false;
        }
        else if (this.nextPatient.name.equals(patient.name))
        {
            System.out.println("I am in an awesome Loop");
            this.nextPatient = nextPatient.nextPatient;
            return true;
        }
        else
        {
            System.out.println("I am in this sucky Loop");
            return this.nextPatient.deletePatient(patient);
        }
    }

    public void printPatient()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Illness: " + illness);
        System.out.println();
        if (this.nextPatient != null)
        {
            nextPatient.printPatient();
        }
    }

    public int listLengthRecursive()
    {
        int count = 0;
        if (this.nextPatient == null)
        {
            count++;
            return count;
        }
        else
        {
            nextPatient.listLengthRecursive();
        }
        return count;
    }

    public int listLength()
    {
        boolean done = false;
        Patient pIndex = this.nextPatient;
        int count = 0;
        while (!done)
        {
            if (this.nextPatient != null)
            {
                System.out.println("Always Here");
                count = count + 1;
            }
            if (this.nextPatient == null)
            {
                System.out.println("Never ReachMe");
                count = count + 1;
                done = true;
            }
        }
        return count;
    }
}
