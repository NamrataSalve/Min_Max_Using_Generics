package minmaxgenericsproblem;

public class MaxFloat {
    public static void main(String[] args) {
        System.out.println("Welcome to Min Max Generics problem");
        Float[] arr = {2.3f,4.2f,7.5f};
        getMaximumFloat(arr);
    }
    public static void getMaximumFloat(Float[] arr) {
        float max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].compareTo(max);
            if (a > 0) {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum float number is " + max+" and its position is "+position);
    }
}
