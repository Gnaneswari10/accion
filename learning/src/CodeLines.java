
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CodeLines {
    public static void main(String[] args) {
        String filename = "destination file";
        try(
            Stream<String> lines = Files.lines(Paths.get("/Users/bolledugnaneswari/Test/destination.txt"))){
                    long count = lines
                    .map(String::trim)
                    .filter(line ->!line.isEmpty())
                    .filter(line -> !line.startsWith("//"))
                    .filter(line -> !line.startsWith("/*"))
                    .filter(line -> !line.endsWith("*/"))
                    .count();
            System.out.println("Number of Lines in " + filename + " : " + count);

        }catch (Exception e){
            System.out.println("Error reading the file : " + e.getMessage());
        }


    }
}
