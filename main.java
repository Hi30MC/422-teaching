public class main {
    public static void main( String[] args) {
        System.out.println("Hello World");
        int a = 4;
        int b = 2;
        int times = mult(a,b);
        String message = "your mom";
        printNTimes(message, times);
    }

    public static int mult(int a, int b){
       return a*b;
    }

    public static void printNTimes(String message, int times){
        for (int i = 0; i < times; i++){
            System.out.println(message);
        }
    }
}