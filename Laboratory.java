public class Laboratory {
    private String id;
    private String name;
    private Lesson lesson;

    public Laboratory(String id, String name, Lesson lesson) {
        this.id = id;
        this.name = name;
        this.lesson = lesson;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Lesson getLesson() {
        return lesson;
    }


}
