package fr.esgi.al2.planetrover.planet;


import fr.esgi.al2.planetrover.Name;

public class Planet {

    Integer dimension [] [] [];
    final Name nomPlanet;

    public Planet(Integer dimension[][][], Name name){
        this.dimension = dimension;
        this.nomPlanet=name;
    }

    public Integer[][][] getDimension() {
        return dimension;
    }

    public void setDimension(Integer[][][] dimension) {
        this.dimension = dimension;
    }


}


