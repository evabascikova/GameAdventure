/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author User
 */
public interface IThing {
    
    public String getName();
    
    public void setName(String name);
    
    public int getWeight();
    
    public void setWeight(int weight);
    
    public boolean isPickable();
    
    public void setPickable(boolean pickable);
    
}