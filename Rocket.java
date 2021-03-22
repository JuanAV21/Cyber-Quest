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
        move(speed);
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null){
            turnTowards(mouse.getX(),mouse.getY());
        }
        
        World myWorld = getWorld();
        if(myWorld.getHeight() < getX() || myWorld.getWidth() < getY() || 0 > getX() || 0 > getY()){
            myWorld.removeObject(this);
        }
    }    
}
