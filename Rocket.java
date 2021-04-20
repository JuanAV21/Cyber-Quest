import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    private int speed;
    public Rocket(){
        speed = 5;
       
    }
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        /*
        move(speed);
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null){
            turnTowards(mouse.getX(),mouse.getY());
        }
        
        World myWorld = getWorld();
        if(myWorld.getHeight() < getX() || myWorld.getWidth() < getY() || 0 > getX() || 0 > getY()){
            myWorld.removeObject(this);
        }
        */
       if (Greenfoot.isKeyDown("Right"))
        {
            setRotation(0);
            move(3);
        }else if (Greenfoot.isKeyDown("Left"))
        {
            setRotation(180);
            move(3);
        }else if (Greenfoot.isKeyDown("Up"))
        {
            setRotation(-90);
            move(3);
        }else if (Greenfoot.isKeyDown("Down"))
        {
            setRotation(90);
            move(3);
        }
        
        if (Greenfoot.isKeyDown("Up") && Greenfoot.isKeyDown("Right"))
        {
            setRotation(-45);
            move(3);
        }else if (Greenfoot.isKeyDown("Up") && Greenfoot.isKeyDown("Left"))
        {
            setRotation(-135);
            move(3);
        }else if (Greenfoot.isKeyDown("Down") && Greenfoot.isKeyDown("Right"))
        {
            setRotation(45);
            move(3);
        }else if (Greenfoot.isKeyDown("Down") && Greenfoot.isKeyDown("Left"))
        {
            setRotation(135);
            move(3);
        }
    }
    
}
