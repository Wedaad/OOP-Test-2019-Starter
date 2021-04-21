package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	
	//ArrayList which holds the instances of Colour class
	ArrayList<Colour> colours = new ArrayList<Colour>();

	//ArrayList which holds the instances of Resistor class
	ArrayList<Resistor> resistor = new ArrayList<Resistor>();

	public void loadResistors() {

		Table t = loadTable("resistors.csv"); 

		for(TableRow row : t.rows()) {

			Resistor res = new Resistor(row);
			resistor.add(res);

		}

	}

	public void loadColours() { //populating arraylist

		Table table = loadTable("colours.csv", "header");

		for(TableRow row : table.rows()) {

			Colour c = new Colour(row);
			colours.add(c);

		}

	}

	public void printColours() { //printing out the contents of the ArrayList
	
		for (Colour c : colours) {

			println(c);

		}
		
	}

	public Colour findColour(int value) {

		Colour col = new Colour();

		for(Colour c : colours) {

			if(c.value == value) {

				col = c;

			}

		}
		
		return col;

	}
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);

		loadColours();
		printColours();
		println("findColour: " + findColour(1));
		//loadResistors();
	}

	public void setup() 
	{
	}
	
	public void draw() // consistenly loops 
	{		
		rect(200, 125, 100, 125);
		line(125, );
	}
}
