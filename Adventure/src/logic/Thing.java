/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import interfaces.IThing;

/**
 *
 * @author Eva
 */
public class Thing implements IThing {
    private String name;
    private int weight;
    private boolean visible;
    private boolean pickable;
    
    public Thing(String name, int weight, boolean visible, boolean pickable) {
        this.name = name;
        this.weight = weight;
        this.visible = visible;
        this.pickable = pickable;
            
    }
    public Thing(String name){
        this.name = name;
        this.visible = true;
        this.pickable = true;
        this.weight = 1;
    }
    
    public String getName () {
        return name;
    }
   
    public void setName (String name){
        this.name = name;
    }
    
    public int getWeight(){
        return weight;
        
    }
    
    public void setWeight (int weight){
        if (weight > 0)
           this.weight = weight;
    }
    
    public boolean isVisible (){
        return visible;
    }
    public void setVisible (boolean visible){
        this.visible = visible;
        
    }
    
    public boolean isPickable (){
        return pickable;
    }
    
    public void setPickable (boolean pickable){
        this.pickable = pickable;
    }
    
    @Override
    public String toString (){
        return name;
    }
    
    @Override
    public boolean equals (Object o){
        
        if (o instanceof Thing){
            Thing thing = (Thing)o;
            
            if (name.equals(thing.getName()) == true) {
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }
}
