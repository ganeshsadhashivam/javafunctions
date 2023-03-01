import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
    fun(67);
    fun("ganesh");

    int ans = sum(4,5);
    System.out.println(ans);

    int ans2 = sum(4,5,7);
    System.out.println(ans2);

    demo(2,3,4,56,7);
    demo("g","a,","n");


    }

//same name ,same return type but different arguments
    //it is called as compile time polymorphism
        static void fun(int a){
            System.out.println(a);
        }

//either argument name  should be different or type of argument
        static void fun(String name){
            System.out.println(name);
        }


        static int sum(int a,int b){
        return a + b;
        }

        static int sum(int a,int b,int c){
        return a+b+c;
        }


        static  void demo(int ...v){
        System.out.println(Arrays.toString(v));
        }


    static  void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    }

