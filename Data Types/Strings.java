public class Strings {
    public static void main (String [] args){
        // Concatenate
        String name1 = "tinu";
        String name2 = "varsha";
        String name3 = name1 + " " +  name2;
        System.out.println(name3);

        // charAt 

        System.out.println(name1.charAt(0));

        // length 

        System.out.println(name1.length());

        // replace

        String name4 = name1.replace('t', 's');
        System.out.println(name4);

        // substring

        String name5 = "sinu or tinu";
        System.out.println(name5.substring(0, 5));
    }
    
}
