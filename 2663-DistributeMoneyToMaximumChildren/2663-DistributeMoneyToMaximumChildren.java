// Last updated: 1/13/2026, 11:11:12 AM
class Solution {
    public int distMoney(int money, int children) {
        if(money<children)return -1;

        money=money-children; //compulsory 1 to each child
        int left=Math.min(money/7,children);
        money=money-left*7;
        children=children-left;

        if(children==0 && money>0){
            left--;
        }
        else if(children==1 &&money==3){
            left--;
        }
        return left;
    }
}