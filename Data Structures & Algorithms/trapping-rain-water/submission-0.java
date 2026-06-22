class Solution {
    public int trap(int[] height) {
        int total=0;
        for(int i=0;i<height.length;i++){
            int leftmax=0;
            for(int l=0;l<i;l++){
                leftmax = Math.max(leftmax, height[l]);
            }
            int rightmax =0;
            for(int r=i+1;r<height.length;r++){
                rightmax = Math.max(rightmax,height[r]);
            }
            int waterlevel = Math.min(leftmax,rightmax);
            int waterstored = waterlevel-height[i];

            if(waterstored>0){
                total +=waterstored;
            }
            
        }
        return total;

        
    }
}
