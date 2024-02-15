class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int max=0;
        int current=0;
        int left=0;
        int right=len-1;
        while(left<right){
            current = Math.min(height[left], height[right])* (right-left);
            max = Math.max(max, current);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}