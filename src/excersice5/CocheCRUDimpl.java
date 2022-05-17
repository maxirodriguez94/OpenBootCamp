package excersice5;

import java.util.List;

public class CocheCRUDimpl implements CocheCRUD{

    protected String model;
    protected String colour;

    public CocheCRUDimpl(){}


    @Override
    public void save(CocheCRUDimpl CocheCRUDimpl) {
        System.out.println("Usted esta usando el metodo save");
    }

    @Override
    public List<CocheCRUDimpl> findAll() {
        System.out.println("Usted esta usando el metodo findAll");
        return null;
    }

    @Override
    public void delete(CocheCRUDimpl CocheCRUDimpl) {
        System.out.println("Usted esta usando el metodo delete");
    }
}
