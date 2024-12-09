import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Багшийн ID: ");
        String teacherId = scanner.nextLine();
        System.out.print("Багшийн нэрийг оруул: ");
        String teacherName = scanner.nextLine();
        Teacher teacher = new Teacher(teacherId, teacherName);

        System.out.print("Хичээлийн ID: ");
        String lessonId = scanner.nextLine();
        System.out.print("Хичээлийн нэр оруул: ");
        String lessonName = scanner.nextLine();
        Lesson lesson = new Lesson(lessonId, lessonName, teacher);

        System.out.println("Лаброторын мэдээлэл оруул (зогсохын тулд 'done' гэж бичнэ үү):");
        while (true) {
            System.out.print("Лабын ID: ");
            String labId = scanner.nextLine();
            if (labId.equalsIgnoreCase("done")) break;
            System.out.print("Лабын нэр: ");
            String labName = scanner.nextLine();
            Laboratory lab = new Laboratory(labId, labName, lesson);
            lesson.addLaboratory(lab);
        }

        System.out.println("Оюутнуудыг оруул (зогсоохын тулд 'done' гэж бичнэ үү):");
        while (true) {
            System.out.print("Оюутаны ID: ");
            String studentId = scanner.nextLine();
            if (studentId.equalsIgnoreCase("done")) break;
            System.out.print("Оюутаны нэр: ");
            String studentName = scanner.nextLine();

            System.out.println("Лаб-ыг сонгох:");
            for (int i = 0; i < lesson.getLaboratories().size(); i++) {
                Laboratory lab = lesson.getLaboratories().get(i);
                System.out.println((i + 1) + ". " + lab.getName() + " (" + lab.getId() + ")");
            }
            int labChoice = Integer.parseInt(scanner.nextLine());
            Laboratory selectedLab = lesson.getLaboratories().get(labChoice - 1);

            Student student = new Student(studentId, studentName, lesson, selectedLab);
            lesson.addStudent(student);
        }

        System.out.println("\nИрц оруул");
        for (Student student : lesson.getStudents()) {
            System.out.print("Ирцийн төлөв нь: " + student.getName() +
                    " (ИРСЭН, ТАСАЛСАН, ӨВЧТЭЙ, ЧӨЛӨӨТЭЙ): ");
            AttendanceStatus status = AttendanceStatus.valueOf(scanner.nextLine().toUpperCase());
            lesson.recordAttendance(student, status);
        }

        lesson.displayStudentsWithLab();

        lesson.displayAttendance();

        scanner.close();
    }
}
