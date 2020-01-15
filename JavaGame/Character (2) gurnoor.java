package Gui;



public class Character {
	private int hp;
	private int level;
	private int damage;
	private int speed;
	private int maxHp;
	private int exp;
	private int maxExp;
	private int healthPotion=0;
	
	public static void main(String[] args) {	
	
	}
	/** The method setHp returns nothing, and takes the integer
	 * variable newHp as a parameter. If newHp is greater than or equal to 0
	 * then the method will set the Hp of the character to newHp.
	 * if newHp is less than 0, the method will automatically set the HP to 0 
	 * as a character should not be able to have negative Hp. 
	 * @param newHp an integer value that is used to set the Hp value.
	 */
	public void setHp(int newHp) {
		if(newHp>=0) {
		hp= newHp;	
		}
		else {
			hp=0;
		}
		
		
	}
	/** The method updateHp() returns nothing, and takes no parameter. It is used 
	 * in association with the method useHealthPotion. updateHp serves the actual 
	 * healing function of the health potion, it increases the hp by 30. If the hp is 
	 * greater than the maxHp after the update, then hp is equal to the maxHp. This 
	 * is because the Hp should never be greater than the max Hp.
	 */
	public void updateHp() {
		hp+=30;																																																																																																																																																																																																																																
		if(hp>maxHp) {
			hp=maxHp;
		}
	}
	/** The method subractHp returns nothing, and takes the int newHp as a parameter. 
	 * it is used to subtract Hp from the user during an event in the story. The newHp has to be 
	 * greater than 0, this is because if you were to subtract a negtive number from a positive it would add instead of 
	 * subtract.
	 * @param newHp a integer value that is used to subtract from the Hp value.
	 */
	public void subtractHp(int newHp) {
		if(newHp>0) {
		hp-= newHp;	
		}
	}

	/** The method addHealthPotion, returns nothing, and takes the integer A as a parameter. 
	 * If A is greater than 0, the parameter healthPotion will increase by A. A has to be 
	 * a number greater than 0 because we don't want to add 0 potions, or subtract potions with a 
	 * negative number.
	 * @param A an integer value that is used to determine how many health potions should be added.  
	 */
	public void addHealthPotion(int A) {
		if(A>0) {
		healthPotion+=A;
		}
	}
	/**
	 * The method setHealthPotion, returns nothing, and takes the integer newAmount as a parameter. 
	 * If newAmount is greater than or equal to 0, healthpotion will be set to newAmount. 
	 * If newAmount is less than 0,  healthPotion will  be set to the default value of 0 
	 * @param newAmount an integer value that is used to set the health potions of the user. 
	 */
	public void setHealthPotion(int newAmount) {
		if (newAmount >= 0) {
		healthPotion=newAmount;
		}
		else {
			healthPotion = 0;
		}
	}
	
	/** The method useHealthPotion, returns nothing, and takes nothing as a parameter. 
	 * The method removes 1 health potion from the user, and is used in tandem with updateHp
	 * to serve the function of 1 health potion. If getHealthPotion relays that the user has 
	 * an health potion (returns a number greather than 0), then 1 health potion will be removed 
	 * from the user. 
	 * 
	 */
	public void useHealthPotion() {
		if(getHealthPotion()>0) {
		healthPotion-=1;
		}
	}
	/** The method setLevel is a setter method for the level parameter. It returns nothing, and 
	 * takes the integer parameter newLevel.  If newLevel is not 0 or a negative number, the method will set 
	 * the level parameter to newLevels value. If newLevel is 0 or less than 0, the method will set the level to 1. 
	 * @param newLevel an integer value that is used to set the Level. 
	 */
	public void setLevel(int newLevel) {
		if(newLevel>0) {
		level=newLevel;
		}
		else {
			level=1;
		}
	}
	/** The method setDamage is a setter for the variable damage. It returns nothing, and takes the integer newDamage as a parameter. 
	 * If newDamage is above 0, it sets the damage to new damage. If newDamage is 0 or below it sets the damage to a default value of 10.
	 * @param newDamage an integer value that is used to set the damage.
	 */
	public void setDamage(int newDamage) {
		if(newDamage>0) {
		damage= newDamage;
		}
		else {
			damage=10;
		}
	}
	/**The method updateDamage returns nothing, and uses the integer upDamage, as a parameter. If upDamage is above 0 it will update the damage to 
	 * upDamage. 
	 * @param upDamage an integer value that is used to update the damage. 
	 */
	public void updateDamage(int upDamage) {
		if(upDamage>0) {
		damage+=upDamage;
		}
	}
	
	/** The method setSpeed, returns nothing, and takes the integer newSpeed as a parameter. If newSpeed is greater than 0 then speed will be set to newSpeed. 
	 * newSpeed will not be used if it is 0 or below. 
	 * @param newSpeed an integer value that is used to set the speed. 
	 */
	public void setSpeed(int newSpeed) {
		if(newSpeed>0) {
		speed=newSpeed;
		}
	}
	 /** The method setMaxHp is a setter for maxHp. It returns nothing, and uses newMaxHp as a parameter. If newMaxHp is greater than 0, it will be used 
	  * to set maxHp. If newMaxUp is 0 or below, it will be set to a default value of 20. 
	  * @param newMaxHp an integer value that is used to set the MaxHp. 
	  */
	public void setMaxHp(int newMaxHp) {
		if(newMaxHp>0) {
		maxHp= newMaxHp;
		}
		else {
			maxHp=20;
		}
	}
	 /** The method setExp is a setter for Exp. It returns nothing, and uses newExp as a parameter. If newExp is greater than 0, it will be used 
	  * to set Exp. If newExp is 0 or below, it will be set to a default value of 0. 
	  * @param newExp an integer value that is used to set the Exp. 
	  */
	public void setExp(int newExp) {
		if(newExp>0) {
		exp= newExp;
		}
		else {
			exp=0;
		}
	}
	/**The method updateExp returns nothing and uses the integer exp1 as a parameter to update the exp. If exp1 is greater than 0, then it will update the 
	 * exp to exp1. If exp1 is 0 or lower than the exp will not be changed. 
	 * @param exp1 an integer value that is used to update the exp when neccessary. 
	 */
	public void updateExp(int exp1) {
		if(exp1>0) {
		exp+=exp1;
		}
	}
	 
	/** The method setmaxExp is a setter for MaxExp. It returns nothing, and uses newMaxExp as a parameter. If newMaxExp is greater than 0, it will be used 
	  * to set MaxExp. If newMaxExp is 0 or below, it will be set to a default value of 0. 
	  * @param newMaxExp an integer value that is used to set the MaxExp. 
	  */
	
	public void setmaxExp(int newMaxExp) {
		if(newMaxExp>0) {
		maxExp= newMaxExp;
		}
		else {
			maxExp=20;
		}
	}
	
	/**
	 * Getter method for Hp instance variable 
	 * @return a value of the type integer that represents the hp of the character
	 */
	
	public int getHp() {
		return hp;
	}
	
	/**
	 * Getter method for health potion variable
	 * @return a value of the type integer that represents the health potions the character has.
	 */
	public int getHealthPotion() {
		return healthPotion;
	}
	/**
	 * Getter method for Level instance variable 
	 * @return a value of the type integer that represents the Level of the character
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * Getter method for damage instance variable 
	 * @return a value of the type integer that represents the Level of the character
	 */
	public int getdamage() {
		return damage;
	}
	/**
	 * Getter method for speed instance variable 
	 * @return a value of the type integer that represents the speed of the character
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * Getter method for maxHp instance variable 
	 * @return a value of the type integer that represents the maxHp of the character
	 */
	public int getMaxHp() {
		return maxHp;
	}
	/**
	 * Getter method for exp instance variable 
	 * @return a value of the type integer that represents the exp of the character
	 */
	public int getExp() {
		return exp;
	}
	/**
	 * Getter method for MaxExp instance variable 
	 * @return a value of the type integer that represents the maxExp of the character
	 */
	public
	public int getMaxExp() {
		return maxExp;
	}
	
	/** This method is called everytime the user increases a level, it returns nothing, and has no parameters. 
	 *  Level is increased by 1, and exp becomes the Exp - maxExp, meaning that it increases to the maxExp, and the remainder is now the Exp.
	 */
	public void LvlUp() {
			level+=1;	
			exp= exp-maxExp;
	}
	/**
	 * The method hpUp returns nothing, has no parameters, and increases the hp variable by 5. 
	 */
	public void hpUp() {
		hp+=5;
	}
	/**
	 * The method maxHpUp returns nothing, has no parameters, and increases the maxHp variable by 5. 
	 */
	public void maxHpUp() {
		maxHp+=5;
	}
	/**
	 * The method maxExpUp returns nothing, has no parameters, and increases the maxExp variable by 5.
	 */
	public void maxExpUp() {
		maxExp+=5;
	}
	/**
	 * The method damageUp returns nothing, has no parameters, and increases the damage variable by 1.
	 */
	public void damageUp() {
		damage+=1;
	}
	/**
	 * The method speedUp returns nothing, has no parameters, and increases the speed variable by 2.
	 */
	public void speedUp() {
		speed+=2;
	}
	/**The method createAvatar returns nothing, but takes alot of parameters. It takes integer values for 
	 * hp, level, damage, speed, maxHp, exp, and maxExp. It then uses these parameters and setter methods to set the 
	 * hp, level, damage, speed, maxHp, exp, and maxExp.
	 * @param hp the integer amount used to set the avatars Hp using the setHp method. 
	 * @param level the integer amount used to set the avatars level using the setLevel method. 
	 * @param damage the integer amount used to set the avatars level using the setDamage method.
	 * @param speed the integer amount used to set the avatars level using the setSpeed method.
	 * @param maxHp the integer amount used to set the avatars level using the setMaxHp method.
	 * @param Exp the integer amount used to set the avatars level using the setExp method.
	 * @param maxExp the integer amount used to set the avatars level using the setMaxExp method.
	 */
	public void createAvatar(int hp, int level, int damage, int speed, int maxHp, int exp, int maxExp) {
		//Character Avatar= new Character();
		setHp(hp);
		setDamage(damage);
		setExp(exp);
		setLevel(level);
		setmaxExp(maxExp);
		setSpeed(speed);
		setMaxHp(maxHp);
	}
	/**The method createEnemy returns nothing, but takes alot of parameters. It takes integer values for 
	 * hp, damage, level and maxHp. It then uses these parameters and setter methods to set the 
	 * hp, damage, level and maxHp.
	 * @param hp the integer amount used to set the avatars Hp using the setHp method.
	 * @param damage the integer amount used to set the avatars level using the setDamage method.
	 * @param level the integer amount used to set the avatars level using the setLevel method.
	 * @param maxHp the integer amount used to set the avatars level using the setMaxHp method.
	 */
	public void createEnemy(int Hp, int damage, int level, int maxHp) {
		//Character Enemy= new Character();
		setHp(Hp);
		setDamage(damage);
		setLevel(level);
		setMaxHp(maxHp);
	}
}	
