import java.util.Scanner;
class Solution{
    public static int countLetters(String word){
        int count=0;
        for (int i = 0; i < word.length(); i++) {
            count++;
        }
        return count;
    }

}
public class TooLongWords {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String[] words = new String[n];
    for (int i = 0; i < n; i++) {
        words[i] = input.next();
    }
        for (int i = 0; i < n; i++) {
            char lastLetter = words[i].charAt(words[i].length()-1);
            char firstLetter = words[i].charAt(0);
            int count = Solution.countLetters(words[i]);
            count-=2;
            if (Solution.countLetters(words[i])>10){

                words[i] =firstLetter+""+count+""+lastLetter;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(words[i]);
        }

    }}
