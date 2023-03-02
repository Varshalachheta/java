import java.util.Arrays;

public class Array {
   public static void main(String[] args) {
    int arr[] = new int[5];
     arr[0] = 10;
     arr[1] = 11;
     arr[2] = 12;
     arr[3] = 45;
     arr[4] = 23;
     System.out.println(arr[0]);

     // initialization

     boolean[] aa = new boolean[4];
     System.out.println(aa[2]);

     // length 

     System.out.println(arr.length);

     // sort
    System.out.println(arr[3]);
     Arrays.sort(arr);
    System.out.println(arr[3]);

    int marks[] = {97,98,96};
    System.out.println(marks[1]);

    int finalmarks[][] = {{97,98,99},{98,97,99}};
    System.out.println(finalmarks[1][1]);


        
    }
}