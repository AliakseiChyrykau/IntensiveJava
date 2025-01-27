package main.java.by.intensiveJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Класс реализующий интерфейс MyList а основе массива.
 * @author AliakseiChyrykau
 *
 *
 */
public class MyArrayList<T> implements MyList<T>{

    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private Object[] elements;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    /**
     * Добавляет новый объект в конец списка.
     *
     * @param element добавляемый объект.
     */
    @Override
    public void add(T element) {
        if (size == elements.length) {
            this.elements = grow();
        }
        this.elements[size] = element;
        size++;
    }

    /**
     * Добавляет новый объект по указанному индексу.
     *
     * @param index   индекс по которому добавляется новый объект
     * @param element добавляемый объект.
     */
    @Override
    public void add(int index, T element) {
        Objects.checkIndex(index, elements.length-1);
        if (size == elements.length) {
            grow();
        }
        System.arraycopy(elements, index,
                elements, index + 1,
                size - index);
        this.elements[index] = element;
        size++;
    }

    /**
     * Возвращает объект по индексу.
     *
     * @param index индекс возвращаемого объекта.
     * @return возвращает объект по указанному индексу.
     */
    @Override
    public T get(int index) {
        Objects.checkIndex(index, elements.length-1);
        return (T) this.elements[index];
    }

    /**
     * Удаляет объект по указанному индексу. Возвращает удаляемый элемент.
     *
     * @param index индекс удаляемого объекта.
     * @return удаляемый элемент.
     */
    @Override
    public T remove(int index) {
        Objects.checkIndex(index, elements.length-1);
        T element = (T) elements[index];
        System.arraycopy(elements, index + 1,
                elements, index,
                size - 1 - index);
        size--;
        elements[size] = null;
        return element;
    }

    /**
     * Удаляет все объекты из коллекции.
     */
    @Override
    public void clear() {
        this.size = 0;
        this.elements = new Object[]{};
    }

    /**
     * Сортирует коллекцию на основании переданного компаратора.
     *
     * @param comparator компаратор описывающий правила сортировки массива.
     */
    @Override
    public void sort(Comparator<? super T> comparator) {
        Arrays.sort((T[]) this.elements, comparator);
    }

    /**
     * Сортирует коллекцию методом быстрой сортировки на основании переданного компаратора.
     *
     * @param comparator компаратор описывающий правила сортировки массива.
     */
    @Override
    public void quickSort(Comparator<T> comparator) {
        int low = 0;
        int high = size - 1;
        quickSort(elements, low, high, comparator);
    }

    private void quickSort(Object[] arr, int low, int high, Comparator<? super T> comparator) {
        if (low < high) {
            int pi = partition(arr, low, high, comparator);

            quickSort(arr, low, pi - 1, comparator);
            quickSort(arr, pi + 1, high, comparator);
        }
    }

    private int partition(Object[] arr, int low, int high, Comparator<? super T> comparator) {
        int middle = low + (high - low) / 2;
        T pivot = (T) arr[middle];

        Object temp = arr[middle];
        arr[middle] = arr[high];
        arr[high] = temp;

        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comparator.compare((T)arr[j],pivot) < 0) {
                i++;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    /**
     * Копирует старый массив элементов в новый большего размера.
     */
    private Object[] grow() {
        int oldCapacyty = elements.length;
        int newCapacyty = oldCapacyty + (oldCapacyty >> 1);
        return Arrays.copyOf(this.elements, newCapacyty);
    }
}
