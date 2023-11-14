public class MyArrays {
    public static int odd(int[] array) {
        int counter = 0;
        for (int i:array) {
            if (i%2!=0 && i > 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int above(int[] array) {
        int mean = 0;
        int counter = 0;
        int sum = 0;
        for (int i:array) {
            counter++;
            sum += i;
        }
        mean = sum/counter;
        sum = 0;
        for (int j:array) {
            if (j>mean) {
                sum+=j;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,2,-5,4,1,-7};
        int[] arr2 = {5,2,7,4,2}; 
        System.out.println(MyArrays.odd(arr1));
        System.out.println(MyArrays.above(arr2));
    }
}
