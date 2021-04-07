import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class minion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class minion extends Character
{
    /**
     * Act - do whatever the minion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        heal();
        damage();
    }    
}
