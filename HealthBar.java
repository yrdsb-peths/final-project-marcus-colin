import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (Marcus and Collin) 
 * @version (June 2025)
 */
public class HealthBar extends Actor
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 20;
    int healthBarWidth = 80;
    int healthBarHeight = 10;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    public HealthBar()
    {
        update();
    }
    public void act()
    {
        update();
        youLose();
    }
    public void update() //image size for healthbar and filling
    {
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, health*pixelsPerHealthPoint, healthBarHeight);
        
    }
    public void loseHealth() //function for losing health
    {
        health--;
    }
    public void youLose() //registering loss function when health is == 0 
    {
        if (health <= 0)
        {
            getWorld().addObject(new YouLose(), 300, 300);
            Greenfoot.stop();
        }
    }
}
