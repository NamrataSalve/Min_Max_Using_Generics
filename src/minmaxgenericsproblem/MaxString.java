package minmaxgenericsproblem;

public class MaxString {
    public static void main(String[] args) {
        Integer[] integerArray = {10, 40, 20};
        getMax(integerArray);
        Float[] floatArray = {2.3f,4.2f,7.5f};
        getMax(floatArray);
        String[] stringArray = {"Apple", "Peach", "Banana"};
        getMax(stringArray);
    }
    public static <T extends Comparable<T>> void getMax(T[] arr) {
        T max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].compareTo(max);
            if (a > 0) {
                if (a > 0) {
                    max = arr[i];
                    position = i;
                }
            }
            System.out.println("Maximum element number is " + max + " and its position is " + position);
        }
    }
}
