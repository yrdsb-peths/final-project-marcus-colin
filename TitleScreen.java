import greenfoot.*;

public class TitleScreen extends World
{
    Label titleLabel = new Label("Val Space Shooter", 60);

    public TitleScreen()
    {    
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth() / 2, 120);

        Label startLabel = new Label("Press <space> to start", 35);
        addObject(startLabel, getWidth() / 2, 250);

        Label controlLabel = new Label("Use \u2190 and \u2192 to move", 30);
        addObject(controlLabel, getWidth() / 2, 300);
        
        Actor vallogo = new Actor() {}; // Empty actor to hold the image
        GreenfootImage myImage = new GreenfootImage("vallogo1.png");

        int myNewHeight = myImage.getHeight() / 8;
        int myNewWidth = myImage.getWidth() / 4;

        myImage.scale(myNewWidth, myNewHeight);
        vallogo.setImage(myImage);
    }
    

    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}

