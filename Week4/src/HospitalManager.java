/**
 * Created by Squall on 20/10/2014.
 */
public class HospitalManager {
    private Patient patientListStart = null;

    public static void main(String[] args)
    {
        HospitalManager hm = new HospitalManager();
        hm.launch();
    }

    public void launch()
    {
        Patient p1 = new Patient("John", 33, "Tuberculosis");
        patientListStart = p1;
        Patient p2 = new Patient("Jane", 31, "Ebola");
        patientListStart.addPatient(p2);
        Patient p3 = new Patient("Hugh", 43, "Flu");
        patientListStart.addPatient(p3);
        Patient p4 = new Patient("Iain", 27, "Flu");
        patientListStart.addPatient(p4);
        Patient p5 = new Patient("Ben", 9, "Broken Leg");
        patientListStart.addPatient(p5);
        Patient p6 = new Patient("Chris", 55, "Angina");
        patientListStart.addPatient(p6);
        Patient p7 = new Patient("Thomas", 25, "Flu");
        patientListStart.addPatient(p7);
        Patient p8 = new Patient("James", 27, "Cold");
        patientListStart.addPatient(p8);
        Patient p9 = new Patient("Elizabeth", 23, "Flu");
        patientListStart.addPatient(p9);
        Patient p10 = new Patient("Gemma", 21, "Tuberculosis");
        patientListStart.addPatient(p10);

        getLengthOfList();

        printLinkedList();

        System.out.println("Now Deleting Stuff from List\n");

        deletePatient(p3);

        getLengthOfList();

        printLinkedList();
    }

    public void getLengthOfList()
    {
        System.out.println("Length of List: " + patientListStart.listLength() + "\n");
    }

    public void deletePatient(Patient patient)
    {
        patientListStart.deletePatient(patient);
    }

    public void printLinkedList()
    {
        patientListStart.printPatient();
    }
}
