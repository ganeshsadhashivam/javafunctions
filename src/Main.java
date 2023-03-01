import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
       System.out.println(sumWithReturn());
       int ans = sum3(7,88);
        System.out.println(ans);

    }


    //with parameter
    static int sum3(int a,int b){
        int sum = a + b;
        return  sum;
    }

    static int sumWithReturn(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
    }

    //void return type it doesn't return anything
    static void sum(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println(sum);
    }
}