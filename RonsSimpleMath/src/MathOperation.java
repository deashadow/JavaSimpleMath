import java.util.Scanner;

public class MathOperation {
    private int int1, int2;
    Scanner in = new Scanner(System.in);

    public void setInt1(int i) {
        int1 = i;
    }

    public void setInt2(int a) {
        int2 = a;
    }

    public void int1() {
        System.out.println("Please enter int1: ");
        int1 = in.nextInt();
    }

    public void int2() {
        System.out.println("Please enter int2: ");
        int2 = in.nextInt();
    }

    public void sum_operation() {
        System.out.println("The sum of the two numbers you entered is: " + (int1 + int2));
    }

    public void dif_operation() {
        System.out.println("The difference of the two numbers you entered is: " + (int1 - int2));
    }

    public void product_operation() {
        System.out.println("The product of the two numbers you entered is: " + (int1 * int2));
    }

    public void average_operation() {
        System.out.println("The average of the two numbers you entered is: " + (int1 + int2) / 2);
    }

    public void distance_operation() {
        System.out.println("The distance of the two numbers you entered is: " + (int2 - int1));
    }

}














