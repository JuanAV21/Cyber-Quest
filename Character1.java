import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character1 extends Actor
{
    /**
     * Act - do whatever the Character1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo p = Greenfoot.getMouseInfo();
        if(p != null)
        {
           int mouse1 = p.getX();
           int mouse2 = p.getY();
           turnTowards(mouse1, mouse2);
           int key = p.getButton();
           if (key == 1)
           {
             move(10);
           }
        }
    }    
}
