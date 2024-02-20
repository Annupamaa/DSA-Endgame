class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int windowSize = 0;
        //variable - longest
        //sliding window - substring

        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<s.length(); i++){ 
            while(freq.getOrDefault(s.charAt(i), 0)==1){
                freq.put(s.charAt(start), 0);
                start++;
            }
        
            freq.put(s.charAt(i), 1); 
            windowSize = Math.max(windowSize, i-start+1);  
        }
        return windowSize;
    }
} 


