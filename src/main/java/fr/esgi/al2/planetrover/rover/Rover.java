package fr.esgi.al2.planetrover.rover;

import fr.esgi.al2.planetrover.Name;

import java.util.Objects;

public class Rover {

    Name name;
    Position position;
    Orientation orientation;


    public Rover(Name name, Position position, Orientation orientation) {
        this.name = name;
        this.position = position;
        this.orientation = orientation;
    }

    public Rover() {
        this.position = new Position(0,0,0);
        this.orientation = Orientation.North;
        this.name = new Name("My Rover");
    }

    public void moveForward(){
        switch (this.orientation){
            case North:
                this.position = this.position.goNorth();
                break;
            case South:
                this.position = this.position.goSouth();
                break;
            case East:
                this.position = this.position.goEast();
                break;
            case West:
                this.position = this.position.goWest();
                break;
        }
    }


    public void moveBackward(){
        switch (this.orientation){
            case North:
                this.position = this.position.goSouth();
                break;
            case South:
                this.position = this.position.goNorth();
                break;
            case East:
                this.position = this.position.goWest();
                break;
            case West:
                this.position = this.position.goEast();
                break;
        }
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public void turnRight(){
        switch (this.orientation){
            case North :
                this.orientation = Orientation.East;
                break;
            case South:
                this.orientation = Orientation.West;
                break;
            case East:
                this.orientation = Orientation.South;
                break;
            case West:
                this.orientation = Orientation.North;
                break;
        }
    }

    public void turnLeft(){
        switch (this.orientation){
            case North :
                this.orientation = Orientation.West;
                break;
            case South:
                this.orientation = Orientation.East;
                break;
            case East:
                this.orientation = Orientation.North;
                break;
            case West:
                this.orientation = Orientation.South;
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return Objects.equals(name, rover.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
