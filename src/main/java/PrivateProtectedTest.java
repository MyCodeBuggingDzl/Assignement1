public class PrivateProtectedTest {
    public static void main(String[] args) {

        Employee e = new Employee("Ali", 50000);
        Manager e = new Manager("Jogn", 400, "d1");

        System.out.println(e.toString());
        e.giveRaise(20);
        System.out.println(e.toString());
    }
}
