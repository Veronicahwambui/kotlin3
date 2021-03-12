fun main() {
    text()
    var identity=char("veronicah",20)
    println(identity)
    println(length("place"))
    println(condition("veronicah","That's me !"))

}
fun text() {
    val school="akirachix"
    val part1 = school[0]
    val part2 = school[2]
    val pat3 = school[3]
    println("$part1$part2$pat3")

}
fun char(name:String,age:Int):String{
    return "Hi, my name is $name i am $age years old"

}
fun length(text:String):Int{
    var any=text.length
    return any

}
fun condition(name: String,reply:String){
    if (name == "veronicah"){
        println(reply)
    }
    else{
        println("I dont know who that is")

    }    }









