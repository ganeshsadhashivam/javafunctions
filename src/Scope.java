public class Scope {
    public static void main(String[] args){

        int a =10;
        int b = 20;
    String name = "ganesh";

        {
           //error alredy a is initialized outside block
           //  int a=6; //here we are creating new int a

             a=6;//here reassigning
             int c =55; //values initialized in this block used in this block only

        name= "programming";
        }
        System.out.println(a);
        System.out.println(name);
    //function scope  ex we cannot access num over here
       // System.out.println(num);
        //System.out.println(marks);



        //scoping in for loop
        for(int i=0;i<5;i++){
            System.out.println(i);
            int num = 90;
            a=10000;
        }

        System.out.println(a);

    }


    static void random(int marks){
        int num = 67;
        //but we can access num over
        //and it also applicable for arguments also
        System.out.print(num);
        System.out.print(marks);
    }
}
