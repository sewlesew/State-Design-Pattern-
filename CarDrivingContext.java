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
public class CarDrivingContext {
    
    
    RoadState regularState;
    RoadState gravelState;
    RoadState wetState;
    RoadState iceState;
    RoadState currentSate;
    
    public CarDrivingContext(){
        regularState=new RegularState(this);
        gravelState=new RegularState(this);
        wetState=new WetState(this);
        iceState=new IceState(this);
        
        currentSate=regularState;
        
        }
    
    public void setState(RoadState currentSate){
        this.currentSate=currentSate;
    }
    
     
    public String left() {
        return currentSate.left();
    }

    
    public String right() {
        return currentSate.right();
    }


    public String  accel() {
        return currentSate.accel();
    }

    public String brake() {
         return  currentSate.brake();
    }
    
    
            
    
}
