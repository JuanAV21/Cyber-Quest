import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    /**
     * Act - do whatever the Protaganist wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        heal();
        damage();
        if(displayBinaryHealth.equals("0")){
            Greenfoot.setWorld(new GameOver());
            binaryHealth = 15;
            displayBinaryHealth = "1111";
        }
    }  
    public void heal(){
        if (greenfoot.Greenfoot.isKeyDown("up") && binaryHealth < 15){
            binaryHealth++;
            displayBinaryHealth = Integer.toBinaryString(++binaryHealth);
        }
    }
    public void damage(){
        if (greenfoot.Greenfoot.isKeyDown("down") && binaryHealth > 0){
            binaryHealth--;
            displayBinaryHealth = Integer.toBinaryString(binaryHealth);
        }
    }
    
}
