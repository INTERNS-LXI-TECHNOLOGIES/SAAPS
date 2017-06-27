package com.lxisoft.animals;

import com.lxisoft.animalgenre.*;

import com.lxisoft.forest.*;


public class Tiger extends Animal implements carniviours
{
  

    public Tiger(String name)
    {

       super(name,20);

      int strengthLevelOfTiger=(int)(11*Math.random());

       while(strengthLevelOfTiger<7)
       {
        
          strengthLevelOfTiger=(int)(11*Math.random());

       }
       super.setStrengthLevelOfAnimal(strengthLevelOfTiger);

   }
  

     

   public void fight(Animal secondAnimal)
    {
        Animal strongestAnimal;

        System.out.print("\n\t\t -> \t"+this+"  meets "+secondAnimal);


        if(this.getStrengthLevelOfAnimal() > secondAnimal.getStrengthLevelOfAnimal())

            strongestAnimal=this;

        else if(this.getStrengthLevelOfAnimal() == secondAnimal.getStrengthLevelOfAnimal())
        {

            if(this.getHungerLevelOfAnimal() > secondAnimal.getHungerLevelOfAnimal())

                strongestAnimal= secondAnimal;

            else if((this.getHungerLevelOfAnimal() == secondAnimal.getHungerLevelOfAnimal()) && ((int)(Math.random()*2)==0))

                strongestAnimal =   this;

            else if((this.getHungerLevelOfAnimal() == secondAnimal.getHungerLevelOfAnimal()) && ((int)(Math.random()*2)==1))

                strongestAnimal =secondAnimal;

            else

                strongestAnimal= this;
        }

        else
            strongestAnimal = secondAnimal;

        System.out.println("\n\n\t\t\t\t and starts fighting...\t"+strongestAnimal+" wins atlast.!");

        int luckyFactor=(int)(6*Math.random());


        if (this!=strongestAnimal) 
        {
            if(luckyFactor!=5)
            {
            secondAnimal.increaseHungerLevelOfAnimal((int)(this.getStrengthLevelOfAnimal()/3));

            this.makeDie();
            }
            else
            {
              System.out.println("\n\n\t\t\t\t"+this+"\tescapes from\t"+secondAnimal);

              secondAnimal.increaseHungerLevelOfAnimal((int)(this.getStrengthLevelOfAnimal()/3));

              this.increaseHungerLevelOfAnimal((int)(secondAnimal.getStrengthLevelOfAnimal()/3));
            }  
        }
        else
        {
            if(luckyFactor!=5)
            {
            this.increaseHungerLevelOfAnimal((int)(secondAnimal.getStrengthLevelOfAnimal()/3));

            secondAnimal.makeDie();
            }
            else
            {    
              System.out.println("\n\n\t\t\t\t"+secondAnimal+"\tescapes from\t"+this);

              this.increaseHungerLevelOfAnimal((int)(secondAnimal.getStrengthLevelOfAnimal()/3));
              
              secondAnimal.increaseHungerLevelOfAnimal((int)(this.getStrengthLevelOfAnimal()/3));

            }    
        }


        if(luckyFactor!=5) 

           Forest.updateNumOfAnimals();
    }


    public void hunt(Animal secondAnimal)
    {
        
        System.out.print("\n\t\t ->\t"+this+" meets "+secondAnimal);

        int luckyFactor=(int)(6*Math.random());

        if(this.getHungerLevelOfAnimal() > 5)
        {
            if(this.getStrengthLevelOfAnimal() >= secondAnimal.getStrengthLevelOfAnimal())
            {
                if(luckyFactor!=5)
                {
                System.out.println("\n\n\t\t\t\t"+this+" kills the other");

                this.reduceHungerLevelOfAnimal(secondAnimal.getStrengthLevelOfAnimal());

                secondAnimal.makeDie();
                }
                else
                  System.out.println("\n\n\t\t\t\t"+secondAnimal+"\tescapes from\t"+this); 

                  this.increaseHungerLevelOfAnimal(1); 

            }

            else
            {
                if(luckyFactor!=5)
                {

                System.out.println("\n\n\t\t\t\t"+secondAnimal+" defeats the "+this);

                this.makeDie();

                }

                else
                {
                  System.out.println("\n\n\t\t\t\t"+this+"\tescapes from\t"+secondAnimal); 

                  secondAnimal.increaseHungerLevelOfAnimal(1); 
                }


            }

            if(luckyFactor!=5) 

               Forest.updateNumOfAnimals();
        
        }

        else
        {

            System.out.println("\n\n\t\t\t\t"+this+" leaves the other ");

            this.increaseHungerLevelOfAnimal(1);

        }
    }
    

}