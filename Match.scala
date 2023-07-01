//6 

object Match{
    def main(args : Array[String]) = {
        val age = 21;

        age match {
            case 20 => println(age);
            case 22 => println(age);
            case 25 => println(age);
            case 21 => println(age);  

            //default
            case _ => println("default");          
        }

        val num = 8;

        num match {
            case 1 | 3 | 5 | 7 | 9 => println("Odd");
            case 2 | 4 | 6 | 8 | 10 => println("Even");

            case _ => println("Default");
        }
    }
}