// Last updated: 8/1/2025, 8:14:30 PM
class Solution {
    public int subarraysDivByK(int[] arr, int k) {
         int n=arr.length;
    long[] freq=new long[k];
    long sum=0;
    freq[0]=1;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        int rem=(int)(sum%k);
        if(rem<0){
            rem+=k; //-ve
        }
        freq[rem]++;
    }
    int ans=0;
    for(int i=0;i<freq.length;i++){
        if(freq[i]>=2){
            long x=freq[i];
            ans+=(x*(x-1))/2;
        }
    }
    return ans;
        
    }
}