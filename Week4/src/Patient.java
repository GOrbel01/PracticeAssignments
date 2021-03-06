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
            return false;
        }
        else if (this.nextPatient.name.equals(patient.name))
        {
            this.nextPatient = nextPatient.nextPatient;
            return true;
        }
        else
        {
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

    public int listLength()
    {
        int count = 0;
        Patient aux = this;
        while (aux.nextPatient != null)
        {
            aux = aux.nextPatient;
            count++;
        }
        if (aux.nextPatient == null)
        {
            count++;
        }
        return count;
    }
}
