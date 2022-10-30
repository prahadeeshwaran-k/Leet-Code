fun main(){
    val str = arrayOf("ru")
    val solution = LongestStr1()
    println(solution.longestCommonPrefix(str))
}
class LongestStr1 {
    fun longestCommonPrefix(strs: Array<String>): String {

        var long = ""
        for (i in 0 until (strs[0].length)){
            for (s in strs){
                if (i == s.length || s[i] != strs[0][i]){
                    return long
                }
            }
            long+=strs[0][i]
        }
        return long
    }
}