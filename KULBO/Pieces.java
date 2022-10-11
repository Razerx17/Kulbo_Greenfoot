import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Pieces extends Bomb
{
    public int vx = 0,vy =0, rot = 0; 
    public Pieces(GreenfootImage img){
        addedToWorld();
        GreenfootImage image = new GreenfootImage(10,10);
        image.drawImage(img,-Greenfoot.getRandomNumber(img.getWidth()),-Greenfoot.getRandomNumber(img.getHeight()));
        setImage(image);
    }
    public void addedToWorld(){
        vx=-10 + Greenfoot.getRandomNumber(20);
        vy=-10 + Greenfoot.getRandomNumber(20);
        rot=-10 + Greenfoot.getRandomNumber(20);
        if(vx == 0) vx=1;
        if(vy == 0) vy=1;
    }
    
    public void act()
    {
        setLocation(getX()+vx, getY() + vy);
        
        if(vx > 0){
            vx--;
        }
        if(vx < 0){
            vx++;
        }
        if(vy > 0){
            vy--;
        }
        if(vy < 0){
            vy++;
        }
        if(vx < 2 && vx > -2){
            vx = 0;
        }
        if(vy < 2 && vy > -2){
            vy = 0;
        }
        while(getY() > 612){
            setLocation(getX(), 612);
        }
        collision();
    }
    public void collision(){
        List<Trees> trees;
        trees = getObjectsAtOffset(0, 0, Trees.class);    
        if(!trees.isEmpty() ){
            
         for(Trees a : trees){
             
            if(getY() < a.getImage().getHeight()/2 + a.getY() - 30 && getY() > a.getY() - (a.getImage().getHeight()/2) + 30 ){
            if(getX() < a.getX()){
               setLocation(getX()-3,getY());
            }
            if(getX() > a.getX()){
               setLocation(getX()+3,getY());
            }
           }
           else{
            if(getY() > a.getY()){
               setLocation(getX(), getY()+3);
            }
            if(getY() < a.getY()){
               setLocation(getX(), getY()-3);
            }
          }
         }
        }
        
        Actor actor = getOneIntersectingObject(Player.class);
        if(actor != null){
            Player.wood+=1;
            
            getWorld().removeObject(this);
        }
        
    }
}
