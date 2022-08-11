package DB;

public class Oracle extends DB {


    public Oracle(String name) {
        super(name);
    }

    @Override
    public String description() {
        return("DB " + this.name + " de Oracle");
    }

    @Override
    public void connect() {

    }

    @Override
    public void query() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void delete() {

    }
}
