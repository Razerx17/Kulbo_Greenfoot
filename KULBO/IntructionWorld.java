import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntructionWorld1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntructionWorld extends World
{

    /**
     * Constructor for objects of class IntructionWorld1.
     * 
     */
    public static ImagineInstructiuni image;
    
    public IntructionWorld()
    {    
        
        super(1000, 700, 1); 
        image = new ImagineInstructiuni();
        addObject(image,getWidth()/2, getHeight()/2);
        prepare();
        
        
    }
    public void prepare(){
        
        Back back = new Back();
        addObject(back, 600,650);
        addObject(new Next(), 750, 650);
    }
    
}
