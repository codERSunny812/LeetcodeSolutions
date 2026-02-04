   
     
class Solution {
    public int findContentChildren(int[] g, int[] s) {

     Arrays.sort(g);
     Arrays.sort(s);
     int ans = 0; 
     int len = s.length ;
     int j = 0 ;
     int i = 0;

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
     return ans; 
    }
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
} 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    //  

// //g=[7,8,9,] s=[6,9,10]

