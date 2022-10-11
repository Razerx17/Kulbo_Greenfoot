import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree1 extends Trees
{
    /**
     * Act - do whatever the Trees wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    public int num = 0;
    
    public void act()
    {
      if(num == 3){
          getWorld().removeObject(this);
      }
      
    }
    
 }
