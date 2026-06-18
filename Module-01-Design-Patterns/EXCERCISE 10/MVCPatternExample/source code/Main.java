public class Main {

    public static void main(String[] args) {

        Student student = new Student("John", 101, "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println("\nUpdating student details...\n");

        controller.setStudentName("David");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}