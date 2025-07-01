import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] num = {1, 4, 5, 6, 7};

        try {
            int n = num[10];  
            System.out.println("Result: " + n);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Array Index Exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e);
        }
    }
}
