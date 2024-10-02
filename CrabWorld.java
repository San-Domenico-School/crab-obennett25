import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

/**
 * This class is the game board.
 * 
 * @author OBennett
 * @version 10/2/2024
 */
public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepareScene();
    }
    
    public void act()
    {
        checkWin();
    }
    
    private void prepareScene()
    {
        addPlayer();
        addFood();
        addEnemy();
    }   
    
    private void addPlayer()
    {
        // instantiate new objects
        Crab crab = new Crab();
        
        // add them to the world
        addObject(crab, 170, 100);
    }
    
    private void addFood()
    {
        Worm worm1 = new Worm();
        addObject(worm1, (int)(Math.random() * 560), (int)(Math.random() * 560));
    
        Worm worm2 = new Worm();
        addObject(worm2, (int)(Math.random() * 560), (int)(Math.random() * 560));
        
        Worm worm3 = new Worm();
        addObject(worm3, (int)(Math.random() * 560), (int)(Math.random() * 560));
        
        Worm worm4 = new Worm();
        addObject(worm4, (int)(Math.random() * 560), (int)(Math.random() * 560));
        
        Worm worm5 = new Worm();
        addObject(worm5, (int)(Math.random() * 560), (int)(Math.random() * 560));
        
        Worm worm6 = new Worm();
        addObject(worm6, (int)(Math.random() * 560), (int)(Math.random() * 560));
        
        Worm worm7 = new Worm();
        addObject(worm7, (int)(Math.random() * 560), (int)(Math.random() * 560));
        
        Worm worm8 = new Worm();
        addObject(worm8, (int)(Math.random() * 560), (int)(Math.random() * 560));
    }
    
    private void addEnemy()
    {
        Lobster lobster = new Lobster();
        addObject(lobster, (int)(Math.random() * 560), (int)(Math.random()* 560));
    }
    
    private void checkWin()
    {
        if (getObjects(Worm.class).size() == 0)
        {
            Greenfoot.stop();
        }
    }

}