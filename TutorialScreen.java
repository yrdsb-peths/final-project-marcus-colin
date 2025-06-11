import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tutorialScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialScreen extends World
{

    private Label tutorialText1;
    private Label tutorialText2;
    private Label tutorialText3;

    public TutorialScreen()
    {
        super(600, 400, 1);

        // Add tutorial instructions
        tutorialText1 = new Label("Score 100 points to win!", 40);
        tutorialText2 = new Label("Use ← and → to move left and right", 40);
        tutorialText3 = new Label("Press space to shoot", 40);

        addObject(tutorialText1, getWidth()/2, 150);
        addObject(tutorialText2, getWidth()/2, 200);
        addObject(tutorialText3, getWidth()/2, 250);

        // Add instruction to start the game
        Label continueLabel = new Label("Press <space> to start the game", 30);
        addObject(continueLabel, getWidth()/2, 300);
        
        Actor chamber = new Actor() {}; // Empty actor to hold the image
        GreenfootImage myImage = new GreenfootImage("chambersmirk.jpg");
        int myNewHeight = myImage.getHeight() / 8;
        int myNewWidth = myImage.getWidth() / 4;
        myImage.scale(myNewWidth, myNewHeight);
        chamber.setImage(myImage);
    }

    public void act()
    {
        String key = Greenfoot.getKey();
        if ("space".equals(key))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}

