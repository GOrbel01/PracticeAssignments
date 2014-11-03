/**
 * Created by Squall on 22/10/2014.
 */
public class HospitalManagerDouble {
    private PatientDouble patientListStart = null;

    public static void main(String[] args)
    {
        HospitalManagerDouble hm = new HospitalManagerDouble();
        hm.launch();
    }

    public void launch()
    {
        PatientDouble p1 = new PatientDouble("John", 33, "Tuberculosis");
        patientListStart = p1;
        PatientDouble p2 = new PatientDouble("Jane", 31, "Ebola");
        patientListStart.addPatientDouble(p2);
        PatientDouble p3 = new PatientDouble("Hugh", 43, "Flu");
        patientListStart.addPatientDouble(p3);
        PatientDouble p4 = new PatientDouble("Iain", 27, "Flu");
        patientListStart.addPatientDouble(p4);
        PatientDouble p5 = new PatientDouble("Ben", 9, "Broken Leg");
        patientListStart.addPatientDouble(p5);
        PatientDouble p6 = new PatientDouble("Chris", 55, "Angina");
        patientListStart.addPatientDouble(p6);
        PatientDouble p7 = new PatientDouble("Thomas", 25, "Flu");
        patientListStart.addPatientDouble(p7);
        PatientDouble p8 = new PatientDouble("James", 27, "Cold");
        patientListStart.addPatientDouble(p8);
        PatientDouble p9 = new PatientDouble("Elizabeth", 23, "Flu");
        patientListStart.addPatientDouble(p9);
        PatientDouble p10 = new PatientDouble("Gemma", 21, "Tuberculosis");
        patientListStart.addPatientDouble(p10);

        getLengthOfList();

        printLinkedList();

        System.out.println("Now Deleting Stuff from List\n");

        deletePatientDouble(p3);

        getLengthOfList();

        printLinkedList();
    }

    public void getLengthOfList()
    {
        System.out.println("Length of List: " + patientListStart.listLength() + "\n");
    }

    public void deletePatientDouble(PatientDouble patient)
    {
        patientListStart.deletePatientDouble(patient);
    }

    public void printLinkedList()
    {
        patientListStart.printPatientDouble();
    }
}
