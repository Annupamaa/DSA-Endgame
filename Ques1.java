class Ques1 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int arr[] = new int[n*n+1];
        for(int[] i:grid){
            for(int j:i){
                arr[j]++;
            }
        } 
        int [] res = new int[2];
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                res[0]=i;
            }else if(arr[i]==0){
                res[1]=i;
            }
        }
        return res;
    }
}