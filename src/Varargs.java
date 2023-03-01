import java.util.Arrays;

public class Varargs {
    public static void main(String[] args){


        multiple(3,4,"ganesh");

    }


    //var arg parameter must be at the end
    static void multiple(int a,int b,String ...v){


    }

    //var arg
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
