import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWin extends Actor
{
    /**
     * Act - do whatever the YouWin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public YouWin()
    {
        GreenfootImage myImage = new GreenfootImage("victorysign.png");
        int myNewHeight = (int)myImage.getHeight()/1;
        int myNewWidth = (int)myImage.getWidth()/1;
        myImage.scale(myNewWidth, myNewHeight);
        setImage(myImage);
    }
}
