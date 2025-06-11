import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouLose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouLose extends Actor
{   
    private GreenfootSound loseSound = new GreenfootSound("losesound.mp3");
    /**
     * Act - do whatever the YouLose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public YouLose()
    {
        GreenfootImage myImage = new GreenfootImage("bg0SRL7.png");
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
        setImage(myImage);
        
        loseSound.play();
    }
}
