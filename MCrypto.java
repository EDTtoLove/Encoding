import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class MCrypto {

    private final static String _ALPHA    =           "MNBVCXZLKJHGFDSAPOIUYTREWQ";
    private final static String _BETA     =           "QAZWSXEDCRFVTGBYHNUJMIKOLP";
    private final static String _OMEGA    =           "QWERTYUIOPASDFGHJKLZXCVBNM";
    private final static String[] dict = {_ALPHA, _BETA, _OMEGA};
    private final static String ALPHABET  =           "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String Encrypt(String def_text) {
        //StringBuilder result = new StringBuilder();
        char[] chars = new char[def_text.length() ];
        for (int j = 0; j < dict.length; j++) {
            for (int i = j; i < def_text.length(); i += 3) {
                chars[i] =dict[j].toCharArray()[ALPHABET.indexOf(def_text.toUpperCase().toCharArray()[i])];
            }
        }

        return String.copyValueOf(chars);
    }

    public static String Decrypt(String enc_text){
        char[] chars = new char[enc_text.length()];
        for (int j = 0; j < dict.length; j++) {
            for (int i = j; i < enc_text.length(); i += 3) {
                chars[i] = ALPHABET.toCharArray()[dict[j].indexOf(enc_text.toUpperCase().toCharArray()[i])];
            }
        }
        return  String.copyValueOf(chars);
    }
}
