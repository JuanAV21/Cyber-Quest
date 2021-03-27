import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class testrun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
   public Label(){
    Back.cnt = 0;
    Label("Counter: " + Back.cnt);
    }
   public void Label(String text){
    GreenfootImage img = new GreenfootImage(text.length()*20,30);
    img.setColor(Color.WHITE);
    img.drawString(text,2,20);
    setImage(img);
    }
   public void setText(String text){
    GreenfootImage img = getImage();
    img.clear();
    Label(text);
    }
   public void act(){
        setText("Counter: " + Back.cnt);
    }
    
    
}
