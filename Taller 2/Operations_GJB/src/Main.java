import DB.DB;
import DB.Oracle;
import DB.Postgres;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<DB> dbs = new ArrayList<>();

        dbs.add(new Oracle("gio_db_1"));
        dbs.add(new Postgres("gio_db_2"));

        System.out.println("DATA BASES");
        for (DB db : dbs) {
            System.out.println(db.description());
        }


    }
}