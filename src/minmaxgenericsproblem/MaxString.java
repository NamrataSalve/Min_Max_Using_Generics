package minmaxgenericsproblem;

public class MaxString {
    public static void main(String[] args) {
        System.out.println("Welcome to Min Max Generics problem");
        String[] arr = {"Apple", "Peach", "Banana"};
        getMaximumString(arr);
    }
    public static void getMaximumString(String[] arr) {
        String max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].compareTo(max);
            if (a > 0) {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum String number is " + max+" and its position is "+position);
    }
}
