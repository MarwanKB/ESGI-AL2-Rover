package fr.esgi.al2.planetrover;

import fr.esgi.al2.planetrover.rover.Orientation;
import fr.esgi.al2.planetrover.rover.Position;
import fr.esgi.al2.planetrover.rover.Rover;


public class Main {
    public static void main(String[] args) {
        Rover nvRover = new Rover(new Name("test") ,new Position(0,0), Orientation.North);
        nvRover.move();
        nvRover.move();
        nvRover.move();
        System.out.println(nvRover.getPosition().toString());

    }
}
