/**
 *Recorder to allow serialization of current state of simulation
 * @author Sitar Harel 2012.1.25
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/***
 * Class to save the positions and locations of all foxes and rabbits on the field for the purpose of saving
 * the simulator state to a file and loading it again.
 *
 * This class not required to actually run the simulator
 */
public class Record implements Serializable{
    private ArrayList<Rabbit> rabbits;
    private ArrayList<Fox> foxes;
    private ArrayList<Bear> bears;
    private int steps;
    
    // The current state of the field.
    private Field field;
    
	public Record(ArrayList<Rabbit> r, ArrayList<Fox> f, ArrayList<Bear> b, Field field, int step){
		setRabbits(r);
		setFoxes(f);
		setBears(b);
		setField(field);
		setSteps(step);
	}
	public ArrayList<Rabbit> getRabbits() {
		return rabbits;
	}
	public void setRabbits(ArrayList<Rabbit> rabbits) {
		this.rabbits = rabbits;
	}
	public ArrayList<Fox> getFoxes() {
		return foxes;
	}
	public void setFoxes(ArrayList<Fox> foxes) {
		this.foxes = foxes;
	}
	public ArrayList<Bear> getBears() {
		return bears;
	}
	public void setBears(ArrayList<Bear> bears) {
		this.bears = bears;
	}

	public Field getField() {
		return field;
	}
	public void setField(Field field) {
		this.field = field;
	}
	public int getSteps() {
		return steps;
	}
	public void setSteps(int steps) {
		this.steps = steps;
	}
}
