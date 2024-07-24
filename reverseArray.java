import java.util.Scanner;
public class reverseArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        for(int i =0;i<size;i++){
            myArray[i] = scanner.nextInt();
        }
        for(int i = size-1;i>=0;i--){
            System.out.print(myArray[i]+" ");
        }
        scanner.close();
    }

}


