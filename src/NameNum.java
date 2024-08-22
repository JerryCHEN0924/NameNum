import java.io.*;
import java.util.Scanner;

public class NameNum {
    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(new File("NameNum.in"));
            Scanner dictScanner = new Scanner(new File("dict.txt"));
            PrintWriter out = new PrintWriter(new FileWriter("NameNum.out"))) {
            String id = scanner.nextLine();
            boolean matchedExisting = false;
            while (dictScanner.hasNextLine()){
                String word = dictScanner.nextLine();
                if(isMatched(word, id)){
                    matchedExisting = true;
                    out.println(word);
                }
            }

            if(!matchedExisting){
                out.println("NONE");
            }
        }

    }

    private static final char[] MAPPINGS = {
            '2','2','2','3','3','3','4','4','4','5','5','5',
            '6','6','6','7','0','7','7','8','8','8','9','9','9','0'
    };

    static boolean isMatched(String word, String id) {
        if (word == null || id == null ){
            throw new IllegalArgumentException("輸入參數為Null");
        }

        if(word.length() != id.length()){
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char converted =  MAPPINGS[word.charAt(i) - 'A'];
            if (id.charAt(i) != converted){
                return false;
            }
        }
        return true;
    }
}
