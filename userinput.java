import java.util.*;
public class userinput {
    public static void main(String[]args){
        // Use of scanner class for input
        Scanner sc=new Scanner(System.in);
        //sc is a variable and next() is a method display only single word.
        String name = sc.next();
        System.out.println(name);

        Scanner pc=new Scanner(System.in);
        // sc is a variable and nextline() is a method display full sentence word.
        String last = pc.nextLine();
        System.out.println(last);
    }
}
