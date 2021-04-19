import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    public double posX, posY, vx, vy, veloc = 10;
    public Laser()
    {
    }
    public Laser(int rot){
        vx = veloc * Math.cos(1.0 * rot* Math.PI/180);
        vy = veloc * Math.sin(1.0 * rot* Math.PI/180);
        setRotation(rot);

    }
    public void addedToWorld(World Game){
       GreenfootImage image = new GreenfootImage(20, 10);
       image.drawLine(0,5,image.getWidth()-1,5);
       setImage(image);
       
       posX = getX();
       posY = getY();
    }
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        posX += vx;
        posY += vy;
        
        setLocation((int)posX,(int)posY);
    }    
}
