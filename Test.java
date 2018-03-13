import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in,"utf-8"));
     String str ="";
     try{
         str = reader.readLine();
     }catch (IOException e){
         e.printStackTrace();
     }
        String t = MCrypto.Encrypt(str);
        System.out.println(t);
        System.out.println(MCrypto.Decrypt(t));

    }
}

