import java.util.ArrayList;

class day3 {

    public static void main(String[] args) {
        int x = 0;

        System.out.println(isEven(x));
    }


    // return true if number is even
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    // sysout even numbers in given array
    public static void printEvenNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (isEven(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }
    }

    // return array of numbers that are even in given array
    public static ArrayList<Integer> getEvenNumbers(int[] numbers) {
        return new ArrayList<Integer>();
    }

    // return reversed arraylist of numbers
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> numbers) {
        // initalize new arraylist for output
        ArrayList<Integer> output = new ArrayList<Integer>();
        // loop over input array
        for (int i = 0; i < numbers.size(); i++){
            // if number is even, add to output arraylist
            if (isEven(numbers.get(i))) {
                output.add(numbers.get(i));
            }
        }
        //return output arraylist
        return output;
    }


    // return sum of all numbers in given array
    public static int sumArray(int[] numbers) {
        int total = 0;
        for (int i : numbers) {
            total += i;
        }
        return total;
    }
}
