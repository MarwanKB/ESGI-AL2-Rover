package fr.esgi.al2.planetrover.rover;

import fr.esgi.al2.planetrover.Name;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoverTest {

    private Position positionAt(int x, int y){
        return new Position (x,y,0);
    }
    private Position positionAt(int x, int y, int z){
        return new Position (x,y,z);
    }

    @Test
    public void testConstructeur() {

        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.North);

        Rover test2 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 5),
                        Orientation.North);

        Assertions.assertEquals(test2,test1);
    }

    @Test
    void testMoveFwNorth(){
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.North);

        test1.moveForward();
        test1.moveForward();
        Assertions.assertEquals(positionAt(2,6), test1.getPosition());

    }
    @Test
    void testMoveFwSouth(){
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.South);

        test1.moveForward();
        test1.moveForward();
        Assertions.assertEquals(positionAt(2,2), test1.getPosition());

    }

    @Test
    void testMoveFwEast(){
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.East);

        test1.moveForward();
        test1.moveForward();
        Assertions.assertEquals(positionAt(4,4), test1.getPosition());

    }
    @Test
    void testMoveFwWest(){
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.West);

        test1.moveForward();
        test1.moveForward();
        Assertions.assertEquals(positionAt(0,4), test1.getPosition());

    }

    @Test
    void testMoveBwFromNorth(){
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.North);

        test1.moveBackward();
        test1.moveBackward();
        Assertions.assertEquals(positionAt(2,2), test1.getPosition());

    }
    @Test
    void testMoveBwFromSouth(){
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.South);

        test1.moveBackward();
        test1.moveBackward();
        Assertions.assertEquals(positionAt(2,6), test1.getPosition());

    }
    @Test
    void testMoveBwFromEast(){
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.East);

        test1.moveBackward();
        test1.moveBackward();
        Assertions.assertEquals(positionAt(0,4), test1.getPosition());

    }
    @Test
    void testMoveBwFromWest(){
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.West);

        test1.moveBackward();
        test1.moveBackward();
        Assertions.assertEquals(positionAt(4,4), test1.getPosition());

    }

    @Test
    void testTurnLeftFromNorth(){
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.North);

        test1.turnLeft();
        Assertions.assertEquals(Orientation.West, test1.getOrientation());
    }
    @Test
    void testTurnLeftFromEst() {
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.East);

        test1.turnLeft();
        Assertions.assertEquals(Orientation.North, test1.getOrientation());
    }
    @Test
    void testTurnLeftFromWest() {
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.West);

        test1.turnLeft();
        Assertions.assertEquals(Orientation.South, test1.getOrientation());
    }
    @Test
    void testTurnLeftFromSouth() {
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.South);

        test1.turnLeft();
        Assertions.assertEquals(Orientation.East, test1.getOrientation());
    }

    @Test
    void testTurnRightFromNorth() {
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.North);

        test1.turnRight();
        Assertions.assertEquals(Orientation.East, test1.getOrientation());
    }
    @Test
    void testTurnRightFromSouth() {
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.South);

        test1.turnRight();
        Assertions.assertEquals(Orientation.West, test1.getOrientation());
    }
    @Test
    void testTurnRightFromEast() {
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.East);

        test1.turnRight();
        Assertions.assertEquals(Orientation.South, test1.getOrientation());
    }
    @Test
    void testTurnRightFromWest() {
        Rover test1 =
                new Rover(
                        new Name("monrover"),
                        positionAt(2, 4),
                        Orientation.West);

        test1.turnRight();
        Assertions.assertEquals(Orientation.North, test1.getOrientation());
    }
}