class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> hp = new HashMap<>();

        for(int i = 0;i<fruits.length;i++){
         
         hp.put(fruits[i],hp.getOrDefault(fruits[i],0)+1);


         while(hp.size() > 2){
            hp.put(fruits[left],hp.getOrDefault(fruits[left],0)-1);


            if(hp.get(fruits[left]) == 0){
                hp.remove(fruits[left]);
            } 
            left++;
         }

         maxLen = Math.max(maxLen,i-left +1);

        }

        return maxLen;
    }
}