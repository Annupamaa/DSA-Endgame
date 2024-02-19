class Solution{
    public int[][] merge(int[][] intervals){
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        for(int i=1; i<intervals.length; i++){
            if(intervals[0][1] >= intervals[i][0]){
                intervals[0][1] = Math.max(intervals[0][1], intervals[i][1]);
            }else {
                result.add(intervals[0]);
                intervals[0] = intervals[i];
            }
        }
        
        result.add(intervals[0]);

        return result.toArray(new int[result.size()][]);
    }
}




