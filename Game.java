import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    Label counterLabel = new Label("Counter: ");
    
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        counterLabel.setText("Counter: " + Back.cnt);
    }
    
    private void prepare()
    {
        Back back = new Back();
        addObject(back,547,353);
        addObject(counterLabel, 200, 200);
        //counterLabel.setText("Counter: " + Back.cnt);
    }
    
    /*
    public void act(){
        counterLabel.setText("Counter: " + Back.cnt);
    }
    */
}
