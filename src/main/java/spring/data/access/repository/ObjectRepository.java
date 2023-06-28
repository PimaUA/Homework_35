package spring.data.access.repository;

public interface ObjectRepository<T> {

    boolean add(T t);

    boolean delete(int id);

    T getByID(int id);
}
