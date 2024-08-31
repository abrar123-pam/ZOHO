package Practice;

import java.util.Arrays;

class CustomArrayList<E> {
    private E[] arr;
    private int size;

    CustomArrayList(int initialCapacity) {
        // Creating a generic array requires a cast due to type erasure
        this.arr = (E[]) new Object[initialCapacity];
        this.size = 0;
    }

    public void add(E element) {
        if (size == arr.length) {
            increaseCapacity();
        }
        arr[size++] = element;
    }

    private void increaseCapacity() {
        int len = arr.length;
        int newCapacity = len * 2;
        arr = Arrays.copyOf(arr, newCapacity);
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return arr[index];
    }

    public int size() {
        return size;
    }

    public void remove(E element) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i].equals(element)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException("Element not found in ArrayList");
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ImplementArrayList {
    public static void main(String[] args) {
        CustomArrayList<Integer> intList = new CustomArrayList<>(3);
        intList.add(1);
        intList.add(2);
        intList.add(3);

        intList.display();
        System.out.println("Element at index 0: " + intList.get(0));
        intList.remove(2);
        intList.display();

        CustomArrayList<String> strList = new CustomArrayList<>(3);
        strList.add("apple");
        strList.add("banana");
        strList.add("cherry");

        strList.display();
        System.out.println("Element at index 0: " + strList.get(0));
        strList.remove("banana");
        strList.display();
    }
}
