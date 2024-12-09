public class Teacher extends Person {
    private String id;

    public Teacher(String id, String name) {
        super(name);
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
