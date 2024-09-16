public class ExceptionHandler {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException

            int num = 5 / 0; // ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}