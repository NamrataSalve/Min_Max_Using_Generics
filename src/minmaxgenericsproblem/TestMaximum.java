package minmaxgenericsproblem;

import java.util.Arrays;

public class TestMaximum <T> {
    T[] typeArray;
    public TestMaximum(T[] typeArray)
    {
        this.typeArray = typeArray;
    }
    public TestMaximum()
    {
    }
    public static <T extends Comparable<T>> void getMax(TestMaximum testMaximum) {
        Arrays.sort(testMaximum.typeArray);
        T max = (T) testMaximum.typeArray[0];
        int position = 0;
        for (int i = 0; i < testMaximum.typeArray.length; i++)
        {
            T a = (T)testMaximum.typeArray[i];
            int b = a.compareTo(max);
            if(b > 0)
            {
                max = (T) testMaximum.typeArray[i];
                position = i;
            }
        }
        System.out.println("Maximum element is : "+max);
        System.out.println("Maximum string is " + max+" and its position is "+position);
        printArray(testMaximum.typeArray);
    }
    public static void printArray(Object[] typeArray) {
        for (Object element : typeArray)
        {
            System.out.println(element+"  ");
        }
    }
    public static void main(String[] args) {
        TestMaximum testMaximum=new TestMaximum();
        Integer[] integerArray={10,20,40,60,30};
        Float[] floatArray={2.3f,4.2f,7.5f,8.5f,1.2f};
        String[] stringArray = {"Apple", "Peach", "Banana","Pineapple"};
        getMax(new TestMaximum(integerArray));
        getMax(new TestMaximum(floatArray));
        getMax(new TestMaximum(stringArray));
    }
}
