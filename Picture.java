/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle Mount1;
    private Triangle Mount2;
    private Triangle Mount3;
    private Triangle Mount4;
    private Triangle Mount5;
    private Triangle Mount6;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        Mount1 = new Triangle(); 
        Mount2 = new Triangle();
        Mount3 = new Triangle();
        Mount4 = new Triangle();
        Mount5 = new Triangle();
        Mount6 = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            Mount1.changeColor("brown");
            Mount1.changeSize(60, 180);
            Mount1.moveHorizontal(20);
            Mount1.moveVertical(-80);
            Mount1.makeVisible();
            
            Mount2.changeColor("brown");
            Mount2.changeSize(60, 180);
            Mount2.moveHorizontal(40);
            Mount2.moveVertical(-80);
            Mount2.makeVisible();
            
            Mount3.changeColor("brown");
            Mount3.changeSize(60, 180);
            Mount3.moveHorizontal(60);
            Mount3.moveVertical(-80);
            Mount3.makeVisible();
            
            Mount4.changeColor("brown");
            Mount4.changeSize(60, 180);
            Mount4.moveHorizontal(0);
            Mount4.moveVertical(-80);
            Mount4.makeVisible();
            
            Mount5.changeColor("brown");
            Mount5.changeSize(60, 180);
            Mount5.moveHorizontal(-20);
            Mount5.moveVertical(-80);
            Mount5.makeVisible();
            
            Mount6.changeColor("brown");
            Mount6.changeSize(60, 180);
            Mount6.moveHorizontal(-40);
            Mount6.moveVertical(-80);
            Mount6.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        Mount1.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        Mount1.changeColor("green");
        sun.changeColor("yellow");
    }
}
