//https://leetcode.com/problems/two-sum/
class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        for(i  in 0 until (nums.size)){
            for(j in i..nums.size){
                if (nums[i]+nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }

        }
        return intArrayOf()

    }
}