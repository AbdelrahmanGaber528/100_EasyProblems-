import java.util.Scanner;
class Solution{
    public static int Candies(int[] kids,int a ,int b){
        int sumOfCandies = 0;
        int pointer = a;
        while(pointer<=b){
            sumOfCandies+=kids[pointer];
            pointer++;
        }
        return sumOfCandies;
    }
}
public class Candies {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] kids = new int[n];
    for (int i = 0; i <n ; i++) {
            kids[i] = input.nextInt();
    }
    int a = input.nextInt(),b = input.nextInt();
    int result = Solution.Candies(kids,a,b);
    System.out.println(result);
    }}
