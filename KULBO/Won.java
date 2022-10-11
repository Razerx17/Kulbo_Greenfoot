import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Won here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Won extends World
{

    /**
     * Constructor for objects of class Won.
     * 
     */
    public Won()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        prepare();
    }

    public void prepare(){

        youWin youWin = new youWin();
        addObject(youWin,473,352);
        youWin.setLocation(421,324);
        youWin.setLocation(416,306);
        youWin.setLocation(500,318);
        restart restart = new restart();
        addObject(restart,235,551);
    }
}
