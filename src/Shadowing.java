public class Shadowing {

    static int y=5;
    static int x=90; //this will be shadowed in line 6
    public static void main(String[] args){
        System.out.println(x);//90
        int x = 40;

        int y;
      //System.out.println(y);//error we first need to initialize then use
       //scope will begin when the value is initialized
         y=8;
         System.out.println(y);
         System.out.println(x);//40
        fun();
    }

    static  void fun(){
        System.out.println(x);//90

    }
}
