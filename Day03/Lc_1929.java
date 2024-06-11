package Com;
//Leetcode Lc1929
class Lc_1929 {
    public int[] getConcatenation(int[] nums) {
        int[] nums1=new int[nums.length*2];
        int p=nums.length;
        for(int i=0;i<p;i++){
            nums1[i]=nums[i];
            nums1[i+p]=nums[i];
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] n1={1,2,1};
        int[] n2={1,3,2,1};
        Lc_1929 l1=new Lc_1929();
        l1.getConcatenation(n1);
        l1.getConcatenation(n2);
    }
}
