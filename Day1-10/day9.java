class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n= nums.length;
        int [] arr= new int[n+1];
        for(int i:nums){
            arr[i]++;
        }
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                res.add(i);
            }
        }
        return res;
    }
}

