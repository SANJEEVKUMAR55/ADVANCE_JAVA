package src;
import java.util.Arrays;
import java.util.List;

public class countString {
    public static void main(String[] args) {
        List<String> sk = Arrays.asList("priyanka","priya","sanjeevsk","nitish","nikesh");
        char specifier = 'p';
        long count = sk.stream()
                .filter(s -> s.startsWith(String.valueOf(specifier)))
                .count();
        System.out.println("SPECIFIER LETTER  " +specifier+ " : " +count);
    }
}
