import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * creates the image when a player loses the game 
 * 
 * @author (Marcus and Collin) 
 * @version (June 2025)
 */
//sound for when the player loses
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
    //image for when player loses
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
