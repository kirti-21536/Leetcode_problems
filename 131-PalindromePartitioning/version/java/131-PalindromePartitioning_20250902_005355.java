// Last updated: 9/2/2025, 12:53:55 AM
class Solution {
    public List<List<String>> partition(String ques) {
        List<List<String>> ans =new ArrayList<>();
        List<String> ll=new ArrayList<>();
        Partitioning(ques,ll,ans);
       return ans;
        
    }
    public static void Partitioning(String ques,List<String> ll,List<List<String>> ans) {
        if(ques.length()==0){
            //System.out.println(ll);
            ans.add(new ArrayList<String>(ll));
            return;
        }
        for(int cut=1;cut<=ques.length();cut++){
            String s =ques.substring(0,cut);
            if(is_palindrome(s)){
                ll.add(s);
                Partitioning(ques.substring(cut),ll,ans);
                ll.remove(ll.size()-1);
            }
            
        }
        
    }
    public static boolean is_palindrome(String s1) {
        int i=0,j=s1.length()-1;
            while(i<j){
                if(s1.charAt(i)!=s1.charAt(j)){
                    return false;
                }
                i++;
                j--;
    
            }
            return true;
    
        
    }
        
    }
