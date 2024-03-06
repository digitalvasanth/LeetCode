class Solution {
    public int differenceOfSum(int[] nums) {
        int elsum=0;
        int digsum=0;
        for(int i=0;i<nums.length;i++){
            elsum+=nums[i];
            
       int val=nums[i];
       int x;
       while(val>0){
           x=val%10;
           digsum+=x;
           val=val/10;
       }
        }
        return Math.abs(elsum-digsum);
    }
}
