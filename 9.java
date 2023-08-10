class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int revnum = reverse(x);
            if (revnum == x) {
                return true;
            } else {
                return false;
            }
        }
    }
    public int reverse(int num) {
        int rev =0;
        while (num>0) {
            int rem = num %10;
            rev= (rev*10)+rem;
            num = num /10;
        }
        return rev;    
    }
}