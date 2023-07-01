//5

object For{
    def main(args : Array[String]) = {
        for(a <- 1 to 5) {
            println("a = " + a);
        }

        //or
        for(b <- 1 until 5) {
            println("b = " + b);
        }

        //multiple range
        for(i <- 1 to 5; j <- 1 to 3) {
            println("i = " + i + " j = " + j )
        }

        //list
        val lst = List(1,2,3,4,5);
        for(k <- lst){
            println("List - " + k);
        } 

        //filtering
        for(k <- lst; if k < 4){
            println("Using filters " + k);
        }

        //for as a expression
        val result = for {i <- lst; if i < 6} yield {
            i * i
        }
        println("Result = " + result);
    }
}