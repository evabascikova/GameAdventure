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
    
    public boolean isVisible();
    
    public void setVisible(boolean visible);
    
    @Override
    public boolean equals(Object o);
    
    @Override
    public String toString();
    
}
