/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author User
 */
public interface IBag {
    
    public IThing add(IThing thing);
    
    public IThing delete(IThing thing);
    
    public List<IThing> getBag();
    
    public void printBag();
    
    public IThing get(String name);
    
}
