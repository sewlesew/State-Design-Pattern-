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
public interface RoadState{
    
    public String left();
    public String right();
    public String  accel();
    public String  brake();
    
}
