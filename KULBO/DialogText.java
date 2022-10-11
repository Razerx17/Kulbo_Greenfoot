import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialog_Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DialogText extends Text
{
    /**
     * Act - do whatever the Dialog_Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage text1 = new GreenfootImage("text1.png");
    GreenfootImage text2 = new GreenfootImage("text2.png");
    GreenfootImage text3 = new GreenfootImage("text3.png");
    GreenfootImage text4 = new GreenfootImage("text4.png");
    public DialogText(){
        text1.scale(300, 100);
        setImage(text1);
        text2.scale(300, 100);
        text3.scale(300, 100);
        text4.scale(300, 100);
    }
    public void addedToWorld(World world){
     
         counter = 0;
    }
    public void act()
    {
        checkClick();
        switch(counter){
            case 0:
               setImage(text1);
               
               break;
            case 1:
                setImage(text2);
                
                break;
            case 2:
                setImage(text3);
                break;
            case 3:
                setImage(text4);
                break;
        }
        
    }
    private boolean showButton = true;
    buyButton buy = new buyButton();
    sellButton sell = new sellButton();
    public int counter = 0;
    private boolean showButton1 = true;
    public void checkClick(){
        if(Greenfoot.mouseClicked(this)){
            counter++;
            
            
            if(counter > 3){
                counter = 0;
            }
            if(counter == 2){
                if(showButton){
                    getWorld().addObject(buy, getX()+90, getY()+10);
                    
                    showButton =false;
                }
            }
            if(counter == 3){
                if(showButton1){
                    getWorld().addObject(sell, getX()+90, getY() + 10);
                    
                    showButton1 = false;
                }
            }
            if(counter != 2){
                getWorld().removeObject(buy);
                showButton = true;
            }
            if(counter != 3){
                getWorld().removeObject(sell);
                showButton1 = true;
            }
        }
        
    }
   
        
}
