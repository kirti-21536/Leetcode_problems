// Last updated: 11/22/2025, 8:32:35 PM
class Solution {
    public int totalWaviness(int num1, int num2) {
        int total=0;
        for(int i=num1;i<=num2;i++){
            total+=waviness(i);
        }
        return total;
    }
    public int waviness(int n){
        String s=String.valueOf(n);
        int len=s.length();
        int count=0;

        for(int i=1;i<len-1;i++){
            int prev=s.charAt(i-1)+'0';
            int curr=s.charAt(i)+'0';
            int next=s.charAt(i+1)+'0';

            if(prev<curr && next<curr)count++;
            if(prev>curr && next>curr)count++;
        }
        return count;
    }
}