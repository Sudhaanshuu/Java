class Solution {

  public int numberOfPairs(int[] nums1, int[] nums2, int k) {
    int count = 0;
    for (int s = 0; s < nums1.length; s++) {
      for (int p = 0; p < nums2.length; p++) {
        if (nums1[s] % (nums2[p] * k) == 0) {
          count++;
        }
      }
    }
    return count;
  }
}
