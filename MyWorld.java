import greenfoot.*;

/**
 * The World our hero lives in.
 * 
 * @author Abithan Paskaranathan
 * @version April 2025
 */

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    Elephant elephant;
    
    public MyWorld() {
        super(600, 400, 1, false);
        
        elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        removeObject(elephant);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if (score % 5 == 0)
        {
            level++;
        }
    }
    
    /**
     * Creat a new apple at random location at top of screen
     */
    
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
