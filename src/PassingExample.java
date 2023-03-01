public class PassingExample {
    public static void main(String[]args){
        String name = "ganesh";
       changeName(name);
    }

    //in java there is no pass by reference
    //java pass by value
    static void changeName(String na){
        System.out.println(na);
    }
}
