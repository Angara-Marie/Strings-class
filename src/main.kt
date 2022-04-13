fun main(){
    var stmt = "Today is the"
    var position= "last"
    var stmt2= "Saturday of February"
    var result= "$stmt $position $stmt2"
    println(result)
    salamy()
    fruits()
    matunda()
    majina()

}
fun salamy(){
    var name= "Tina"
    var greeting= "Hello $name, how are you today?"
    println(greeting)
}
fun fruits(){
//    var text = "Banana"
//    println(text[0])
//    println(text[1])
//    println(text[2])
//    println(text[3])
//    println(text[4])
//    println(text[5])
}
//create a string composed of
//the 3rd 4th and 5th
//characters of the string
fun matunda(){
    var texts = "Banana"
    var one=(texts[2])
    var two=(texts[3])
    var three=(texts[4])
    var results="$one$two$three"
    println(results)
}
fun majina(){
    var name = "Bob"
    var name2 = "Bob"
    var shop = "Nakumatt"
    var name3 = "robert"
    println(name==name2)
    println(name.equals(name2))
    println(name.equals("anna"))
    println(name.uppercase())
    println(shop.lowercase())
    println(name3.capitalize())
    println(shop.decapitalize())
    var empty = ""
    var blank = " "
    println(empty.isEmpty())
    println(empty.isBlank())
    println(blank.isEmpty())
    println(blank.isBlank())
    var president = " Yoweri Museveni "
    println(president)
    println(president.trim())
    println(president.trimStart())
    println(president.trimEnd())
    var sentence = "Kenya is a beautiful country"
    println(sentence.replace("Kenya", "Rwanda"))

}