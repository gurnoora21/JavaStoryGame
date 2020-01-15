package Gui;
import java.util.Random; /**We imported the random utility to bring variation to the fights.
                         */
/**The Battle class is inherited by the BattleGui Class
 */
public class BattleGui extends Battle {

//Character Enemy= Story.enterCombat.getEnemy();
//Character Avatar= Story.enterCombat.getAvatar();
Random Num= new Random();

private int randNum1;
private int avaSpeed; 
private int  randNum2; 
private int finalSpeed; 

/**
 * Getter method for finalSpeed
 * @return a value of type integer used to represent the finalSpeed of the character
 */
public int getFinalSpeed(){
	return finalSpeed;
}

/**
 * Getter method for randNum1
 * @return a value of type integer used to determine a random number for case 3 in the switch statement 
 */
public int getRandNum1() {
	return randNum1;
}
/**
 * Getter method for randNum2
 * @return a value of type integer used to determine a random number for case 3 in the switch statement 
 */
public int getRandNum2() {
	return randNum2;
}
/**
 * Getter method for avaSpeed
 * @return a value of type integer that represents the average speed of the character. 
 */
public int getAvaSpeed() {
	return avaSpeed;
}
	/** 
	 * The fight method contains the options for the whole battle system. Case 1 is the attack case case 2 is the use health potion case, 
	 * case 3 is the run away case. 
	 * @param answer the value of answer decides which case will be chosen, there is a total of 3 cases, so the answer can be between 1-3. 
	 */
	public void fight(int answer) {
		int remaningHealthEnemy;
		/**Case 1 of the switch statement is the attack function of the battlegui class. It prints out the Hp of the enemy, and then executes
		 * an attack on the enemy. To do this it subtracts the avatar damage from the enemy and sets this new Hp as the remaining health of the enemy.
		 * If the enemy dies (health 0 or below), it updates the exp of the avatar by an exp amount that is the current level + 4. So a level 1 will gain 5 exp (1+4).
		 * If the enemy is alive, it gets a chance to attack the avatar. The enemies damage is subtracted from the avatars Hp, and this new Hp is set as the avatar Hp.
		 * If the avatar hp becomes 0 or below, the death() method in GuiLayout executes.  
		 */
			switch(answer){
				case 1: 
					System.out.println(Enemy.getHp());
					remaningHealthEnemy=Enemy.getHp()- Avatar.getdamage();
					Enemy.setHp(remaningHealthEnemy);
					if(remaningHealthEnemy<=0) {
						answer=3;
						int exp1= Enemy.getLevel()+4;
					
					Avatar.updateExp(exp1);
					//System.out.println("\nYou have defeated the enemy and gained " + exp1 + " exp." + " EXP: " + Avatar.getExp() +"/" + Avatar.getMaxExp()+ "\n");
					}
					
					if(remaningHealthEnemy>0) {
						int remaningHealthAvatar= Avatar.getHp()-Enemy.getdamage();
						Avatar.setHp(remaningHealthAvatar);
						
					}
					
					if(Avatar.getHp()<=0) {
						//System.out.println("You died");
						answer=3;
					}
					break;
			/** Case 2 of the switch statement is the use health potion function. If the avatar has a health potion, and the Hp of the avatar
			 * is less than the maximum Hp, the Hp of the avatar will be increased by 30 using the updateHp() method, and a health potion 
			 * will be removed using the useHealthPotion() method. If there are no health potions, the game will notify the user with a print statement.
			 */
				case 2:
					if(Avatar.getHealthPotion()>0) {
						if(Avatar.getHp()<Avatar.getMaxHp()) {
						
						Avatar.updateHp();
						Avatar.useHealthPotion();
						
						//System.out.println("\nYou have healed:"+ amountHealed + "Hp \n");
						}
					}
					else {
						//System.out.println("\nYou have 0 Health Potions.");
						answer=3;
					}
					break;
				/**Case 3 of the switch statement is the run away function. 2 random numbers are generated. randNum1 is between 100 and 0, and rand Num 2 
				 * is between 30 and 0. The final speed of the avatar is always the avaSpeed + randNum 2. If the finalSpeed of the avatar is greater than
				 * the number generated for randNum1, the avatar will escape the enemy and no damage will be taken. If the finalSpeed is lower than randNum1
				 * the avatar will be attacked by the enemy. The enemies damage will be subtracted from the avatars Hp, and this new Hp will be set as the avatar Hp. 
				 * If the Avatar health goes to 0 or below because of this, the death() method in GuiLayout will execute.   
				 */
				case 3:
					randNum1= Num.nextInt(100)+0;
					avaSpeed= Avatar.getSpeed();
					randNum2= Num.nextInt(30)+0;
					finalSpeed= randNum2+avaSpeed;
					
					if(randNum1<finalSpeed) {
						 //System.out.println("\nYou have ran away.");
					}
					else if(randNum1>finalSpeed) {
						answer = 5;
						int remaningHealthAvatar= Avatar.getHp()-Enemy.getdamage();
						Avatar.setHp(remaningHealthAvatar);
						//System.out.println("\nYou have failed to run away.");

						if(remaningHealthAvatar<=0) {
							//System.out.println("\n\tYou died.");
							answer=3;
						}
					}
					break;
			}
		//}
		
	}
	
}
