class Solution {
    public int findContentChildren(int[] g, int[] s) {

     Arrays.sort(g);
     Arrays.sort(s);
     int ans = 0; 
     int len = s.length ;
     int j = 0 ;
     int i = 0;
     
     //g = [1,2,3] , s=[3]
     
     while(i<g.length && j < s.length){
        if(g[i]<=s[j]){
            i++;
            ans++;
            j++;
        }
        else{
         j++;
            
        }
        
     }
     
     
     
    //  for(int i = 0 ; i < len ; i++){
    //     while(j < g.length && g[j]<=s[i]){
    //         ans++;
    //         j++;
    //         break;
    //     }
    //  }  
     return ans; 
    }
}// each child at most one cookie.      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    //  

// //g=[7,8,9,] s=[6,9,10]

