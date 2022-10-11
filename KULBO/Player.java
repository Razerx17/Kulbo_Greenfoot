import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int coins = 0 ;
    public static int bombs = 0;
    public static int keys = 0;
    public static int slimeBalls = 0;
    public static boolean monsterkey = false;
    public static int HP = 40;
    public static int stone = 0;
    
    GreenfootImage def;
    GreenfootImage fdef;
    
    GreenfootImage atk1;
    GreenfootImage atk2;
    GreenfootImage atk3;
    GreenfootImage atk4;
    
    GreenfootImage fatk1;
    GreenfootImage fatk2;
    GreenfootImage fatk3;
    GreenfootImage fatk4;
    
    GreenfootImage run1;
    GreenfootImage run2;
    GreenfootImage run3;
    GreenfootImage run4;
    GreenfootImage run5;
    GreenfootImage run6;
    
    GreenfootImage frun1;
    GreenfootImage frun2;
    GreenfootImage frun3;
    GreenfootImage frun4;
    GreenfootImage frun5;
    GreenfootImage frun6;
    
    GreenfootImage up1;
    GreenfootImage up2;
    GreenfootImage up3;
    GreenfootImage up4;
    
    GreenfootImage down1;
    GreenfootImage down2;
    GreenfootImage down3;
    GreenfootImage down4;
    GreenfootImage down5;
    GreenfootImage playerHurt;
    
    public Player(){
        getImage().scale(100,80);
        setImage(getImage());
        def = new GreenfootImage("idle1.png");
        def.scale(100, 80);
        fdef = new GreenfootImage("idle1.png");
        fdef.scale(100, 80);
        fdef.mirrorHorizontally();
        playerHurt = new GreenfootImage("playerHurt.png");
        playerHurt.scale(100, 80);
        
        atk1 = new GreenfootImage("attack1.png");
        atk2 = new GreenfootImage("attack2.png");
        atk3 = new GreenfootImage("attack3.png");
        atk4 = new GreenfootImage("attack4.png");
        
        fatk1 = new GreenfootImage("attack1.png");
        fatk2 = new GreenfootImage("attack2.png");
        fatk3 = new GreenfootImage("attack3.png");
        fatk4 = new GreenfootImage("attack4.png");
        
        run1 = new GreenfootImage("run1.png");
        run2 = new GreenfootImage("run2.png");
        run3 = new GreenfootImage("run3.png");
        run4 = new GreenfootImage("run4.png");
        run5 = new GreenfootImage("run5.png");
        run6 = new GreenfootImage("run6.png");
        
        frun1 = new GreenfootImage("run1.png");
        frun2 = new GreenfootImage("run2.png");
        frun3 = new GreenfootImage("run3.png");
        frun4 = new GreenfootImage("run4.png");
        frun5 = new GreenfootImage("run5.png");
        frun6 = new GreenfootImage("run6.png");
        
        up1 = new GreenfootImage("up1.png");
        up2 = new GreenfootImage("up2.png");
        up3 = new GreenfootImage("up3.png");
        up4 = new GreenfootImage("temp4.png");
        
        down1 = new GreenfootImage("down1.png");
        down2 = new GreenfootImage("down2.png");
        down3 = new GreenfootImage("down3.png");
        down4 = new GreenfootImage("down4.png");
        down5 = new GreenfootImage("down5.png");
        
        atk1.scale(100, 80);
        atk2.scale(100, 80);
        atk3.scale(100, 80);
        atk4.scale(100, 80);
        fatk1.scale(100, 80);
        fatk2.scale(100, 80);
        fatk3.scale(100, 80);
        fatk4.scale(100, 80);
        run1.scale(100, 80);
        run2.scale(100, 80);
        run3.scale(100, 80);
        run4.scale(100, 80);
        run5.scale(100, 80);
        run6.scale(100, 80);
        frun1.scale(100, 80);
        frun2.scale(100, 80);
        frun3.scale(100, 80);
        frun4.scale(100, 80);
        frun5.scale(100, 80);
        frun6.scale(100, 80);
        up1.scale(100,80);
        up2.scale(100,80);
        up3.scale(100,80);
        up4.scale(100, 80);
        down1.scale(100, 80);
        down2.scale(100, 80);
        down3.scale(100, 80);
        down4.scale(100, 80);
        down5.scale(100, 80);
        
        
        fatk1.mirrorHorizontally();
        fatk2.mirrorHorizontally();
        fatk3.mirrorHorizontally();
        fatk4.mirrorHorizontally();
        frun1.mirrorHorizontally();
        frun2.mirrorHorizontally();
        frun3.mirrorHorizontally();
        frun4.mirrorHorizontally();
        frun5.mirrorHorizontally();
        frun6.mirrorHorizontally();
 
    }
    int count = 0 ;
    public static boolean isDead = false;
    public void act()
    {
       if(isDead)
         setImage(playerHurt);
         else{
       movement();
       setPosition();
       colision();
       setRotation(0);
       hit();
       moveAnim();
       setCorrect();
       up();
       down();
       placeBomb();
       x = getX();
       y = getY();
       
    }
    if(imunityTimer > 0){
        if(imunityTimer > 30)
       setImage(playerHurt);
       
       imunityTimer--;
    }
}
    public static int x = 0;
    public static int y = 0;
    boolean flip = false;
    int LR = 0;
    public static boolean keyspressed = false;
    public void movement(){
        keyspressed = false;
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(5);
            
            if(!flip){
                flip = true;
            }   
            LR = -1;
            keyspressed = true;
        }
        
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(5);
            if(flip){
                flip = false;
            }
            LR = 1;
            keyspressed = true;
        }
       
        if(Greenfoot.isKeyDown("up")){
            
            setRotation(-90);
            move(5);
            keyspressed = true;
            if(LR == 1){
            setRotation(0);
        }
            else setRotation(180);
            count = 1;
        }
        else
        if(Greenfoot.isKeyDown("down")){
            
            setRotation(90);
            move(5);
            keyspressed = true;
            count = -1;
           if(LR == 1){
            setRotation(0);
        }
           else setRotation(180);
        }
        else count = 0 ;

    }
    int ox,oy;
    public void colision(){
    List<Trees> trees;
    trees = getObjectsAtOffset(0, 0, Trees.class);
    
    
    if(!trees.isEmpty() ){
       for(Trees a : trees){
           if(getY() < a.getImage().getHeight()/2 + a.getY() - 30 && getY() > a.getY() - (a.getImage().getHeight()/2) + 30 ){
           if(getX() < a.getX()){
               setLocation(getX()-5,getY());
           }
           if(getX() > a.getX()){
               setLocation(getX()+5,getY());
           }
        }
        else{
           if(getY() > a.getY()){
               setLocation(getX(), getY()+5);
           }
           if(getY() < a.getY()){
               setLocation(getX(), getY()-5);
           }
        }
       }
    }
   
 }
 public static boolean isAttacking = false;
 public void hit(){
     if(Greenfoot.mousePressed(null) && anim && Npc.canHit ){
         anim = false;
         jeda = 20;
         isAttacking = true;
     }
     if(jeda > 0){
         if(!flip){
         if(jeda > 15){
             
             setImage(atk1);
             
         }
         else
         if(jeda > 10){
             setImage(atk2);
         }
         else
         if(jeda > 5){
             setImage(atk3);
         }
         else
         if(jeda > 0){
             setImage(atk4);
         }
         jeda--;
         if(jeda == 0){
             anim = true;
             
         }
        }
        else{
           if(jeda > 15){
             
             setImage(fatk1);
             
         }
         else
         if(jeda > 10){
             setImage(fatk2);
         }
         else
         if(jeda > 5){
             setImage(fatk3);
         }
         else
         if(jeda > 0){
             setImage(fatk4);
         }
         jeda--;
         if(jeda == 0){
             anim = true;
             isAttacking = false;
             
         } 
        }
        
     }
 }
  public int jeda = 0;
  boolean anim = true;
  
  public static float wood = 0;
  int mov = 0;
  boolean keyboard = true;
  public void moveAnim(){
     if(keyboard){
         if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left")) 
         {
             mov = 30;
             keyboard = false;
         }
     }
     if(mov > 0 && keyspressed ){
         if(!flip){
         if(mov > 25){
             
             setImage(run1);
             
         }
         else
         if(mov > 20){
             setImage(run2);
         }
         else
         if(mov > 15){
             setImage(run3);
         }
         else
         if(mov > 10){
             setImage(run4);
         }
         else
         if(mov > 5){
             setImage(run5);
         }
         else
         if(mov > 0){
             setImage(run6);
         }
         mov--;
         if(mov == 0){
             keyboard = true;
             
         }
         }
        else{
         if(mov > 25){
             
             setImage(frun1);
             
         }
         else
         if(mov > 20){
             setImage(frun2);
         }
         else
         if(mov > 15){
             setImage(frun3);
         }
         else
         if(mov > 10){
             setImage(frun4);
         }
         else
         if(mov > 5){
             setImage(frun5);
         }
         else
         if(mov > 0){
             setImage(frun6);
         }
         mov--;
         if(mov == 0){
             keyboard = true;
             
         }
        }
        
     }
 }
  boolean moveUp = true;
  int sus = 0;
  public void up(){
      if(moveUp && sus == 0){
          sus = 20;
          moveUp = false;
      }
      if(sus > 0 && Greenfoot.isKeyDown("up")){
          if(sus > 15){
              setImage(up1);
          }
          else
          if(sus > 10){
              setImage(up2);
          }
          else
          if(sus > 5){
              setImage(up1);
          }
          else
          if(sus > 0){
              setImage(up3);
          }
          sus--;
          if(sus == 0){
              moveUp = true;
          }
      }
  }
  boolean moveDown = true;
  int jos = 0;
  public void setCorrect(){
      if(flip && jeda == 0 && !keyspressed ){
          setImage(fdef);
        }
        else    
         if(!flip && jeda == 0 && !keyspressed ){
          setImage(def);
      
        }
  }
  public void down(){
      if(moveDown && jos == 0){
          jos = 32;
          moveDown = false;
        }
      if(jos > 0 && Greenfoot.isKeyDown("down")){
          if(jos > 28){
              setImage(down3);
          }
          else
          if(jos > 24){
              setImage(down1);
          }
          else
          if(jos > 20){
              setImage(down2);
          }
          else
          if(jos > 16){
              setImage(down1);
          }
          else
          if(jos > 12){
              setImage(down3);
          }
          else
          if(jos > 8){
              setImage(down4);
          }
          else
          if(jos > 4){
              setImage(down5);
          }
          else
          if(jos > 0){
              setImage(down4);
          }
          
          jos--;
          if(jos == 0){
              moveDown = true;
          }
      }
  }
  public int bombTimer = 0;
  public void placeBomb(){
      if(Greenfoot.isKeyDown("space") && bombTimer == 0 && bombs > 0){
          Bomb bomb = new Bomb();
          getWorld().addObject(bomb, getX(), getY());
          bombTimer = 45;
          bombs--;
      }
      if(bombTimer > 0 ){
          bombTimer--;
      }
  }
  public int StunTimer = 0 ;
  Vector velocity = new Vector(1,1);
  public void setPosition(Vector value){
      velocity.set(value);
  }
  public void setPosition(float a, float b)
  {
      velocity.x = a;
      velocity.y = b;
  }
      public void setPosition(){
        if(velocity.mag() > 1.5){
            setLocation(getX()+ (int)velocity.x, getY() + (int)velocity.y);
            velocity.mult((float)0.9);
        }
        else
         velocity.set(1,1);
    
  }
  private int imunityTimer = 0;
  GreenfootSound hurtPlayer = new GreenfootSound("playerHurt.wav");
  public void takeDamage(int damage){
      if(imunityTimer == 0){
          imunityTimer = 50;
          HP -= damage;
          hurtPlayer.play();
          
      }
  }
}
