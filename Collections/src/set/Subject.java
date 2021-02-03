package set;

public class Subject {
    private String id;
    private String name;

    public Subject(String id, String name){
        if(id == null){
            throw new NullPointerException("ID cannot be null");
        }
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Subject)){
            return false;
        }
        Subject target = (Subject) o;
        return id.equals(target.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
