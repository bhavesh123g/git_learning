public class text {
  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();
    System.out.println(maxWater(arr));
  }
  

    static int maxWater(int[] arr) {
        int res = 0;

        // For every element of the array
        for (int i = 1; i < arr.length - 1; i++) {
          //System.out.println(arr[i]);

            // Find the maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);


                System.out.println("left : "+left);
            // Find the maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++)
                right = Math.max(right, arr[j]);

            // Update the maximum water
            res += Math.min(left, right) - arr[i];
        }

        return res;
    }

}