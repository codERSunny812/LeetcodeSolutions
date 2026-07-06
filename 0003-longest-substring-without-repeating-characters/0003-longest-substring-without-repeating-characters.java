class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int maxLen = 0;
        HashSet<Character> hp = new HashSet<>();

        for(int high = 0;high<s.length();high++){

            while(hp.contains(s.charAt(high))){
                hp.remove(s.charAt(low));
                low++;
            }




            //add to the hashset
            hp.add(s.charAt(high));

            maxLen = Math.max(maxLen,high-low+1);
        }
        return maxLen;
    }
}