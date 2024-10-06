package minmaxgenericsproblem;

public class ExtendMaxMethod {
    public static void main(String[] args) {
        getMax(10,40,20);
        System.out.println("Maximum integer is "+getMax(10,40,20));
    }
    public static <T> void printMax(T x, T y, T z, T max)
    {
        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
    }

        public static <T extends Comparable<T>> T getMax(T x, T y, T z) {
            T max = y;
            if (z.compareTo(max) > 0)
                max = z;
            printMax(x, y, z, max);
            return max;
        }
        
}
