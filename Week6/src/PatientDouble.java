/**
 * Created by Squall on 22/10/2014.
 */
public class PatientDouble {
    private String name;
    private int age;
    private String illness;
    private PatientDouble nextPatientDouble;
    private PatientDouble previousPatientDouble;

    public PatientDouble(String name, int age, String illness)
    {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatientDouble = null;
        this.previousPatientDouble = null;
    }

    public void addPatientDouble(PatientDouble newPatientDouble)
    {
        if (this.nextPatientDouble == null)
        {
//            if (this.previousPatientDouble == null)
//            {
                newPatientDouble.previousPatientDouble = this;
//            }
            this.nextPatientDouble = newPatientDouble;
        }
        else
        {
            this.nextPatientDouble.addPatientDouble(newPatientDouble);
//            this.previousPatientDouble = newPatientDouble.previousPatientDouble;
        }
    }

    public boolean deletePatientDouble(PatientDouble patientDouble)
    {
        if (this.nextPatientDouble == null)
        {
            return false;
        }
        else if (this.nextPatientDouble.name.equals(patientDouble.name))
        {
            this.nextPatientDouble = nextPatientDouble.nextPatientDouble;
            return true;
        }
        else
        {
            return this.nextPatientDouble.deletePatientDouble(patientDouble);
        }
    }

    public void printPatientDouble()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Illness: " + illness);
        if (this.previousPatientDouble != null)
        {
            System.out.println("Previous Patient: " + previousPatientDouble.name);
        }
        else
        {
            System.out.println("Previous Patient: null");
        }
        if (this.nextPatientDouble != null)
        {
            System.out.println("Next Patient: " + nextPatientDouble.name);
        }
        else
        {
            System.out.println("Next Patient: null");
        }
        System.out.println();
        if (this.nextPatientDouble != null)
        {
            nextPatientDouble.printPatientDouble();
        }
    }

    public int listLength()
    {
        int count = 0;
        PatientDouble aux = this;
        while (aux.nextPatientDouble != null)
        {
            aux = aux.nextPatientDouble;
            count++;
        }
        if (aux.nextPatientDouble == null)
        {
            count++;
        }
        return count;
    }
}
