package minmaxgenericsproblem;

public class MaxInteger {
    public static void main(String[] args) {
        System.out.println("Welcome to Min Max Generics problem");
        Integer[] arr = {10, 40, 20};
        getMaximumInteger(arr);
    }
    public static void getMaximumInteger(Integer[] arr) {
        int max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].compareTo(max);
            if (a > 0) {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum integer is " + max+" and its position is "+position);
    }
}
