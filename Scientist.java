import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scientist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scientist extends Actor
{
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
        // Add your action code here.
    }    
}
