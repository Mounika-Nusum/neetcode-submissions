class Solution {
    public int characterReplacement(String s, int k) {
        int[] longest = new int[26];

        int left =0;
        int freq = 0;
        int len = 0;
        for(int right =0;right<s.length();right++){
            longest[s.charAt(right)-'A']++;
            freq = Math.max(freq, longest[s.charAt(right)-'A']);
            int size = right -left +1;
            if(size - freq>k){
                longest[s.charAt(left)-'A']--;
                left++;
            }
            len = Math.max(len, right-left+1);
        }
        return len;

        
    }
}
