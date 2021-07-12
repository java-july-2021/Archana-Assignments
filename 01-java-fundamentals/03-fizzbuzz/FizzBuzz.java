
public class FizzBuzz{

    public static void divisibleByThree(int a ){

        if(a%3==0 && a%5==0){
            System.out.println("FizzBuzz");

            
        } else {
            if(a%5==0){
            System.out.println("Buzz");
            
            }else{
                if(a%3==0 ){
            System.out.println("Fizz");
            } else{

                System.out.println(a);
            }

        }
    }

    }    
        
        public static void main (String ar[]){

            divisibleByThree(15);

        }
    








}