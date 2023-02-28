package Ejerciciov1;

public class Main {

    static CocheCRUD cocheCrud = new CocheCRUDExport();

    public static void main(String[] args) {

        Coche audi = new Coche();

        cocheCrud.save(new Coche());
        cocheCrud.finAll();
        cocheCrud.delete();

    }
}
