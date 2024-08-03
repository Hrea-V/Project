import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class InterfaceTesting {


    @Test
    public void Player_shouldBe_instanceOfMoveable() {
        Player a = new Player();
        assertTrue(a instanceof Moveable);
    }

    @Test
    public void Enemy_shouldBe_instanceOfMoveable() {
        Enemy a = new Enemy();
        assertTrue(a instanceof Moveable);
    }

    @Test
    public void increaseSpeed_should_existInInterface(){
        try {
            Moveable.class.getMethod("increaseSpeed");
        } catch (NoSuchMethodException e) {
            fail("increaseSpeed() does not exist on the Moveable interface");
        }

    }

    @Test
    public void decreaseSpeed_should_existInInterface(){
        try {
            Moveable.class.getMethod("decreaseSpeed");
        } catch (NoSuchMethodException e) {
            fail("decreaseSpeed() does not exist on the Moveable interface");
        }

    }

    @Test
    public void moveLeft_should_existInInterface(){
        try {
            Moveable.class.getMethod("moveLeft");
        } catch (NoSuchMethodException e) {
            fail("moveLeft() does not exist on the Moveable interface");
        }

    }

    @Test
    public void moveRight_should_existInInterface(){
        try {
            Moveable.class.getMethod("moveRight");
        } catch (NoSuchMethodException e) {
            fail("moveRight() does not exist on the Moveable interface");
        }

    }

}