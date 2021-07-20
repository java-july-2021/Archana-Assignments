public class Bat extends Spacimen {

    int defaultEnergyLevel=300;

    public Bat(){


    }

    public void fly(){
        this.energyLevel-=50;

        System.out.println("Flap-Falp-Flap");


    }

    public void eatHumans(){

        this.energyLevel+=25;
        System.out.println("so- well, never mind");

    }
    public void attackTown(){

        this.energyLevel-=100;
        System.out.println("hinhong------hinghong----hinghong -----");

    }
}
