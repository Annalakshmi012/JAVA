class Main {

    // Method that handles and rethrows an exception
    public static void riskyMethod() throws ArithmeticException {
        try {
            int a = 10 / 0;  // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in riskyMethod: " + e.getMessage());
            throw e;  // Rethrowing the exception
        }
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
    }
}
