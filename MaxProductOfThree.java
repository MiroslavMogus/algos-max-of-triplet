import java.util.Arrays;

class MaxProductOfThree {

    static int maxProduct(int arr[], int n) {
        
        int maxProduct;

        /*
        * Not a triplet.
        */

        if (n < 3) {
            return -1;
        }

        Arrays.sort(arr);

        /*
        * Most important part.
        * Negative and negative number give a positive one.
        * This is the reason for the first check.
        * Example: -20 * -8 = 160 * 15 = 2400
        */
        
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