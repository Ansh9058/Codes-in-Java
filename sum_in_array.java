import java.util.Scanner;
public class sum_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nmber of element");
        int total =0;
        int n =sc.nextInt();
        int sum []=new int[n];
        for(int i=0; i<n;i++){
            sum[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            total=total+sum[i];
        }
        System.out.println("sum of all elements is "+total);
    }   
}
