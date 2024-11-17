
package Assignment9;
import java.util.*;


public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ID");
            System.out.println("4. Xoa sinh vien theo ID");
            System.out.println("5. Chinh sua sinh vien theo ID");
            System.out.println("6. Thoat");
            System.out.print("Chon chuc nang: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Nhap so luong sinh vien muon them: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); 
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ":");
                        Student student = new Student();
                        student.enterStudentInfo();
                        studentList.addStudent(student);
                    }
                    break;

                case 2: 
                    System.out.println("Danh sach sinh vien:");
                    studentList.displayAllStudents();
                    break;

                case 3: 
                    System.out.print("Nhap ID sinh vien can tim: ");
                    String idToFind = scanner.nextLine();
                    Student foundStudent = studentList.findStudentById(idToFind);
                    if (foundStudent != null) {
                        System.out.println("Thong tin sinh vien:");
                        foundStudent.displayStudentInfo();
                    } else {
                        System.out.println("Khong tim thay sinh vien voi ID: " + idToFind);
                    }
                    break;

                case 4: 
                    System.out.print("Nhap ID sinh vien can xoa: ");
                    String idToDelete = scanner.nextLine();
                    if (studentList.deleteStudentById(idToDelete)) {
                        System.out.println("Da xoa sinh vien thanh cong.");
                    } else {
                        System.out.println("Khong tim thay sinh vien với ID: " + idToDelete);
                    }
                    break;

                case 5: 
                    System.out.print("Nhap ID sinh vien can chinh sua: ");
                    String idToEdit = scanner.nextLine();
                    if (studentList.editStudentById(idToEdit)) {
                        System.out.println("Da chinh sua thong tin sinh vien thanh cong.");
                    } else {
                        System.out.println("Khong tim thay sinh vien voi ID: " + idToEdit);
                    }
                    break;

                case 6: 
                    System.out.println("Thoat chuong trinh.");
                    return;

                default:
                    System.out.println("Lua chon khong hop le! Hay chon lai.");
            }
        }
    }
}
