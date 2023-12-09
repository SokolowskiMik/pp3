import java.util.Arrays;
import java.util.*;
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

        List<Integer> list1 = new ArrayList<>();
        List<Integer> uniqueList = new ArrayList<>();

        for (int number:array2) {
            list1.add(number);
        }
        
        for (int check:array1) {
            if (list1.contains(check)) {
                continue;
            } else {
                uniqueList.add(check);
            }

        }
        
        int[] diffArr = new int[uniqueList.size()];

        for (int i=0; i < uniqueList.size(); i++) {
            diffArr[i] = uniqueList.get(i);
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
        int LAST_COL = array[0].length - 1;

        for (int row=0; row < array.length; row++) {
            sum += array[row][LAST_COL];
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

    public static List<Integer> two2one(int[][] array) {
        List<Integer> oneD = new ArrayList<>();

        for (int col = 0;  col < array[0].length; col++) {
            for (int i=0; i < array.length; i++) {
                oneD.add(array[i][col]);
            }

        }
        //Collections.sort(oneD);
        return oneD;
    }

    public static String addSign(String s) {
        List<String> signedList = new ArrayList<>();
        char[] charArr = s.toCharArray();
        boolean found = false;
        for (char c:charArr) {
            if (s.indexOf(c) < s.length()-1) {
                if (found) {
                    signedList.add(c + "-");
                    found = false;
                } else {
                    signedList.add(c+"+");
                    found = true;
                }
            } else {
                signedList.add(c+"");
            }

        }
        return String.join("", signedList);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,11,9,10};
        int[] b = {1,2,3,4,5,6,7,8,9,1};
        int[][] c = {{1,3},{2,4}};
        System.out.println(even(a));
        System.out.println();
        System.out.println(positiveOdd(a));
        System.out.println();
        System.out.println(Arrays.toString(reverse(a)));
        System.out.println();
        System.out.println(compare(a,b));
        System.out.println();
        System.out.println(Arrays.toString(different(a,b)));
        System.out.println();
        System.out.println(exist(10,a));
        System.out.println(exist(10,b));
        System.out.println();
        System.out.println(secondMax(a));
        System.out.println();
        System.out.println(compare(a,b));
        System.out.println();
        System.out.println(lastColumn(c));
        System.out.println();
        System.out.println(Arrays.deepToString(swap(c)));
        System.out.println();
        System.out.println((two2one(c).toString()));

        System.out.println();
        System.out.println(addSign("pineapple"));
        System.out.println();
        System.out.println(addSign("Board"));
    }
}
