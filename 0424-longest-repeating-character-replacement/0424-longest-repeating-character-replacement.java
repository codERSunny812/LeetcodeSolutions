class Solution {
    public int characterReplacement(String s, int k) {
        
        int low = 0, res = Integer.MIN_VALUE,maxFreq=0;

        HashMap<Character,Integer> hp = new HashMap<>();

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            //add element to the hashset
            hp.put(ch,hp.getOrDefault(ch,0)+1);

            int len = i - low +1;
            maxFreq = Math.max(maxFreq,hp.get(ch));
            int replacement = len - maxFreq;


            //check for the incorrect case 

            while(replacement > k){
                char left = s.charAt(low);

                hp.put(left, hp.get(left)-1);

                low++;

                len = i - low + 1;
                replacement = len - maxFreq;

            }



            // the corrrect case 

            if(replacement < k || replacement == k){
                len =  i - low +1;
                res = Math.max(res,len);
            }



        }

        return res;
    }
}