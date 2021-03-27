import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        super(800, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Back back = new Back();
        addObject(back,547,353);
        Label counter = new Label();
        addObject(counter,400,300);
        Label label2 = new Label();
        addObject(label2,456,144);
    }
}
