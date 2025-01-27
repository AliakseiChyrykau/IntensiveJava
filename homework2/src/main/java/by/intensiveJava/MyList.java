package main.java.by.intensiveJava;

import java.util.Comparator;

public interface MyList<T> {
    /**
     * Добавляет новый объект в конец списка.
     *
     * @param element добавляемый объект.
     */
    void add(T element);

    /**
     * Добавляет новый объект по указанному индексу.
     *
     * @param index индекс по которому добавляется новый объект
     * @param element добавляемый объект.
     */
    void add(int index, T element);

    /**
     * Возвращает объект по индексу.
     *
     * @param index индекс возвращаемого объекта.
     * @return возвращает объект по указанному индексу.
     */
    T get(int index);

    /**
     * Удаляет объект по указанному индексу.
     *
     * @param index индекс удаляемого объекта.
     */
    T remove(int index);

    /**
     * Удаляет все объекты из коллекции.
     */
    void clear();

    /**
     * Сортирует коллекцию на основании переданного компаратора.
     *
     * @param comparator компаратор описывающий правила сортировки массива.
     */
    void sort(Comparator< ? super T> comparator);

    /**
     * Сортирует коллекцию методом быстрой сортировки на основании переданного компаратора.
     *
     * @param comparator компаратор описывающий правила сортировки массива.
     */
    void quickSort(Comparator<T> comparator);
}
