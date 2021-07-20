class Gorilla extends Mammal{

    int defaultEnergyLevel=100;


    public Gorilla (){


    }

    public setdefaultEnergyLevel(){

        this.eneryLevel=defaultEnergyLevel;

    } 

    public getdefaultEnergyLevel(){
        return this.eneryLevel;
    }


   public void  throwSomething(){

   

    

    System.out.println("gorrilla has thrown somethings");

    energyLevel -=5;
    
    

   }

     public boolean eatBananas(){

         

        System.out.println("Gorrill's got a Banana, Increased the level by 1 " +eneryLevel);

        energyLevel +=10;

         
     }

     public boolean climb(){
        
        System.out.println("Gorrill's got a Banana, Increased the level by 1 "+eneryLevel);
    
            energyLevel -=10;
             

     }
}
