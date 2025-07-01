import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        try {
            int num = j / i;
            System.out.println("Result: " + num);  
        } catch (ArithmeticException e) {
            System.out.println("Something is wrong: " + e);
        }

        sc.close();  
    }
}
