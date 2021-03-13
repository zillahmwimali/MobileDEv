fun main() {
   college()
    whoami()
    sth("Haha")
    myName("Mwimali")
    myName("zinnat")
}
fun college(){
    var school="Akirachix"
    print(school[0])
    print(school[2])
    println(school[3])
}
fun whoami(){
    var x="Zillah"
    var y=21
    var statement="Hey my name is $x and I am $y years old."
    println(statement)
}
fun sth(sth:String){
    var sth="Haha"
    println(sth.length)

}
fun myName(myName:String){
    if(myName=="Mwimali"){
        println("That's me!")
    }
    else{
            println("I don't know who that is")
            }
    }


