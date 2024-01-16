import java.util.Scanner;
public class average_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int total =0;
        int average [] = new int[n];
        for(int i = 0; i<n; i++){
            average[i]=sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            total=total+average[i];
        }
        System.out.println("The average of Array is "+(float)total/n);
    }
}
