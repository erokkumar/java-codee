package Leetcode;

public class tryerh {
    static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int a, int b)
    {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println();
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
         print(arr);
         int a=2;
         int b=5;
         swap(a,b);
    }
}
