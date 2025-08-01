// Last updated: 8/1/2025, 8:15:38 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]= new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
            if(numbers[i]+numbers[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return arr;
        // int arr[] = new int[2];
        // for(int i=0;i<numbers.length-1;i++){
        //     int k=i+1;
            
        //     while(k<numbers.length){
        //     if(numbers[i]+numbers[k]==target){
        //         arr[0]=i+1;
        //         arr[1]=k+1;
        //         break;

        //     }
        //     k++;
        //     }
            

        // }
        // return arr;
        
        
    }
}