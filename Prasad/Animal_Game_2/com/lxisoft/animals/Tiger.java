package com.lxisoft.animals;

import com.lxisoft.forest.*;
import com.lxisoft.animalgener.*;

public class Tiger extends Animal implements Carnivore
{
  

    public Tiger(String name)
    {

       super(name,20);

      int strengthLevelOfTiger=(int)(11*Math.random());

       while(strengthLevelOfTiger<7)
       {
        
          strengthLevelOfTiger=(int)(11*Math.random());

       }
       super.setStrengthLevel(strengthLevelOfTiger);

   }
  

     

   public void fight(Animal secondAnimal)
    {
        Animal strongestAnimal;

        System.out.print("\n\t\t -> \t"+this+"  meets "+secondAnimal);


        if(this.getStrengthLevel() > secondAnimal.getStrengthLevel())

            strongestAnimal=this;

        else if(this.getStrengthLevel() == secondAnimal.getStrengthLevel())
        {

            if(this.getHungerLevel() > secondAnimal.getHungerLevel())

                strongestAnimal= secondAnimal;

            else if((this.getHungerLevel() == secondAnimal.getHungerLevel()) && ((int)(Math.random()*2)==0))

                strongestAnimal =   this;

            else if((this.getHungerLevel() == secondAnimal.getHungerLevel()) && ((int)(Math.random()*2)==1))

                strongestAnimal =secondAnimal;

            else

                strongestAnimal= this;
        }

        else
            strongestAnimal = secondAnimal;

        System.out.println("\n\n\t\t\t\t and starts fighting...\t\t"+strongestAnimal+" wins atlast.!");

        if (this!=strongestAnimal) 
        {
            if((int)(6*Math.random())!=5)
            {
            secondAnimal.increaseHungerLevel((int)(this.getStrengthLevel()/2));

            this.makeDie();

            Forest.updateNoOfAnimals();
            }
            else
              System.out.println(this+"\n\n\t\t\t\tescapes from\t"+secondAnimal);
              secondAnimal.increaseHungerLevel((int)(this.getStrengthLevel()/3));
              this.increaseHungerLevel((int)(secondAnimal.getStrengthLevel()/3));  
        }
        else
        {
            if((int)(6*Math.random())!=5)
            {
            this.increaseHungerLevel((int)(secondAnimal.getStrengthLevel()/2));

            secondAnimal.makeDie();

            Forest.updateNoOfAnimals();
            }
            else
              System.out.println(secondAnimal+"\n\n\t\t\t\tescapes from\t"+this);

              this.increaseHungerLevel((int)(secondAnimal.getStrengthLevel()/3));

              secondAnimal.increaseHungerLevel((int)(this.getStrengthLevel()/3));  
        }



        
    }


    public void hunt(Animal secondAnimal)
    {
        System.out.print("\n\t\t ->\t"+this+" meets "+secondAnimal);

        if(this.getHungerLevel() > 5)
        {
            if(this.getStrengthLevel() >= secondAnimal.getStrengthLevel())
            {
                if((int)(6*Math.random())!=5)
                {
                System.out.println("\n\n\t\t\t\t"+this+" kills "+secondAnimal);

                this.reduceHungerLevel(secondAnimal.getStrengthLevel());

                secondAnimal.makeDie();

                Forest.updateNoOfAnimals();
                }
                else
                  System.out.println(secondAnimal+"\n\n\t\t\t\tescapes from\t"+this); 

                  this.increaseHungerLevel(1); 

            }

            else
            {

                System.out.println("\n\n\t\t\t\t"+secondAnimal+" defeats "+this);

                this.makeDie();

                Forest.updateNoOfAnimals();


            }

            
        }

        else
        {

            System.out.println("\n\n\t\t\t\t"+this+" leaves "+secondAnimal);

            this.increaseHungerLevel(1);

        }
    }
    

}