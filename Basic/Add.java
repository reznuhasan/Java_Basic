import java.util.Scanner;

public class Add{
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=add(a,b);
        System.out.println(result);
     }
}
