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
    public int HeroRotation;

    SimpleTimer shotTimer = new SimpleTimer();

    private GreenfootImage Run1r = new GreenfootImage("Run (1).png");
    private GreenfootImage Run2r = new GreenfootImage("Run (2).png");
    private GreenfootImage Run3r = new GreenfootImage("Run (3).png");
    private GreenfootImage Run4r = new GreenfootImage("Run (4).png");
    private GreenfootImage Run5r = new GreenfootImage("Run (5).png");
    private GreenfootImage Run6r = new GreenfootImage("Run (6).png");
    private GreenfootImage Run7r = new GreenfootImage("Run (7).png");
    private GreenfootImage Run8r = new GreenfootImage("Run (8).png");
    private GreenfootImage Idle2 = new GreenfootImage("Idle (2).png");

    
    private int frame = 1;
    private int animationCounter = 0;
    /**
     * Act - do whatever the Protaganist wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Character(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth,myNewHeight);
    }

    public void act() 
    {
        heal();
        damage();
        if(displayBinaryHealth.equals("0")){
            Greenfoot.setWorld(new GameOver());
            binaryHealth = 15;
            displayBinaryHealth = "1111";
            
        }
        Movement();
        mouse();
        HeroRotation = getRotation();
        animationCounter ++;
        if(Greenfoot.getMouseInfo() != null)
        {
            shoot();
        }

        if(animationCounter % 8 == 0){
            animateRun();
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
        public void Movement(){
        if (Greenfoot.isKeyDown("d"))
        { setLocation(getX() + 2, getY());
        }
        if (Greenfoot.isKeyDown("a"))
        { setLocation(getX() - 2, getY());
        }
        if (Greenfoot.isKeyDown("w"))
        { setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("s"))
        { setLocation(getX(), getY() + 2);
        }
    }
    public void mouse()
    {
        if(Greenfoot.getMouseInfo() != null)
        {
            int mouseX = Greenfoot.getMouseInfo().getX();
            int mouseY = Greenfoot.getMouseInfo().getY();

            turnTowards(mouseX, mouseY);
        }
    }
    public void shoot()
    {
        if(Greenfoot.getMouseInfo() != null && shotTimer.millisElapsed() > 250)
        {
            shotTimer.mark();
            if(Greenfoot.getMouseInfo().getButton() == 1)
                getWorld().addObject(new Bullet(HeroRotation), getX(), getY());
        }       
    }
    public void animateRun()
    {
        if(frame == 1)
        {
            setImage(Run1r);
        }
        else if(frame == 2)
        {
            setImage(Run2r);
        }
        else if(frame == 3)
        {
            setImage(Run3r);
        }
        else if(frame == 4)
        {
            setImage(Run4r);
        }
        else if(frame == 5)
        {
            setImage(Run5r);
        }
        else if(frame == 6)
        {
            setImage(Run6r);
        }
        else if(frame == 7)
        {
            setImage(Run7r);
        }
        else if(frame == 8)
        {
            setImage(Run8r);
            frame = 1;

        }
        frame ++;
    }
}
