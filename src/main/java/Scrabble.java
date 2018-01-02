import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Scrabble {
    public static void main(String[] args){
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your word");

        try{
            String word = bufferedReader.readLine();
            word = word.replaceAll("(?i)['a'|'e'|'i'|'o'|'u'|'l'|'n'|'r'|'s'|'t']","1");
            word = word.replaceAll("(?i)['d'|'g']", "2");
            word = word.replaceAll("(?i)['b'|'c'|'m'|'p']", "3");
            word = word.replaceAll("(?i)['f'|'h'|'v'|'m'|'y']", "4");
            word = word.replaceAll("(?i)['k']", "5");
            word = word.replaceAll("(?i)['j'|'x']", "6");
            word = word.replaceAll("(?i)['q'|'z']", "3");
            System.out.println(word);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
