class Main {

    // Method that throws an exception if the mark is invalid
    public static String validateMark(int mark) throws IllegalArgumentException {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100");
        }
        return "Valid Mark";
    }

    public static void main(String[] args) {
        try {
            int mark = 105;  // change this to test different values
            String result = validateMark(mark);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
