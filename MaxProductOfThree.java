import java.util.Arrays;

class MaxProductOfThree {

    static int maxProduct(int arr[], int n) {
        
        int maxProduct;

        if (n < 3) {
            return -1;
        }

        Arrays.sort(arr);

        maxProduct = Math.max(arr[0]     * arr[1]     * arr[n - 1],
                              arr[n - 1] * arr[n - 2] * arr[n - 3]
                             );

        return maxProduct;
    }

    public static void main(String[] args){
        int[] testArray = { -20, 5, -8, 10, 15 };
        int n = testArray.length;

        int max = maxProduct(testArray, n);

        if (max == -1) {
            System.out.println("No Triplet");
        } else {
            System.out.println("Maximum product " + max);
        }
    }
}