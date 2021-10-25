public class SummativeSums {

    //Call your new method inside a main method and print out the result for the following three example arrays:
    public static void main(String[] args){

        int[] myArray1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] myArray2 = { 999, -60, -77, 14, 160, 301 };
        int[] myArray3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        System.out.println("#1 Array Sum:" + sum(myArray1));
        System.out.println("#2 Array Sum:" + sum(myArray2));
        System.out.println("#3 Array Sum:" + sum(myArray3));
    }

    //Write a static method that takes in an array of ints, adds them together, and returns the result.
    private static int sum(int[] myArray) {
        int sumArray = 0;
        for(int i = 0; i < myArray.length; i++){
            sumArray = sumArray + myArray[i];
        }
        return sumArray;
    }
}
