//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {

        fun adding(array:Array<String>):String{
            val Length = array.size
            var word:String = ""
            for(i in 0 until Length){
                word += array[i]
            }
            return word
        }

        //passing word1
        val Word1:String = adding(word1)
        //passing word2
        val Word2:String = adding(word2)

        if(Word1 == Word2){return true}
        else return false

    }
}
