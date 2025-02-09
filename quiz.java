public class quiz {
    public static void main(String[] args){
        int a,b,sum;
        a=10;
        b=5;
        sum=a*b/a-b;
        //Worng answer
        System.out.println(sum);
        sum=(a*b)/(a-b);
        //Right answer
        System.out.println(sum);
    }
    
}
