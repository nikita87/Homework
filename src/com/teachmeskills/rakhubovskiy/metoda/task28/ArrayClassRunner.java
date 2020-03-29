package  com.teachmeskills.rakhubovskiy.metoda.task28;

public class ArrayClassRunner {
    public static void main(String[] args) {

        Integer[] values = new Integer[]{1,2,3,4,5,6,7};

        ArrayClass<Integer> arrayClass = new ArrayClass<Integer>(values);

        System.out.println(arrayClass.getValue(2));
    }
}
