package ie.tudublin;

import processing.data.TableRow;

public class Resistor extends UI {

    public int value;
    public int ones;
    public int tens;
    public int hundreds;
    UI ui;

    public Resistor () {

        
    }

    public Resistor(UI ui, int value) {
        this.value = value;
        this.ui = ui; 
        hundreds = (value / 100);
        tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
    
    }

    public Resistor(TableRow row) { 

    }

    public void render() {

        ui.fill(211, 211, 211);
		ui.rect(200, 125, 100, 125);
		ui.line(150, 190, 200, 190);

    }
    
}
