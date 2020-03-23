package  com.teachmeskills.rakhubovskiy.metoda.task28;

/*Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.*/

public class ArrayClass<T> {
    private T[] value;

    public ArrayClass(T[] value){
        this.value = value;
    }

    public T getValue(int index){
        return value[index];
    }
}
