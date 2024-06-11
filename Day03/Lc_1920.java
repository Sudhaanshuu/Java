package Com;

class Lc_1920 {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            nums[i] = nums[i] + n*(nums[nums[i]] % n);
        }
        for(int i=0; i<n; i++){
            nums[i] = nums[i]/n;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] n1={1,3,5,6};
        Lc_1920 l1= new Lc_1920();
        l1.buildArray(n1);
    }
}
