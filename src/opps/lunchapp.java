package opps;

import java.util.Scanner;

public class lunchapp {
    float length;
    static float breadth;
    float area;
    public static void main(String[] args) {
        System.out.println("calculation of Rectangle app :");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Rectangle Length");
       // length = sc.nextFloat();
        System.out.println("Enter the Rectangle breath");
        breadth = sc.nextFloat();
        System.out.println("Enter the Rectangle area");
        //area = sc.nextFloat();
    }
    public void compute(){
        area = length*breadth;
    }
    public void dis(){
        System.out.println("the area of Rectangle is :" + area);
    }
}
