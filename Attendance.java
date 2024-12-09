public class Attendance {
    private Student student;
    private AttendanceStatus status;

    public Attendance(Student student, AttendanceStatus status) {
        this.student = student;
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public AttendanceStatus getStatus() {
        return status;
    }
}
