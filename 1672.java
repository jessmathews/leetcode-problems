class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int cus= 0; cus< accounts.length;cus++){
            int money = 0;
            for (int acc=0;acc<accounts[cus].length;acc++) {
                money+=accounts[cus][acc];
            }
            max = Math.max(money,max);
        }
        return max;
    }
}