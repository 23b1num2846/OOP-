public class Student extends Person {
    private String id;
    private Lesson lesson;
    private Laboratory laboratory;

    public Student(String id, String name, Lesson lesson, Laboratory laboratory) {
        super(name);
        this.id = id;
        this.lesson = lesson;
        this.laboratory = laboratory;
    }

    public String getId() {
        return id;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public Laboratory getLaboratory() {
        return laboratory;
    }
}
