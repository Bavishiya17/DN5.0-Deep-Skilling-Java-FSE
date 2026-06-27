public class Main {

    public static void main(String[] args) {

        EmployeeManagement emp = new EmployeeManagement();

        emp.addEmployee(new Employee(101, "Arun", "Manager", 60000));
        emp.addEmployee(new Employee(102, "Priya", "Developer", 45000));
        emp.addEmployee(new Employee(103, "Karan", "Tester", 40000));

        System.out.println("\nEmployee Records");
        emp.traverseEmployees();

        System.out.println("\nSearch Employee");
        emp.searchEmployee(102);

        System.out.println("\nDelete Employee");
        emp.deleteEmployee(102);

        System.out.println("\nEmployee Records After Deletion");
        emp.traverseEmployees();
    }
}