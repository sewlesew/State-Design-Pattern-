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
public class GravelState implements RoadState{
     CarDrivingContext diriving ;
    
    public GravelState(CarDrivingContext diriving ){
        this.diriving=diriving;
    }

    @Override
    public String  left() {
 
        System.out.println("3");
        return "3";
    }

    @Override
    public String right() {
 System.out.println("3");
  return "3";
    }

    @Override
    public String accel() {
        System.out.println("7");
        return "7";
    }

    @Override
    public String brake() {
        System.out.println("6");
        return "6";
    }
    
}
