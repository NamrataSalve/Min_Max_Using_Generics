package minmaxgenericsproblem;

public class MaxString {
    public static void main(String[] args) {
        getMax(10,40,20);
        System.out.println("Maximum integer is "+getMax(10,40,20));
        getMax(2.3f,4.2f,7.5f);
        System.out.println("Maximum float is "+getMax(2.3f,4.2f,7.5f));
        getMax("Apple", "Peach", "Banana");
        System.out.println("Maximum string is "+getMax("Apple", "Peach", "Banana"));
    }
    public static <T extends Comparable<T>> T getMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
}
