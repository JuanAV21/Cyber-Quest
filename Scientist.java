import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scientist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scientist extends Actor
{
    SimpleTimer shotTimer = new SimpleTimer();
    /**
     * Act - do whatever the Scientist wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Scientist(){
        GreenfootImage myImage = new GreenfootImage("1.png");
        int myNewHeight = (int)myImage.getHeight()/10;
        int myNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(myNewWidth,myNewHeight);
        setImage(myImage);
    }
    public void act() 
    {
        //die();
        shoot();
        face();
        // Add your action code here.
    }    
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet!=null)
        {
           getWorld().removeObject(bullet);
           getWorld().removeObject(this);
        }
           
    } 
    public void face()
    {
        Character test = (Character)getWorld().getObjects(Character.class).get(0);
        int mouseX = test.getX();
        int mouseY = test.getY();
        turnTowards(mouseX, mouseY);
    }
    
    public void shoot()
    {
        Character test = (Character)getWorld().getObjects(Character.class).get(0);
        if(shotTimer.millisElapsed() > 1000)
        {
            shotTimer.mark();
            getWorld().addObject(new Bullet(getRotation()), getX(), getY());
        }       
    }
}
