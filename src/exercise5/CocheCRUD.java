package exercise5;

import java.util.List;

public interface CocheCRUD {

    void save(CocheCRUDimpl CocheCRUDimpl);

    List<CocheCRUDimpl> findAll();

    void delete(CocheCRUDimpl CocheCRUDimpl);
}
