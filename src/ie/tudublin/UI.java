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

	// public void loadResistors() {

	// 	Table t = loadTable("resistors.csv"); 

	// 	for(Table row : t.rows()) {

	// 		Resistor res = new Resistor(row.getInt(0));
	// 		resistor.add(res);

	// 	}

	// }

	public void loadColours() { //populating arraylist

		Table table = loadTable("colours.csv", "header");

		for(TableRow row : table.rows()) {

			Colour c = new Colour(row);
			colours.add(c);

		}

	}

	public void printColours() { //printing out the contents of the ArrayList
	
		for (Colour c : colours) {

			System.out.println(c);

		}
		
	}

	public Colour findColour(int value) {

		Colour col = new Colour();

		if(col.value == value) {

			return col;

		}
		
		return null;

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
	}

	public void setup() 
	{
	}
	
	public void draw()
	{		

		loadColours();
		printColours();
		//loadResistors();

	}
}
