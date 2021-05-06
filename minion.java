import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Minion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class minion extends Actor
{
    int animationCounter = 0;
    private int speed = 1;
    /**
     * Act - do whatever the Minion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int animation = 0;
    private List<GreenfootImage> walkIMG;
    private Iterator<GreenfootImage> walkIter;
    public minion(){

        GreenfootImage myImage = new GreenfootImage("idle1.png");
        int myNewHeight =(int)myImage.getHeight()*2;
        int myNewWidth =(int)myImage.getWidth()*2;
        myImage.scale(myNewWidth, myNewHeight);
        setImage(myImage);
        walkIMG =new ArrayList<GreenfootImage>(8);
        for(int index =1;index < 9;index++){
            GreenfootImage image = new GreenfootImage("walk"+index+".png");
            int newHeight =(int)image.getHeight()*2;
            int newWidth =(int)image.getWidth()*2;
            image.scale(newWidth, newHeight);
            walkIMG.add(new GreenfootImage(image));
        }
        walkIter = walkIMG.iterator();


    }
    public void act() 
    {
        move(speed);
        Enemymove();
        die();

        animation++;
        if((animation % 8) == 0){
            animation();

        }
    }
    
    public void Enemymove()
    {
       if (getWorld().getObjects(Character.class).isEmpty()) return; // Skips if there is no hero in the world
       Character test = (Character)getWorld().getObjects(Character.class).get(0); // gets reference to Hero class
       turnTowards(test.getX(), test.getY()); // Move towards the hero
    }
    
    public void EnemyAttack()
    {
        
    }
    
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet!=null)
        {
           getWorld().removeObject(bullet);
           getWorld().addObject(new minion(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
           getWorld().removeObject(this);
        } 
    }
    
    public void animation(){
        if(walkIter.hasNext()){
            setImage(walkIter.next());
        }else{
            walkIter = walkIMG.iterator();
        }
    }
}
