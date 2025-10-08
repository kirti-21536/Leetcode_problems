// Last updated: 10/8/2025, 11:34:39 AM
class Solution {
    public int secondHighest(String s) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                set.add(ch-'0');
            }}
        if(set.size()<=1)return -1;
        //second largest value 
        int m=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:set){
            if(num>m){
                second=m;
                m=num;
            }
            else if(num>second &&num!=m){
                second=num;
            }
        }

     return second;   
    }
}