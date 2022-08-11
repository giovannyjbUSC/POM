package DB;

public abstract class DB implements Operations { //Base de datos

    protected String name;

    public DB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String description();

}
