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
public class IceState implements RoadState{
    
    CarDrivingContext diriving ;
    
    public IceState(CarDrivingContext diriving ){
        this.diriving=diriving;
    }

    @Override
    public String left() {
        System.out.println("1");
        return "1";
    }

    @Override
    public String right() {
        System.out.println("1");
        return "1";
    }

    @Override
    public String accel() {
        System.out.println("3");
        return "3";
    }

    @Override
    public String brake() {
        System.out.println("2");
        return "2";

    }
    
}
