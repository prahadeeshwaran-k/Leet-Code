//13. Roman to Integer
//https://leetcode.com/problems/roman-to-integer/

fun main(args: Array<String>) {
    val Roman = Roman()
    println( Roman.romanToInt("MCMXCIV"))
}
class Roman {
    fun romanToInt(s: String): Int {
        val vaule = mapOf<String,Int>(Pair("I",1),Pair("V",5),Pair("X",10),Pair("L",50),Pair("C",100),Pair("D",500),Pair("M",1000))
        var result = 0
        val length:Int = s.length
            for(i in 0 until length){
                if(((i+1) < length) && (vaule.getValue(s[i].toString()) < vaule.getValue(s[i+1].toString()))){
                    result -= vaule.getValue(s[i].toString())
                }
                else{
                    result += vaule.getValue(s[i].toString())
                }
        }
        return result
    }
}