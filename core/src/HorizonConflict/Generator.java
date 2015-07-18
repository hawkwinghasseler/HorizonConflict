package HorizonConflict;

public class Generator extends Component{
	protected int maxEnergyOutput;
	protected int energyOutput;
	protected int maxHealth;
	protected int health;
	protected String Name;
	protected double healthPercent;
	
	// This is how the generator gets damaged, it also calls
	// set energy production
	public void takeDamage(int damage){
		health = health - damage;
		setEnergyProduction(damage);
	}
	
	//This sets the energy production to be a percentage of the
	// max depending on the amount of damage taken.
	public void setEnergyProduction(int damage){
		healthPercent = (double)health/(double)maxHealth;
		if (healthPercent >= .50){
			energyOutput = (int)(maxEnergyOutput*healthPercent);
		}else{
			energyOutput = 0;
		}
	}
	
	//Heals the ship and then adjusts the energy to depend on the
	//  new health.
	public void heal(int heal){
		health += heal;
		if (health > maxHealth){
			health = maxHealth;
		}
		
		healthPercent = (double)health/(double)maxHealth;
		if (healthPercent >= .50){
			energyOutput = (int)(maxEnergyOutput*healthPercent);
		}else{
			energyOutput = 0;
		}
	}
	

}
