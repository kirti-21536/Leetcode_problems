// Last updated: 8/1/2025, 8:16:42 PM
class Solution {
    static String[] key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        String ques=digits;
        List<String> ll= new ArrayList<>();
        if(ques.length()==0){
            return ll;

        }
        print(ques,"",ll);
        return ll;
    }
     public static void print(String ques,String ans,List<String> ll){
        if(ques.length()==0){
            ll.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        String getString=key[ch-'0'];
        for(int i=0;i<getString.length();i++){
            print(ques.substring(1),ans+getString.charAt(i),ll);

        } 
    }
}