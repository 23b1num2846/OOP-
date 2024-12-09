import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String id;
    private String name;
    private Teacher teacher;
    private List<String> topics = new ArrayList<>();
    private List<Laboratory> laboratories = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Attendance> attendanceRecords = new ArrayList<>();

    public Lesson(String id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public void addTopic(String topic) {
        topics.add(topic);
    }

    public void addLaboratory(Laboratory laboratory) {
        laboratories.add(laboratory);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void recordAttendance(Student student, AttendanceStatus status) {
        Attendance attendance = new Attendance(student, status);
        attendanceRecords.add(attendance);
    }

    public void displayAttendance() {
        System.out.println("\n: Хичээлийн ирц" + name);
        for (Attendance record : attendanceRecords) {
            System.out.println("Оюутан: " + record.getStudent().getName() +
                    ", Статус: " + record.getStatus());
        }
    }

    public void displayStudentsWithLab() {
        System.out.println("\n: Хичээл дэх оюутнууд" + name);
        for (Student student : students) {
            System.out.println("Оюутан: " + student.getName() +
                    ", Хичээл: " + student.getLesson().getName() +
                    ", Лаб: " + student.getLaboratory().getName());
        }
    }
    public List<Laboratory> getLaboratories() {
        return laboratories;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
