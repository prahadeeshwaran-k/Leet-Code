fun main(){
    val str = arrayOf("hi","hiiii","hii")
    val solution = Longest()
    println(solution.longestCommonPrefix(str))
}
class Longest {
    fun longestCommonPrefix(strs: Array<String>): String {
        var long = ""
        var i =0
        while (i < strs.size){
            if(strs[i].length > long.length){
                long = strs[i]
            }
            i++
        }
        return long
    }
}