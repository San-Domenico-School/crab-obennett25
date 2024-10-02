import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Worm is the food for Crabs
 * 
 * @author Oliver Bennett 
 * @version 10/2/24
 */
public class Worm extends Actor
{
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your action code here.
        checkForDeath();
        
    }
    
    private void checkForDeath()
    {
        if (isTouching(Crab.class))
        {
            getWorld().removeObject(this);
        }
    }
}
