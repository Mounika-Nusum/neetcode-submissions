class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sm = s.toCharArray();
        char[] tm = t.toCharArray();
        Arrays.sort(sm);
        Arrays.sort(tm);
        return Arrays.equals(sm,tm);
        
    }
}
