// Last updated: 1/13/2026, 11:11:02 AM
class Solution {
    public String minimizeStringValue(String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            if(c!='?')freq[c-'a']++;
        }
        List<Character> arr= new ArrayList<>();
        for(char c:s.toCharArray()){ 
            if(c=='?'){
                int min=Integer.MAX_VALUE;
                int idx=0;
                for(int j=0;j<26;j++){
                    if(freq[j]<min){
                        min=freq[j];
                        idx=j;
                    }
                }
                arr.add((char)('a'+idx));
                freq[idx]++;
            }
        }
        Collections.sort(arr);

        char[] arr1 = s.toCharArray();
        int p = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == '?') {
                arr1[i] = arr.get(p++);
            }
        }

        return new String(arr1);
        
    }
}