import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsWorld extends World
{

    /**
     * Constructor for objects of class CreditsWorld.
     * 
     */
    public CreditsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    private void prepare()
    {
        Back back = new Back();
        addObject(back,547,353);
    }
}
