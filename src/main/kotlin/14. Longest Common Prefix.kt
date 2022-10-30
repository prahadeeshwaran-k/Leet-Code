fun main(){
    val str = arrayOf("")
    val solution = LongestStr()
    println(solution.longestCommonPrefix(str))
}
class LongestStr {
    fun longestCommonPrefix(strs: Array<String>): String {
        //Sort The array
        strs.sorted()
        //Get 1st & last String
        val str1 = strs[0]
        val str2 = strs[strs.size-1]

        var long = ""
        //Comparing a First and last string only
        if (strs.size ==1){
            long+=str1[0]
            return long
        }
        else if(strs == arrayOf("")){
            return long
        }
        else{
            for (i in 0 until str1.length-1){
                if (str1[i]!=str2[i]){
                    break
                }
                long+=str1[i]
            }
        }
        return long
    }
}