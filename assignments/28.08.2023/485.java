class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum=0;
        int i=0;
        while(i<nums.length){
            int cons=0;
            while(i< nums.length && nums[i]==1){
                cons++;
                i++;
                }
        maximum=Math.max(maximum,cons);
        i++;
        }
        return maximum;
    }
}