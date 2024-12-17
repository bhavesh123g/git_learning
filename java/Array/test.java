public class test {
  public static void main(String[] args) {
    int[] arr = ArrayUtility.inputarray();
    findDupEle(arr);
  }

  public static void findDupEle(int[] arr) {
    boolean[] printed = new boolean[arr.length]; // Auxiliary array to mark printed elements

    for (int i = 0; i < arr.length; i++) {
      if (printed[i]) {
        // If this element has already been printed, skip it
        continue;
      }

      boolean isDuplicate = false;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          isDuplicate = true;
          printed[j] = true; // Mark this duplicate as printed
        }
      }

      if (isDuplicate) {
        System.out.println(arr[i]);
        printed[i] = true; // Mark the original element as printed
      }


    }


    
  }
}
