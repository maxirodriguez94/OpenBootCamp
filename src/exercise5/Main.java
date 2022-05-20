package exercise5;

public class Main {

    static CocheCRUDimpl cocheCRUDimpl = new CocheCRUDimpl();
    public static void main(String[] args){
        cocheCRUDimpl.findAll();
        cocheCRUDimpl.delete(cocheCRUDimpl);
        cocheCRUDimpl.save(cocheCRUDimpl);
    }
}
