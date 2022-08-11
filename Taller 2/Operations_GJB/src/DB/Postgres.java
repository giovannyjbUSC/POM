package DB;

public class Postgres extends DB {


    public Postgres(String name) {
        super(name);
    }

    @Override
    public String description() {
        return ("DB " + this.name + " de Postgres");
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
