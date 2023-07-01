//7 

object Function {
    object Square {
        def sq(x : Int) : Int = {
            return x * x;
        }
    }
    //Method 1
    def add(x : Int, y : Int) : Int = {
        return x + y;
    }

    //Method 2
    def subtract(x : Int, y : Int) : Int = {
        x - y; //no return keyword mentioned
    }           // last line of the func will be returned

    //Method 3
    def multiply(x : Int, y : Int) : Int = return x * y;

    //Method 4
    def divide(x : Int, y : Int) = x / y; //Return type is not needed

    def main(args : Array[String]) = {
        println(add(12,34));
        println(subtract(40,25));
        println(multiply(12,5));
        println(divide(12,4));
        println(Square.sq(20)); //Method 1
        println(Square sq 10); //Method 2 
    }
}