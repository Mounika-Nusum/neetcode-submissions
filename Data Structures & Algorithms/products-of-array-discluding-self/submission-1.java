class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1;
        int s = 1;
        int ans[] = new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
            ans[i]= p;
            p *=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i] *=s;
            s *= nums[i];
        }
        return ans;
    }
}  
