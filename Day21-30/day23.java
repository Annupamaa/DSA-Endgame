class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            num.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(num.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int[] result = new int[res.size()];
        int i=0;
        for(int value : res){
            result[i] = value;
            i++;
        }
        return result;
    }
}