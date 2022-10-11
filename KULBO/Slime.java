import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Actor
{
    GreenfootImage normal = new GreenfootImage("slimeNormal.png");
    GreenfootImage land = new GreenfootImage("slimeLand.png");
    GreenfootImage jump = new GreenfootImage("slimeJump.png");
    public Slime(){
         normal.scale(50,50);
         land.scale(50,50);
         jump.scale(50,50);
         setImage(normal);
         playerHurt.scale(100,80);
    }
    public void act()
    {
      if(!Player.isDead){
      setPosition();
      jumpOnPlayer();
      hitPlayer();
      colision();
      plCheck();
    
      if(timer > 0){
          timer--;
      }
    }
    }
    int timer = 0;
    int hits = 0;
    int canAttackTimer = 0;
    public Vector velocity = new Vector(1,1);
    public Vector aSub = new Vector(1,1);
    GreenfootSound sound = new GreenfootSound("hit.mp3");
    MouseInfo mouse = Greenfoot.getMouseInfo();
    public void plCheck(){
        List<Player> l = getObjectsInRange(82, Player.class);
        
        if(!l.isEmpty()){
           for(Player a : l ){
               
               if(a.jeda > 0 && Greenfoot.mouseClicked(null) && !Player.keyspressed){
                  hits++;
                  float dis = Fn.distance(Player.x, Player.y, getX(), getY());
                  float value = Fn.map(dis, 0,100, (float)1.3,0);
                  aSub = Fn.moveInDirection(Player.x, Player.y, getX(), getY());
                  aSub.mult((float)-0.3);
                  aSub.mult(value);
                  velocity.set(aSub.x, aSub.y);
                  
                  if(timer == 0){
                      sound.play();
                      timer = 10;
                  }
                  
                  if(hits == 3){
                      
                      getWorld().addObject(new SilmeBaby(), 1200, 800);
                      death();
                      
                }
               }
           }
        }
        
    }
    GreenfootImage playerHurt = new GreenfootImage("playerHurt.png");
    
    int timerHurt = 0;
    public Vector plVel = new Vector(1,1);
    public Vector pSub = new Vector(1,1);
    public void jumpOnPlayer(){
        List<Player> b = getObjectsInRange(35, Player.class);
        List<Player> l = getObjectsInRange(220, Player.class);
             int getRot = getRotation();
             
            for(Player a: l){
                 turnTowards(a.getX(), a.getY());
            }
             if(!b.isEmpty()){
                for(Player a : b){
                    a.takeDamage(3);
                    Vector bSub = new Vector(1,1);
                    bSub = Fn.moveInDirection(a.getX(),a.getY(), getX(), getY());
                    bSub.mult(0.3f);
                    a.setPosition(bSub);
                }
            }
            else
             if(!l.isEmpty()){
              animation();
                 move(1);
             }
        
        setRotation(getRot);
             
    }
    public void hitPlayer(){
        List<Player> l = getObjectsInRange(40, Player.class);
        if(!l.isEmpty()){
            
        }
    }
    public void setPosition(){
        if(velocity.mag() > 1.5){
            setLocation(getX()+ (int)velocity.x, getY() + (int)velocity.y);
            velocity.mult((float)0.9);
        }
        else
         velocity.set(1,1);
    }
    public int animationTimer = 0;
    public void animation(){
     if(animationTimer > 10){
         setImage(normal);
     }
     else
     if(animationTimer > 0){
         setImage(land);
    }
     animationTimer--;
     if(animationTimer < 0){
         animationTimer = 20;
     }
     
 } 
 public void death(){
                 for(int i = 0; i < Greenfoot.getRandomNumber(10); i++){
                      SlimeBall slime = new SlimeBall();
                      getWorld().addObject(slime,getX(),getY());
                  }
                  if(Greenfoot.getRandomNumber(101) > 97 && !Player.monsterkey){
                      Key key  = new Key();
                      getWorld().addObject(key, getX(), getY());
                      Player.monsterkey = true;
                  }
                   
                  getWorld().removeObject(this);
 }
 public void colision(){
    List<Trees> trees;
    trees = getObjectsAtOffset(0, 0, Trees.class);
    
    
    if(!trees.isEmpty() ){
       for(Trees a : trees){
           if(getY() < a.getImage().getHeight()/2 + a.getY() - 30 && getY() > a.getY() - (a.getImage().getHeight()/2) + 30 ){
           if(getX() < a.getX()){
               setLocation(getX()-1,getY());
           }
           if(getX() > a.getX()){
               setLocation(getX()+1,getY());
           }
        }
        else{
           if(getY() > a.getY()){
               setLocation(getX(), getY()+1);
           }
           if(getY() < a.getY()){
               setLocation(getX(), getY()-1);
           }
        }
       }
    }
   
 }
}       
   
   
