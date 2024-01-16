import java.util.Scanner;
public class traverse_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int [] marks = new int[n];
        for(int i = 0; i < n;i++){
            marks[i] = sc.nextInt();
        }
        // traversing means just cecking all elements of array.
        for(int i=0; i<n;i++)
        System.out.print(marks[i]+" ");
    } 
}
