
    public class Calculator {
        // Method with parameters and return type
        public int multiply(int a, int b) {
            return a * b; // Return the product
        }

        // Method with no return value
        public void displayResult(int result) {
            System.out.println("Result: " + result);
        }

        public static void main(String[] args) {
            Calculator calc = new Calculator();

            // Calling method with parameters
            int product = calc.multiply(4, 5);
            System.out.println(product) ;// Returns 20

            // Calling method to display result
            calc.displayResult(product); // Output: Result: 20
        }
    }

