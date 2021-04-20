package ie.tudublin;

import processing.data.TableRow;

public class Colour {

    private String colour;
    public int r, g, b;
    public int value;

    public Colour(TableRow row) {

        this( 
            
            row.getString("colour"),
            row.getInt("r"),
            row.getInt("g"),
            row.getInt("b"),
            row.getInt("value")
          
        );

    }

    //constructor that takes in the initial values 
    public Colour(String colour, int r, int g, int b, int value) {

       this.colour = colour;
       this.r = r;
       this.g = g;
       this.b = b;
       this.value = value;

    }

    public Colour() {

        //default constructor

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Colour [b=" + b + ", colour=" + colour + ", g=" + g + ", r=" + r + ", value=" + value + "]";
    }


}