import java.util.Scanner;
public class search_element_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter total number of elements you want to enter in array");
        int n = sc.nextInt();
        int search [] = new int[n];
        for(int i =0; i<n; i++){
            search[i]=sc.nextInt();
        }
        System.out.println("Enter the value you want to check:");
        int a =sc.nextInt();
        int count =0;
        for(int i =0; i<n;i++){
            if(a==search[i]){
                System.out.println(a+" is present at "+i+" index of array");
            }
        } 
    }  
}
