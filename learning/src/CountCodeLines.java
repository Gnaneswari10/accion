import java.io.BufferedReader;
import java.io.FileReader;

public class CountCodeLines {
    public static void main(String[] args) {
            String Filename = "destination File ";
            int lines = get_countOfLines(Filename);
            System.out.println("Number of Lines in " + Filename + " : " + lines);
    }

        public static int get_countOfLines(String Filename) {
            int count = 0;
            try(BufferedReader reader = new BufferedReader(new FileReader("/Users/bolledugnaneswari/Test/destination.txt"))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    line = line.trim();
                    if (!line.isEmpty() && !line.startsWith("//") && !line.startsWith("/*") && !line.endsWith("*/")) {
                        count++;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error reading the file : " + e.getMessage());
            }
                return count;
        }
}
