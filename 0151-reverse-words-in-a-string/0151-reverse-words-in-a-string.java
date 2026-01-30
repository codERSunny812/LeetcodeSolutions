class Solution {
    public String reverseWords(String s) {
        s = s.trim();
         
        String [] arr = s.split(" "); // ["the","sky","is","blue"]
        System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder();
        
        for(int i = arr.length-1; i>=0 ; i--){
            
            if(!arr[i].isEmpty()){
            
               sb.append(arr[i].trim());
               if(i>0){
                sb.append(" ");
               }
               
            }
          
        }        
        
        return sb.toString();
        
    }
}

