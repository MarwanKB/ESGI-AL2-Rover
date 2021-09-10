package fr.esgi.al2.planetrover.rover;

import fr.esgi.al2.planetrover.Name;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoverTest {
    Rover test =
            new Rover(
                    new Name("monrover"),
                    new Position(2, 4),
                    Orientation.North);

    @Test
    public void testConstructeur() {

        Rover test2 =
                new Rover(
                        new Name("monrover"),
                        new Position(2, 5),
                        Orientation.North);
    }

    @Test
    void testMove(){
        test.move();
        test.move();
        Assertions.assertEquals(new Position(2,6), test.getPosition());

    }

    @Test
    void testTurnLeft(){
        test.turnLeft();
        Assertions.assertEquals(Orientation.West, test.getOrientation());
    }
    @Test
    void testTurnRight() {
        test.turnRight();
        Assertions.assertEquals(Orientation.East, test.getOrientation());
    }
}