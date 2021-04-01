import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathOperation mathobj = new MathOperation();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter int1: ");
        int int1 = in.nextInt();
        mathobj.setInt1(int1);

        System.out.println("Enter int2: ");
        int int2 = in.nextInt();
        mathobj.setInt2(int2);

        //mathobj.int1();
        //mathobj.int2();
        mathobj.sum_operation();
        mathobj.dif_operation();
        mathobj.product_operation();
        mathobj.average_operation();
        mathobj.distance_operation();


    }
}
