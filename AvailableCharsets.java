
    import java.nio.charset.Charset;
import java.util.Map;

public class AvailableCharsets {
    public static void main(String[] args) {
        
        Map<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("Available Character Sets:\n");

        for (String name : charsets.keySet()) {
            System.out.println(name);
        }
    }
}

    
