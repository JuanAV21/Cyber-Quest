import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Protaganist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    public static int binaryHealth = 15;
    public static String displayBinaryHealth = "1111";
    public int HeroRotation;

    public int bullet;
    
    private List<GreenfootImage> idleIMG;
    private Iterator<GreenfootImage> idleIter;
    
    
    private List<GreenfootImage> runIMG;
    private Iterator<GreenfootImage> runIter;
    
    SimpleTimer shotTimer = new SimpleTimer();

    private int animationCounter = 0;
    private boolean isMoving = false;
    /**
     * Act - do whatever the Protaganist wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Character(){
        GreenfootImage myImage = new GreenfootImage("Idle (1).png");
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth,myNewHeight);
        setImage(myImage);
        runIMG = new ArrayList<GreenfootImage>(8);
        for(int index = 1;index < 9;index++){
            runIMG.add(new GreenfootImage("Run (" + index + ").png"));
        }
        runIter = runIMG.iterator();
        
        /*
        for(int index = 1;index < 10;index++){
            idleIMG.add(new GreenfootImage("Idle (" + index + ").png"));
        }
        idleIter = idleIMG.iterator();*/ //47
    }

    public void act() 
    {
        heal();
        damage();

        if(displayBinaryHealth.equals("0")){
            Greenfoot.setWorld(new GameOver());
            binaryHealth = 15;
            displayBinaryHealth = "1111";
        }
        Movement();
        mouse();
        HeroRotation = getRotation();
        animationCounter++;
        if(Greenfoot.getMouseInfo() != null)
        {
            shoot();
        }

        if(animationCounter % 8 == 0){

            animate();
        }
    }  

    public void heal(){
        if (greenfoot.Greenfoot.isKeyDown("up") && binaryHealth < 15){
            binaryHealth++;
            displayBinaryHealth = Integer.toBinaryString(++binaryHealth);
        }
    }

    public void damage(){
        if(isTouching(minion.class) && shotTimer.millisElapsed() > 250 ){
            binaryHealth--;
            displayBinaryHealth = Integer.toBinaryString(binaryHealth);
        }
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet!=null)
        {
           binaryHealth--;
           getWorld().removeObject(bullet);
           displayBinaryHealth = Integer.toBinaryString(binaryHealth);
        }
    }

    public void Movement(){
        if (Greenfoot.isKeyDown("d"))
        { setLocation(getX() + 2, getY());
        }
        if (Greenfoot.isKeyDown("a"))
        { setLocation(getX() - 2, getY());
        }
        if (Greenfoot.isKeyDown("w"))
        { setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("s"))
        { setLocation(getX(), getY() + 2);
        }
    }

    public void mouse()
    {
        if(Greenfoot.getMouseInfo() != null)
        {
            int mouseX = Greenfoot.getMouseInfo().getX();
            int mouseY = Greenfoot.getMouseInfo().getY();

            turnTowards(mouseX, mouseY);
        }
    }

    public void shoot()
    {
        /*
        if(Greenfoot.getMouseInfo().getButton() == 1 & bullet < 5){
            getWorld().addObject(new Bullet(HeroRotation), getX(), getY());
            bullet++;
        }else{shotTimer.mark();}
        if(shotTimer.millisElapsed() > 500){
            bullet=0;
        }*/
        
        if(shotTimer.millisElapsed() > 250)
        {
            shotTimer.mark();
            if(Greenfoot.getMouseInfo().getButton() == 1)
                getWorld().addObject(new Bullet(HeroRotation), getX(), getY());
        }       
    }
    public void animate()
    {
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("d")){
            if(runIter.hasNext()){
                setImage(runIter.next());
            }else{
                runIter = runIMG.iterator();
            }
        }
        /*
        if(Greenfoot.isKeyDown(null) && idleIter.hasNext()){
            setImage(idleIter.next());
        }else{
            idleIter = idleIMG.iterator();
        }*/
    }
}
