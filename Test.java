import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Write number before x^2:");
        Scanner scn1 = new Scanner(System.in);
        int a = scn1.nextInt();
        System.out.print("Write number before x:");
        Scanner scn2 = new Scanner(System.in);
        int b = scn2.nextInt();
        System.out.print("Write last number:");
        Scanner scn3 = new Scanner(System.in);
        int c = scn3.nextInt();
        int d = (int)Math.pow(b,2)-4*a*c;
        if(d>0){
            int x1 = (int)(-b+Math.sqrt(d))/(2*a);
            int x2 = (int)(-b-Math.sqrt(d))/(2*a);
            System.out.println("the first root of the number is "+x1);
            System.out.println("the second root of the number is "+x2);
        } else if (d==0) {
            int x3 = -b/(2*a);
            System.out.println("the equation has one root "+x3);
        } else if (d<0) {
            System.out.println("the equation has no roots");
        }
    }
}
