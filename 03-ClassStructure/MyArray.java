import java.util.Arrays;

public class MyArray {
    public static int even(int[] array) {
        int evenCounter = 0;
        for (int i:array) {
            if (i%2==0) {
                evenCounter++;
            }
        }
        return evenCounter;
    }

    public static int positiveOdd(int[] array) {
        int counter = 0;
        for (int i:array) {
            if (i%2!=0 && i > 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        int j = 0;
        for (int i=array.length-1; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }
        return reversed;
    }

    public static boolean compare(int[] array1, int[] array2) {
        return Arrays.equals(array1,array2);
    }

    public static int[] different(int[] array1, int[] array2) {
        int counter = 0;
        int iterator = 0;
        int arrayLengthCounter = 0;
        int[] different = new int[array1.length];
        for (int i=0; i <= array1.length-1; i++){
            counter = 0;
            for (int j = 0; j <= array2.length - 1; j++) {
                if (array1[i] != array2[j]) {
                    counter ++;
                }
            }
            if (counter == array2.length) {
                different[iterator] = array1[i];
                iterator ++;
                arrayLengthCounter ++;
            }
        }

        int[] diffArr = new int[arrayLengthCounter];

        for (int i=0; i < arrayLengthCounter; i++) {
            diffArr[i] = different[i];
        }
        return diffArr;
    }

    public static boolean exist(int number, int[] array) {
        Arrays.sort(array);
        if (Arrays.binarySearch(array, number) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int secondMax(int[] array) {
        Arrays.sort(array);
       return array[array.length-2];
    }

    public static int lastColumn(int[][] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            for (int col = 0; col < array[0].length; col++) {
                if (col == array[0].length) {
                    sum += array[i][col];
                }
            }
        }
        return sum;
    }

    public static int[][] swap(int[][] array) {
        int[][] newArray = new int[array.length][array[0].length];
        for (int i=array.length-1; i >= 0 ; i--) {
            for (int col = array[0].length-1; col >= array[0].length-2; col--) {
               newArray[i][col] = array[i][col]; 
            }
        }
        return newArray;

    }

    public static int[] two2one(int[][] array) {
        int[] newArray = new int[array.length+array[0].length]; 
        for (int i=0; i < array.length; i++) {
            for (int col = 0; col < array[0].length; col++) {
                newArray[i+col] = array[i][col];
            }

        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,11,9,10};
        int[] b = {1,2,3,4,5,6,7,8,9,1};
        int[][] c = {{1,3},{2,4}};
        System.out.println(even(a));
        System.out.println(positiveOdd(a));
        System.out.println(Arrays.toString(reverse(a)));
        System.out.println(compare(a,b));
        System.out.println(Arrays.toString(different(a,b)));
        System.out.println(exist(10,a));
        System.out.println(exist(10,b));
        System.out.println(secondMax(a));
        System.out.println(compare(a,b));
        System.out.println(lastColumn(c));
        System.out.println(Arrays.deepToString(swap(c)));
        System.out.println(Arrays.toString(two2one(c)));
    }
}
