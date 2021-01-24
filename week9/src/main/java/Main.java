import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {0, 1};
//        try {
//            for (int i=0; i<2; i++) {
//                System.out.println(arr[sc.nextInt()]);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Gotcha!!");

        try {
            throw new MyException();
        } catch (MyException e) {
            e.printError();
        }
    }
}
