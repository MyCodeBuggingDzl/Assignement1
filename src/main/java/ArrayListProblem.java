import org.example.StudentList;

public class ArrayListProblem {
    public static void main() {

        StudentList list = new StudentList();

        list.addName("John");
        list.addName("Jane");
        list.addName("Julie");
        list.addName("Julia");
        list.addName("July");
        list.addName("Selene");

        System.out.println("Student List:");
        list.displayNames();

        System.out.println("Student in List?" + list.contains("John"));

        System.out.println("Student in List?" + list.contains("Cerene"));

        if (list.remove("John")) {
            System.out.println("Removed John");
        }   else {
            System.out.println("John does not exist");
        }

        if (list.remove("Lulia")) {
            System.out.println("Removed Lulia");
        }   else  {
            System.out.println("Lulia does not exist");
        }

        System.out.println("Student List:");
        list.displayNames();

        System.out.println("Number of names" + list.getNumberOfNames());
    }
}
