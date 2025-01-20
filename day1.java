import java.util.ArrayList;

public class day1 {
    public static void main(String[] args){
        System.out.println("Hello World!"); //"Hello World" will print in console

        // Type name = value
        String message = "Hi!";
        int number = 4;
        Double x = 2.8;
        Double y = 0.5;
        boolean value = true;

        int a = 0;
        int b = 10;
        System.out.println(functionTwo(a, b)); // prints out a+b

        ArrayList<Integer> vals = new ArrayList<Integer>(); // <-- initialize array list "vals" with type int
        vals.add(4);
        vals.add(50);
        System.out.println(vals.toString()); //[4, 50]

        // vals.indexOf(4);

        // vals.indexOf(24); //-> -1

        // vals.remove(4); // [1, 2, 3, 4, 5, 4, 3, 2, 1] -> [1, 2, 3, 5, 4, 3, 2, 1]

        // vals.size(); // [1, 2, 3, 4, 5, 6] -> 6

        // // vars = [0, 5, 10, 15, 20]

        // vars.size(); // 5

        // vars.get(5); -> ArrayIndexOutOfBoundsException

        // for (int i = 0; i < vals.size(); i++){
        //     vals.set(i, vals.get(i) + 1);
        // }

    }

    //print an int
    public static void functionOne(int i){
        System.out.println(i);
    }

    //method that takes two integers, a and b, and returns their sum.

    public static int functionTwo(int a, int b){
        return a+b;
    }

    //method that takes two strings outputOne and outputTwo and a boolean switch
    // returns outputOne if switch is true, and outputTwo if switch is false.

    public String functionThree(String outOne, String outTwo, boolean value){
        if (value){
            return outOne;
        } else {
            return outTwo;
        }
    }

    // int x = 0;
    // while (x < 5) {
    //     System.out.println("hello");
    //     x += 1;
    // }

    // while (value == true){
    //     if (blah){
    //         value = false;
    //     }
    // }

    // for (int x = 0; x < 10; x++){
    //     System.out.println("hello");
    // }

    //method takes in a string and an integer and print out the string <int> number of times

    public static void printRepeat(int n, String x){

        while (n > 0){
            System.out.println(x);
            n--;
        }

        for (int i = n; i > 0; i--){
            System.out.println(x);
        }
    }

    //large test:
    // parameters:
    // double a
    // double b
    // String operation
    // returns the correct result given the operation

    //Possible operations:
    // add
    // subtract (a-b)
    // mult
    // divide (a/b)
    // moduluo (a % b)
    // if operation does not match any of these values, return 0

    public static double calculator(double a, double b, String op){
        return 0;
    }


    // parameters:
    // ArrayList<Integer> ints
    // returns:
    // sum of all integers in ints
    // type: int

    // hint: use for loop

    public static int sumArrayList(ArrayList<Integer> vals){
        //make total var
        // looop over all items in ints, add each item to total
        //return total

        int total = 0;
        for (int i = 0; i < vals.size(); i++){
            total += vals.get(i);
        }
        return total;

    }

    public static void printArrayList(ArrayList<String> vals){
        for (int i = 0; i < vals.size(); i++){
            System.out.println(vals.get(i));
        }
    }


}
