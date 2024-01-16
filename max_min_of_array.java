import java.util.Scanner;
public class max_min_of_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        // for maxmimum value of array.
        int max = array[0];
        for(int i = 0; i<n; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("maxmimum vaue of array is "+max);
        // for minimum value of array.
        int min = array[0];
        for(int i = 0; i<n; i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("minimum value of array is "+min);

    }
    
}
