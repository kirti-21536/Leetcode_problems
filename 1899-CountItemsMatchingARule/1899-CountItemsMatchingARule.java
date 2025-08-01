// Last updated: 8/1/2025, 8:14:12 PM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j=0;
        int count=0;
        if(ruleKey.equals("color")){
            j=1;
        }
        else if(ruleKey.equals("name")){
            j=2;
        }
        else{
            j=0;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(j).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}