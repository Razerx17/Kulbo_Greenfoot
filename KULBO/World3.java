import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


 
public class World3 extends World
{
   public static boolean bridgePass = false;
    public Player player2;    
                                           
    public World3()
    {    
        
        super(1000, 700, 1);
        prepare();
        
        addObject(new Warper(2), getWidth()/2-20, getHeight()-100);
        HUD_Background hud = new HUD_Background();
        addObject(hud, getWidth()/2, getHeight()-38);
        hud.added();
    }
    public void act(){
        
        bridgePass();
    }    
   
    
    public static boolean passBridge = false;
    public void bridgePass(){
       if(Player.x > 710 && Player.x < 790 && Player.y < 400 && Player.y > 130 && bridgePass){
       
       passBridge = true;
    }
       else
       passBridge = false;
    }
    
    private void prepare()
    {
        leftCorner_path leftCorner_path = new leftCorner_path();
        addObject(leftCorner_path,409,600);
        leftCorner_path.setLocation(424,600);
        Corner_path corner_path = new Corner_path();
        addObject(corner_path,505,600);

        river river = new river();
        addObject(river,500,309);
        House house = new House();
        Bridge bridge = new Bridge();
        addObject(bridge, 750,294);
        Bridge bridge1 = new Bridge();
        addObject(bridge1, 750,199);
        Bridge bridge2 = new Bridge();
        addObject(bridge2, 750,390);
        addObject(house,130,430);   
        river.setLocation(679,518);
        Tree1 tree1 = new Tree1();
        addObject(tree1,870,550);
        river.setLocation(28,629);
        Tree1 tree12 = new Tree1();
        addObject(tree12,28,629);
        river.setLocation(12,445);
        Tree1 tree13 = new Tree1();
        addObject(tree13,12,445);
        river.setLocation(309,458);
        Tree1 tree14 = new Tree1();
        addObject(tree14,309,458);
        river.setLocation(171,652);
        Tree1 tree15 = new Tree1();
        addObject(tree15,171,652);

        removeObject(tree15);

        Tree1 tree16 = new Tree1();
        addObject(tree16,683,663);
        river.setLocation(966,565);
        Tree1 tree17 = new Tree1();
        addObject(tree17,966,565);
        river.setLocation(845,633);
        Tree1 tree18 = new Tree1();
        addObject(tree18,845,633);
        river.setLocation(761,588);
        Tree1 tree19 = new Tree1();
        addObject(tree19,761,588);
        river.setLocation(951,646);
        Tree1 tree110 = new Tree1();
        addObject(tree110,951,646);

        Tree1 tree111 = new Tree1();
        addObject(tree111,670,20);

        Tree1 tree112 = new Tree1();
        addObject(tree112,544,130);

        Tree1 tree113 = new Tree1();
        addObject(tree113,394,125);

        Tree1 tree114 = new Tree1();
        addObject(tree114,519,9);
        Tree1 tree115 = new Tree1();
        addObject(tree115,353,15);

        Tree1 tree116 = new Tree1();
        addObject(tree116,34,117);

        Tree1 tree117 = new Tree1();
        addObject(tree117,960,24);
        river.setLocation(971,158);
        Tree1 tree118 = new Tree1();
        addObject(tree118,971,100);
        Tree1 tree119 = new Tree1();
        addObject(tree119,826,19);
        river.setLocation(193,22);
        Tree1 tree120 = new Tree1();
        addObject(tree120,193,22);
        river.setLocation(270,28);
        Tree1 tree121 = new Tree1();
        addObject(tree121,270,28);
        river.setLocation(95,659);
        Tree1 tree122 = new Tree1();
        addObject(tree122,95,659);
        addObject(new Tree1(), 100,62);
        Tree1 tree123 = new Tree1();
        addObject(tree123,27,547);
        Tree1 tree124 = new Tree1();
        addObject(tree124,590,564);
        Tree1 tree125 = new Tree1();
        addObject(tree125,444,469);
        river.setLocation(600,300);
        Npc npc = new Npc();
        addObject(npc, 170,500);
        Portal portal = new Portal();
        addObject(portal,160,32);
        portal.setLocation(200,77);

        tree120.setLocation(420,16);
        tree121.setLocation(128,121);
        tree123.setLocation(60,32);
        tree123.setLocation(102,28);
        tree120.setLocation(236,44);
        tree121.setLocation(164,121);

        portal.setLocation(440,36);
        tree113.setLocation(285,117);
        tree123.setLocation(36,20);
    }
}
