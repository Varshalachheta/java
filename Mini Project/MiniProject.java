import java.util.*;

public class MiniProject{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynum = (int)(Math.random()*100);
        int usernum = 0;

        do{
            System.out.println("guess the number  : ");
            usernum = sc.nextInt();
            if(usernum==mynum){
                System.out.println("you won");
                break;
            }
            else if(usernum > mynum){
                System.out.println("your number is greater than mynum");
            }
            else{
               System.out.println("your number is small than mynum");

            }
        }while(usernum >= 0);
        System.out.println("my number was :");
        System.out.println(mynum);
    }
}