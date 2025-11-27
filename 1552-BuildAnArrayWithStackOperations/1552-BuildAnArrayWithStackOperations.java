// Last updated: 11/27/2025, 11:46:08 PM
class Solution {
    public List<String> buildArray(int[] arr, int n) {
        List<String> ll=new ArrayList<>();
        int k=0;
        int i=1;
        while(i<=n && k<arr.length){
            if(arr[k]==i){
                ll.add("Push");
                k++;
                i++;
            }
            else{
                while(arr[k]>i){
                    ll.add("Push");
                    ll.add("Pop"); 
                    i++;     
            }
            }
        }
        return ll;
    }
}