package spring.data.access.repository;

public interface ObjectRepository<T> {

    void add(T t);

    void delete(int id);

    T getByID(int id);
}
