
package Assignment9;
import java.util.*;


public class Student {
    private String studentId;
    private String fullName;
    private String dateOfBirth;
    private String major;
    private float gpa;

    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        studentId = scanner.nextLine();

        System.out.print("Enter name: ");
        fullName = scanner.nextLine();

        System.out.print("Enter date (dd/mm/yyyy): ");
        dateOfBirth = scanner.nextLine();

        System.out.print("Enter major: ");
        major = scanner.nextLine();

        System.out.print("Enter GPA: ");
        gpa = scanner.nextFloat();
    }
     public Student(String studentId, String fullName, String dateOfBirth, String major, float gpa){
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }
    public Student(){}

    public void displayStudentInfo() {
        System.out.printf("ID: " + studentId + ", Name: " + fullName + ", date of birth: " + dateOfBirth + ", major: " + major + ", gpa: " + gpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}

