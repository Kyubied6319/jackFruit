/* 
Fibonacci sequence generator and a calculator of numbers in the sequence of a certain length
@version 1.0
@author Edward Kyu <kyuedd@gmail.com>
*/
public class codeTestv1 {
    public static void main(String[] args) {
        int[] arr = {10,2};
        sequence(arr);
    }
    static void sequence(int[] arr){
        //Retrieving values from given array
        int n = arr[0];
        int y = arr[1];
        //Creating array to store the sequence of desired length
        int[] fib= new int[n];
        //Initialising the first elements of the array
        for(int i = 0;i<fib.length && i<2; i++){
            fib[i]=i;
        }
        //Generating the sequence of desired length in a array
        for(int i=2;i<fib.length;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        int matches = integerLength(fib,y);
        printResults(fib,matches,y);
    }
    static int integerLength(int[] arr, int length){
        int counter=0;
        for(int i : arr){
            if(digitCounter(i)==length){
                counter++;
            }
        }
        return counter;
    }
    static int digitCounter(int num){
        return Integer.toString(num).length();
    }
    static void printResults(int[] arr,int matches,int digitsLength){
        System.out.print("Sequence: ");
        for(int i : arr){
            if(i!=arr[arr.length-1]) {
                System.out.print(i + ", ");
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("There are " + matches + " elements with " + digitsLength + " digits." );
    }
}