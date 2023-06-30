//2

object StringInterpolation {
    def main(args : Array[String]) = {
        val name = "Pranav"
        val age = 21
        println(name + " is " + age + " years old")
        println(s"$name is $age years old")
        println(f"$name%s is $age%d years old")
        println("Hello \nworld")
        println(raw"Hello \nworld")
        //Comment
        /*Multiline 
        Comment*/
    }
}