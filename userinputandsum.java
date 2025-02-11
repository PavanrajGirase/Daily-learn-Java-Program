import java.util.Scanner;

public class userinputandsum {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The Total sum is:"+sum);
    }
    
}
