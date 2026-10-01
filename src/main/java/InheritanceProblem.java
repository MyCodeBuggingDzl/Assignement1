public class InheritanceProblem {
    public static void main(String[] args) {

        Employee e = new Employee("Ali", 3000);
        Employee e2 = new Employee("Alia", 4000);

        Manager m = new Manager("John", 5000, "Dept1");
        Manager m2 = new Manager("Jane", 4500, "Dept2");

        System.out.println(e.toString());
        System.out.println(e2.toString());
        System.out.println(m.toString());
        System.out.println(m2.toString());


        e.giveRaise(1000);
        m.giveRaise(1000);

        System.out.println(e.toString());
        System.out.println(e2.toString());
        System.out.println(m.toString());
        System.out.println(m2.toString());
    }
}
