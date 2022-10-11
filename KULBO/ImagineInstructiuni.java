import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ImagineInstructiuni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImagineInstructiuni extends Buttons
{
    /**
     * Act - do whatever the ImagineInstructiuni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img1 = new GreenfootImage("Instructiuni1.png");
    GreenfootImage img2 = new GreenfootImage("Instructiuni2.png");
    GreenfootImage img3 = new GreenfootImage("Instructiuni3.png");
    private int counter = 1;
    public ImagineInstructiuni(){
        setImage("Instructiuni1.png");
    }
    
    public void act()
    {
        switch(counter){
            case 1:
                setImage(img1);
                break;
            case 2:
                setImage(img2);
                break;
            case 3:
                setImage(img3);
                break;
            default:
                counter = 1;
                break;
        }
    }
    public void add(){
        counter++;
    }
}
