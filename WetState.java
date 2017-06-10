/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author USER
 */
public class WetState implements RoadState{
    
     CarDrivingContext diriving ;
    
    public WetState(CarDrivingContext diriving ){
        this.diriving=diriving;
    }

    @Override
    public String left() {
          System.out.println("4");
          return "4";
    }

    @Override
    public String right() {
           System.out.println("4");
           return "4";
    }

    @Override
    public String accel() {
       System.out.println("9");
       return "9";
    }

    @Override
    public String brake() {
        System.out.println("7");
        return "7";
    }
}
