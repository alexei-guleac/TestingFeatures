import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufReader {
    public static void main(String[] args) {
        char c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bвeдитe символы, 'q' - для выхода.");

        //читать символы
        do {
            try {
                c = (char) br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(c);
        } while(c != 'q');
    }
}
