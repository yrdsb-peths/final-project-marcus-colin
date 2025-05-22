import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 600, 1);
        
        Player player = new Player();
        addObject(player, 300, 500);
        
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1, Greenfoot.getRandomNumber(600), 0);
        
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
    }  
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(60) < 1)
        {
            addEnemy1;
        }
    }
    
    public void addEnemy1()
    {
        addObject(new Enemy1,
}
