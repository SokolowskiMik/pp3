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
        for (int i=array.length-1; i <= 0; i--) {
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
        boolean flag=false;
        for (int i:array1) {
            for (int j:array2) {
                if (flag == false) {
                    if (i==j) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            } 
            if (flag == false) {
                counter++;
            }
        }
        
        int[] different = new int[counter];
        for (int i:array1) {
            for (int j:array2) {
                if (flag == false) {
                    if (i==j) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            } 
            if (flag == false) {
                different[iterator] = i;
                iterator++;
            }
        }
        return different;
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
        int max = 0;
        
        for (int i=0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int j=0; j < array.length; j++) {
            array[j] = array[j]-max;
        }
        int secondMax = 0-max;
        for (int nd:array) {
            if (nd < 0 && nd > secondMax) {
                secondMax = nd;
            }
        }
        return secondMax+max;
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
        for (int i=0; i < array.length; i++) {
            for (int col = 0; col < array[0].length-2; col++) {
               newArray[i][col] = array[i][col]; 
            }
        }
        for (int i=0; i < array.length; i++) {
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
        int[] a = {1,2,3,4,5,6,7,8,9,10};
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
