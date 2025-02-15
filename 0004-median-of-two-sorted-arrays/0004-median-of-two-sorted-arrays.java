class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int m = nums1.length;
       int n = nums2.length;
        int[] newArr = new int[m+n];
        int p =0;   
        for(int i=0;i<m;i++){
            newArr[p++] = nums1[i];
        } 
        for(int i=0;i<n;i++){
            newArr[p++]=nums2[i];
        }
     

        int length = newArr.length;
        double average =0.0;
        Arrays.sort(newArr);
        
    
        if(length % 2 != 0){

        average = (double) newArr[length/2];
        }
        else{
            int mid1= newArr[(length-1)/2];
            int mid2 = newArr[length/2];
            return (double) (mid1+mid2)/2.0;
        }
        return average;
    }
}