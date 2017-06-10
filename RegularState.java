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
public class RegularState implements RoadState {
    
    CarDrivingContext diriving ;
    
    public RegularState(CarDrivingContext diriving ){
        this.diriving=diriving;
    }

    @Override
    public  String left() {
        System.out.println("5");
        return "5";
    }

    @Override
    public String right() {
          System.out.println("5");
          return "5";
    }

    @Override
    public String accel() {
          System.out.println("9");
          return "9";
    }

    @Override
    public String brake() {
          System.out.println("8");
     return "8";
            
    }
    
}
