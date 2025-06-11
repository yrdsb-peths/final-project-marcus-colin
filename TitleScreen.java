import greenfoot.*;
//adds title screen and text
public class TitleScreen extends World
{
    Label titleLabel = new Label("Val Space Shooter", 60);

    public TitleScreen()
    {    
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth() / 2, 120);

        Label startLabel = new Label("Eliminate Jett, Iso and Cypher!!", 35);
        addObject(startLabel, getWidth() / 2, 250);
        
        Label nextLabel = new Label("press space to go next", 40);
        addObject(nextLabel, getWidth()/2, 300);

        Actor vallogo = new Actor() {}; // Empty actor to hold the image
        GreenfootImage myImage = new GreenfootImage("vallogo1.png");
        int myNewHeight = myImage.getHeight() / 8;
        int myNewWidth = myImage.getWidth() / 4;
        myImage.scale(myNewWidth, myNewHeight);
        vallogo.setImage(myImage);
    }
    

    public void act()
    {
        String key = Greenfoot.getKey();
        if ("space".equals(key))
        {
            Greenfoot.setWorld(new TutorialScreen());
        }
    }
}


