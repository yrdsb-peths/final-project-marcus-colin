import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * creates the image when the player wins the game and plays a sound effect 
 * 
 * @author (Collin and Marcus) 
 * @version (june 2025)
 */
public class YouWin extends Actor
{
    private GreenfootSound winSound = new GreenfootSound("winsound.mp3");
    /**
     * Act - do whatever the YouWin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    //creates the image when you win the game + sound effects.
    public YouWin()
    {
        GreenfootImage myImage = new GreenfootImage("victorysign.png");
        int myNewHeight = (int)myImage.getHeight()/1;
        int myNewWidth = (int)myImage.getWidth()/1;
        myImage.scale(myNewWidth, myNewHeight);
        setImage(myImage);
        
        winSound.play();
    }
}
