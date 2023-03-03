import java.util.*;
public class ConditionalIf {
   public static void main (String [] args) 
   {
        Scanner sc = new Scanner (System.in);
        int cash = sc.nextInt();

        if(cash < 10){
          System.out.println("can not get entry in park");
          System.out.println("get more cash");
        }
        else if (cash > 10 && cash < 25) {
            System.out.println("Only for children , Adult not allowed");

        }
        else {
            System.out.println("wohooo , welcome to the park !!");
        }
    
}
    
}
