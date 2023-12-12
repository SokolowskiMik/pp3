
public class C2 {
    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        System.out.println(arr(arr1,arr2));
    }

    public static boolean arr(int[] arr1, int[] arr2) {
        int counter1 = 0;
        int counter2 = 0;

        for (int i:arr1) {
            if (i/10.0 >= 1 && i/10.0 < 10) {
                counter1 ++;
            }
        }

        for (int j:arr2) {
            if (j/10.0 >= 1 && j/10.0 < 10) {
                counter2 ++;
            }
        }
        if (counter1 == counter2) {
            return true;
        } else {
            return false;
        }
    }
}
