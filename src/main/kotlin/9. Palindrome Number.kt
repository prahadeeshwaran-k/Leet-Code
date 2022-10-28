//https://leetcode.com/problems/palindrome-number
class Solution2 {
    fun isPalindrome(x: Int): Boolean {
        if(x<0||(x%10 ==0 && x!=0)){
            return false
        }
        var num = x
        var rev = 0
        while(num !=0){
            val digit = num%10
            rev = rev*10+digit
            num/=10
        }
        if (x==rev)
            return true
        else
            return false
    }
}