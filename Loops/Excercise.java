 import java.util.*;
 
public class Excercise {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;

        do{
            System.out.println("Enter the number");
            num = sc.nextInt();
            System.out.println("your number is" + " " + num);

        }while(num>=0);
        System.out.println("Bass Kar le");
    }
    
}
