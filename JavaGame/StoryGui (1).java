package Gui;

import java.util.ArrayList;

public class StoryGui {
	
	ArrayList<String> storyOrderStartA1 = new ArrayList<String>(100);
	ArrayList<String> storyOrderStartA2= new ArrayList<String>();
	ArrayList<String> storyOrderStartA3= new ArrayList<String>();
	
	String beginning1;
	String beginning2;
	String beginning3;
	String beginning3Result;
	String beginning4;
	String beginning5;
	String instructions1_3;
	String instructions2_3;
	String instructions3_3;
	String tutorial1_2;
	String tutorial2_2;
	String tutorial1Result1;
	String tutorial1Result2;
	String tutorial1Result3;
	
	String tutorial2_1;
	String tutorial2Result1;
	String tutorial2Result2;
	String tutorial2Scenario2;
	String tutorial2Scenario2Result1;
	String tutorial2Scenario2Result2;
	String tutorial2Result3;
	String chooseDirection;
	String chooseDirectionResult1;
	String chooseDirectionResult2;
	
	//LEFT SIDE///
	String goLeft1;
	String goLeft2;
	String leftScenario1;
	String leftScenario2;
	
	String npcTyrone1;
	String npcTyrone1Result1;
	String npcTyrone1Result2;
	String npcTyrone1Result_1Or2_Scenario1;
	String npcTyrone1Result3;
		
	String npcTyroneQuest1;
	String npcTyroneQuest2;
	String npcTyroneQuestResult1;
	String npcTyroneQuestResult2;
		
	String battlePrelude1;
	String battlePrelude2;
	String battlePrelude2Result1Scenario1;
	String battlePrelude2Result1Scenario2;
	String battlePrelude2Result2;
	
	String battleScenario1;
	String afterBattle1;
	String afterBattle1_2;
	String battleScenario2;
	
	String afterBattle2;
	String afterBattle2_1;
	String battleScenario3;
	
	String preludeBossBattle1;
	String preludeBossBattle1_2;
	String preludeBossBattle1_3;
	String preludeBossBattle1_4;
	String preludeBossBattle1_5;
	String preludeBossBattle1_6;
	
	String afterBossBattle;
	
	String beforeTheDoors1;
	String beforeTheDoors2;
	
	String talkingToGod;
	String talkingToGodResult1;
	String talkingToGodResult2;
	String talkingToGodResult2_2;
	
	
	
	//RIGHT SIDE//
	String right1;
	String ScenarioR1;
	String ScenarioR1Result1;
	String ScenarioR1Result2;
	String ScenarioR2;
	String ScenarioR2Result1;
	String ScenarioR2Result2;
	String ScenarioR2Result3;
	String ScenarioR3; 
	String ScenarioR3Result1;
	String ScenarioR3Result2;
	String ScenarioR4;
	String ScenarioR4Result1;
	String ScenarioR4Result2; 
	String ScenarioR4Result3;
	String ScenarioR5;
	String ScenarioR6; 
	String beforeTheDoors2Right;
	
public ArrayList<String> getArrayListStartingMethodsA1(){
	addStartingMethodsA1();
	return storyOrderStartA1;
}
public ArrayList<String> getArrayListStartingMethodsA2(){
	addStartingMethodsA2();
	return storyOrderStartA2;
}
public ArrayList<String> getArrayListStartingMethodsA3(){
	addStartingMethodsA3();
	return storyOrderStartA3;
}
public void addStartingMethodsA1() {
	storyOrderStartA1.add(0, getBeginning1());
	storyOrderStartA1.add(1 ,getBeginning2());
	storyOrderStartA1.add(2, getBeginning3());
	storyOrderStartA1.add(3, getBeginning3Result());
	storyOrderStartA1.add(4, getBeginning4());
	storyOrderStartA1.add(5, getBeginning5());
	storyOrderStartA1.add(6, getInstructions1_3());
	storyOrderStartA1.add(7, getInstructions2_3());
	storyOrderStartA1.add(8, getInstructions3_3());
	storyOrderStartA1.add(9, getTutorial1_2());
	storyOrderStartA1.add(10, getTutorial2_2());
	storyOrderStartA1.add(11, getTutorial1Result1());
	storyOrderStartA1.add(12, getTutorial2_1());
	storyOrderStartA1.add(13, getChooseDirection());
	storyOrderStartA1.add(14, getTutorial2Result2Scenario());
	storyOrderStartA1.add(15, getChooseDirection());
	storyOrderStartA1.add(16, EmptyString());
	storyOrderStartA1.add(17, getGoLeft1());
	storyOrderStartA1.add(18, getScenarioR1());
	storyOrderStartA1.add(19, getScenarioR1Result1());
	storyOrderStartA1.add(20, getScenarioR2());
	storyOrderStartA1.add(21, getScenarioR2Result1());
	storyOrderStartA1.add(22, getScenarioR3());
	storyOrderStartA1.add(23, getScenarioR3Result1());
	storyOrderStartA1.add(24, getScenarioR3Result2());
	storyOrderStartA1.add(25, getScenarioR4());
	storyOrderStartA1.add(26, getScenarioR4Result1());
	storyOrderStartA1.add(27, getScenarioR5());
	storyOrderStartA1.add(28, getScenarioR6());
	storyOrderStartA1.add(29, getBeforeTheDoors2());
	
	
}
public void addStartingMethodsA2() {
	storyOrderStartA2.add(0, getBeginning1());
	storyOrderStartA2.add(1 ,getBeginning2());
	storyOrderStartA2.add(2, getBeginning3());
	storyOrderStartA2.add(3, getBeginning3Result());
	storyOrderStartA2.add(4, getBeginning4());
	storyOrderStartA2.add(5, getBeginning5());
	storyOrderStartA2.add(6, getInstructions1_3());
	storyOrderStartA2.add(7, getInstructions2_3());
	storyOrderStartA2.add(8, getInstructions3_3());
	storyOrderStartA2.add(9, getTutorial1_2());
	storyOrderStartA2.add(10, getTutorial2_2());
	storyOrderStartA2.add(11, getTutorial1Result2());
	storyOrderStartA2.add(12, getTutorial2_1());
	storyOrderStartA2.add(13, getTutorial2Result2());
	storyOrderStartA2.add(14, getTutorial2Result2Scenario());
	storyOrderStartA2.add(15, getTutorial2Result2ScenarioResult2());
	storyOrderStartA2.add(16, getChooseDirection());
	storyOrderStartA2.add(17, getRight1());
	storyOrderStartA2.add(18, EmptyString());
	storyOrderStartA2.add(19, getScenarioR1Result2());
	storyOrderStartA2.add(20, EmptyString());
	storyOrderStartA2.add(21, getScenarioR2Result2());
	storyOrderStartA2.add(22, EmptyString());
	storyOrderStartA2.add(23, getScenarioR3Result2());
	storyOrderStartA2.add(24, EmptyString());
	storyOrderStartA2.add(25, EmptyString());
	storyOrderStartA2.add(26, getScenarioR4Result2());
	
}

public void addStartingMethodsA3() {
	storyOrderStartA3.add(0, getBeginning1());
	storyOrderStartA3.add(1 ,getBeginning2());
	storyOrderStartA3.add(2, getBeginning3());
	storyOrderStartA3.add(3, getBeginning3Result());
	storyOrderStartA3.add(4, getBeginning4());
	storyOrderStartA3.add(5, getBeginning5());
	storyOrderStartA3.add(6, getInstructions1_3());
	storyOrderStartA3.add(7, getInstructions2_3());
	storyOrderStartA3.add(8, getInstructions3_3());
	storyOrderStartA3.add(9, getTutorial1_2());
	storyOrderStartA3.add(10, getTutorial2_2());
	storyOrderStartA3.add(11, getTutorial1Result3());
	storyOrderStartA3.add(12, getTutorial2_1());
	storyOrderStartA3.add(13, getTutorial2Result3());
	storyOrderStartA3.add(14, EmptyString());
	storyOrderStartA3.add(15, EmptyString());
	storyOrderStartA3.add(16, EmptyString());
	storyOrderStartA3.add(17, EmptyString());
	storyOrderStartA3.add(18, EmptyString());
	storyOrderStartA3.add(19, EmptyString());
	storyOrderStartA3.add(20, EmptyString());
	storyOrderStartA3.add(21, getScenarioR2Result3());
	storyOrderStartA3.add(22, EmptyString());
	storyOrderStartA3.add(23, EmptyString());
	storyOrderStartA3.add(24, EmptyString());
	storyOrderStartA3.add(25, EmptyString());
	storyOrderStartA3.add(26, getScenarioR4Result3());
}
	
	
public String getBeginning1() {
	return beginning1= "\nOpening your eyes, you are greeted with darkness.\n(Press \"1\" to continue.)\n-----------------------------------------------------------------------------";
}
public String getBeginning2() {
	return beginning2= "\nVoice: Were you satisfied with the life you had?\n-----------------------------------------------------------------------------\n\t Enter 1 for: What?\n\t Enter 2 for: Who are you...?\n\t Enter 3 for: What happened? ...Where am I?";
}
public String getBeginning3() {
	return beginning3="\n-----------------------------------------------------------------------------\nVoice: I know you have many questions swarming about in your head, but to summarize all of this, you've died.\n-----------------------------------------------------------------------------\n\t 1. Are you serious? Am I really dead?\n\t 2. ...You've got to be kidding me...\n\t 3. So this is what it's like being dead?...";
}
public String getBeginning3Result() {
	return beginning3Result="\n-----------------------------------------------------------------------------\nVoice: Regardless of any thoughts you are having,your soul is now being judged. You will either ascend to Heaven or descend to Hell. Therefore, you will be roaming the floors of Purgatory.  (Press 1 to continue)";
}
public String getBeginning4() {
	return beginning4= "\n-----------------------------------------------------------------------------\n\t 1. What is purgatory?\n\t 2. What do you mean by \"being judged\"...\n\t 3. Wait...does that mean I'm basically a ghost?\n-----------------------------------------------------------------------------";
}
public String getBeginning5() {
	return beginning5=  "\n-----------------------------------------------------------------------------\nVoice: You will find the answers to your questions once you've arrived at your destination.\n(Press \"1\" to continue.)\n-----------------------------------------------------------------------------";
}
public String getInstructions1_3() {
	return instructions1_3= "\nVoice: You will be given a new life in purgatory, but it won't be an easy one. If you want to have a peaceful afterlife, you must conquer each floor and prove that you are worthy to traverse into Paradise.\n(Press \"1\" to continue.)\n-----------------------------------------------------------------------------";
}
public String getInstructions2_3() {
	return instructions2_3= "\nA bright light suddenely engulfs your vision.\n(Press \"1\" to continue.\n-----------------------------------------------------------------------------";
}
public String getInstructions3_3() {
	return instructions3_3="\nGod: Ah yes, my child. A gift from me, to help you on your journey.\n(Press \"1\" to continue.)\n-----------------------------------------------------------------------------";
}
public String getTutorial1_2() {
	return tutorial1_2="\nYou wake up on the cold floor of an abandoned apartment building and find a bag beside you. You open it up to find 3 red viles, each with \"Health Potion\" written on it in black ink. \"(Press 1 to Continue)\"\n-----------------------------------------------------------------------------";
}
public String getTutorial2_2() {
	return tutorial2_2= "\nWithin the darkness you hear a low growl from the corner of the room. You feel an object at your feet.\n-----------------------------------------------------------------------------\n\tWhat will you do?\n\t1. Walk towards the noise.\n\t2. Pick up the object by your feet.\n\t3. Run towards the only door in the room";
}
public String getTutorial1Result1() {
	return tutorial1Result1= "\n-----------------------------------------------------------------------------\nA huge naked mole rat lunges at you.\nEverything suddenly fades away.\n----------------------------------------------";
}
public String getTutorial1Result2() {
	return tutorial1Result2="\n-----------------------------------------------------------------------------\nYou have aquired a baseball bat! A huge naked mole rat lunges at you. You counter and push the mole rat back.\n----------------------------------------------------------------------------- (Press 1 to continue)";
}
public String getTutorial1Result3() {
	return tutorial1Result3= "\n-----------------------------------------------------------------------------\nYou run towards the door. As you twist the doorknob, you realise it's locked. The growl gets louder. A huge naked mole rat lunges at you. Everything suddenly fades away.\n----------------------------------------------------------------------------- ";
}

public String getTutorial2_1() {
	return tutorial2_1 = "\n-----------------------------------------------------------------------------\nYou hear the slamming open of a door. Light suddenly rushes into the room. You look down and see yourself covered in blood.\n\tWhat will you do?\n\t1. Walk towards the door.\n\t2. Search the room for anything useful.\n\t3. Sit in the corner of the room and cry because you know there are more monsters out there.\n-----------------------------------------------------------------------------";
}
	public String EmptyString() {
		return tutorial2Result1 = "";
		//Goes to ChooseDirection
	}

public String getTutorial2Result2() {
	return tutorial2Result2 = "\nYou search the room and find some health potions. You put them in your bag. (Press 1 to continue)\n-----------------------------------------------------------------------------";
}
	public String getTutorial2Result2Scenario() {
		return tutorial2Scenario2 = "\n\tWhat will you do?\n\t1. Walk towards the door.\n\t2. Sit in the corner of the room and cry because you know there are more monsters out there. ";
	}
		public String getTutorial2Result2ScenarioResult1() {
			return tutorial2Scenario2Result1 = "";
			//Goes to ChooseDirection
		}
		public String getTutorial2Result2ScenarioResult2() {
			return tutorial2Scenario2Result2 = "\n-----------------------------------------------------------------------------\nYou stop and think to yourself: \"What's the point in sitting here and doing nothing? I need to reach Heaven! Besides, I just killed a naked mole rat! I think I can handle myself pretty well if I do say so myself!\"\nYou walk towards the door. (Press 2 to continue)\n-----------------------------------------------------------------------------";
			//Goes to ChooseDirection
		}


public String getTutorial2Result3() {
	return tutorial2Result3 = "\nYou stop and think to yourself: \"What's the point in sitting here and doing nothing? I need to reach Heaven! Besides, I just killed a naked mole rat! I think I can handle myself pretty well if I do say so myself!\"\nYou walk towards the door. (Press 1 to continue) \n-----------------------------------------------------------------------------";
	//Goes to ChooseDirection
}


/*
 * ___________________________________________________________________________________________________________________________________________________________________________________________
 */
	
	
public String getChooseDirection() {
	return chooseDirection = "\nSquinting, you step into the brightly lit corridor of the old apartment. You look to your right and then to your left. Peering down the long corridor....\n-----------------------------------------------------------------------------\n\tWhat will you do?\n\t1. Go left.\n\t2. Go right.";
}
	public String getChooseDirectionResult1() {
		return chooseDirectionResult1 = "";
		//Go left
	}
	public String getChooseDirectionResult2() {
		return chooseDirectionResult2 = "";
		//Go right
	}

















////////////////////////////// RIGHT SIDE////////////////////////////////////////
public String getRight1() {
	return right1= "\n-----------------------------------------------------------------------------\nTurning to your right, you begin to creep forwards. While moving ahead, you can't help but peer out the windows. A blanket of fog impairs your attempt at making out anything. Shifting your attention back to the corridor, you see a sign. Stopping at the sign, you find out that the apartment is split up into 3 levels. (Press 1 to continue)";
}

public String getScenarioR1() {
	return ScenarioR1 = "\n-----------------------------------------------------------------------------\n\"BOOM!\" you hear a loud noise behind you while observing the sign. Considering your previous experience in the room, you're not very excited to turn around and face what's happening.\n-----------------------------------------------------------------------------\n\tWhat will you do? \n\t1. Face the unknown \n\t2. Attempt to run down the stairs";
}

public String getScenarioR1Result1() {
	return ScenarioR1Result1 = "\n-----------------------------------------------------------------------------\nYou turn around, the window you peered out of is shattered into pieces. Fog has filled the hallway. In front of you is a floating hoodie. You recognize the \"Supreme\" logo on the front. You begin to see the off-white paint on the walls peel off and an arm begins to form out of one of the holes in the hoodie. The arm reaches into the hoodie pocket and pulls out a mechanically extendablee scythe. You think: \"when did ghosts get so advanced?\"(Press 1 to continue)";
}
// put a death scene
public String getScenarioR1Result2() {
	return ScenarioR1Result2 = "\n-----------------------------------------------------------------------------\nOut of frustration due to your situation, you make the decision to run down the stairs. Before you make your first step, a hooked blade encompasses you. Everything suddenly fades away.";
}

public String getScenarioR2() {
	return ScenarioR2 = "\n-----------------------------------------------------------------------------\nYour victory leaves you in a moment of slight elation. Despite the situation you're placed in, a victory always feels good.\n You head down the stairs, feeling more qualified to deal with whatever else is thrown at you. \n The lobby of the building is small, you notice that all of the P.O boxes are open, rusted to the point that a small touch might lead to their disentegration.The room is cold. You feel a slight breeze between your legs. \n You glance behing you and see a small air conditioner that is running on medium power. You look around some more and locate a door made of glass and steel beams.You can only see fog on the other side. You go to open it but it's locked, you will need to find a key. \n As you turn around, you notice an open room to your right. You can't see anything through the door frame. It's almost as though someone placed a poster of a dark room on the wall.\n-----------------------------------------------------------------------------\n \tWhat will you do? \n\t1.Inspect the P.O boxes. \n\t2. Turn off the air conditioner. \n\t3. Inspect the doorway";
}

//Enter Battle
public String getScenarioR2Result1() {
	return ScenarioR2Result1 = "\n-----------------------------------------------------------------------------\nYou search the P.O boxes one by one. They're all empty, except the last. You come across a laser pointer in the last box located on the bottom right of the P.O box set. You grab the laser pointer and click the button to see if it works. A green beam shoots out and starts moving up and down on one of the walls of the room. \n-----------------------------------------------------------------------------\n After a minute, you see a large bloodshot eye on the wall you were just drawing on. The size of the eye is frightening to you, and you're frozen in place. You start hearing a small rumbling noise, reminiscent of human digestion. \"WHOOSH!\" a giant blood clot is shot towards you from the pupil of the eye. It barely missed your head. (Press 1 to continue)";
}
 // death
public String getScenarioR2Result2() {
	return ScenarioR2Result2 = "\n-----------------------------------------------------------------------------\nThe cold of the room is getting to your head, it's not allowing you to think clearly. As a result you want to turn of the annoying air conditioner. As you reach for the power button a feeling of overwhelming dread besets itself upon you. Regardless, you turn it off. The room slowly starts to melt away and you begin smelling the faint scent of fire. The remenants of the room lay on red brimstone, slowly evaporating. \nYou look up, and a demon impales your head with a pitchfork. Everything suddenly fades away.";
}

// Straight to R3
public String getScenarioR2Result3() {
	return ScenarioR2Result3 = "\n-----------------------------------------------------------------------------\nYou head to the doorway. Afraid of what might be behind it because dark rooms are always scary. Before you reach it, a key falls from the roof onto your head. Well isn't that convenient? You use the key on the door of the lobby and it opens, for now filling the lobby. You are now free to exit. (Press 1 to continue)";
}

public String getScenarioR3() {
	return ScenarioR3 = "\n-----------------------------------------------------------------------------\nAll the fog from the outside seemed to have moved to the lobby. You can see everything around you now. The area you walked into is fenced off by a yellow picket fence, too tall for you to climb. The lobby door seems to have lead to a back entrance of the building.\n The ground is purely soil. A bit odd since you'd expect there to be more pavement outside of an apartment building. In front of you, you see a crack in the fence. You can see something flashing behind it.\nTo your left, you see a big dumpster without a waste management company advertised on the outside, how odd...\n-----------------------------------------------------------------------------\n\tWhat will you do?\n\t1. Inspect the soil with your hands.\n\t2. Search the dumpster";
}

// Lose 5hp and revert to getScenarioR3Result2 after user clicks option 1. 
public String getScenarioR3Result1() {
	return ScenarioR3Result1 = "\n-----------------------------------------------------------------------------\nYou reach towards the ground and grab some soil. You bring it to your face and smell it. The smell reminds of you of boiled eggs - sulfur. You feel the sudden urge to sneeze and accidentally breathe some in. It slowly burns your windpipe and you cough it out. You should never smell something directly, I'm pretty sure I learned that in chemistry class.\n-----------------------------------------------------------------------------\n You've lost 5 Hp.\n----------------------------------------------------------------------------- \n\tWhat will you do?\n\t1. Search the dumpster";
}

// Add 3 health potions
public String getScenarioR3Result2() {
	return ScenarioR3Result2 = "\n----------------------------------------------------------------------------- \nYou open the dumpster slowly, you don't trust anything anymore. Surprisingly, you find it bare. You tilt yourself over so you can fully see into it. You find a few health potions and a crowbar. You have an idea of where you want to use it.(Press 1 to continue)";
}

public String getScenarioR4() {
	return ScenarioR4 = "\n-----------------------------------------------------------------------------\n You walk up to the fence, ready to shove the crowbar into the crack and continue the journey. Each step you take becomes harder and harder. The ground beneath you is changing in consistency. Soon enough, you're knee deep in this sulphur smelling goo. You try to take one more step, lifting your foot out of the sulphur quicksand and placing it back in just to sink in more. You hear a loud clicking noise. You see the quicksand around you fall into empty space in a domino effect. \nYou can't see where it's falling. There's still a hefty amount of it around you. You begin levitating backwards, and downwards at elevator speed.\n Each time you pass a small distance, a small step is placed in front of you. You stop and are popped out of the quicksand by an unexplainable force. The quicksand then quickly hardens into brimstone.\n You look around. You're on a single platform with fire burning far beneath you. The stairs lead up to the cracked fence. The staircase has metal railings on either side. In the distance, you can hear faint screams. They don't sound human... well maybe kind of.\n-----------------------------------------------------------------------------\n\t1. Walk up the stairs. \n\t2. Stay put because this is too much for you to handle. \n\t3. Jump into the fire because you've always wanted to know what fire feels like.";
}
 
// Boulder combat
public String getScenarioR4Result1() {
	return ScenarioR4Result1 = "\n-----------------------------------------------------------------------------\nYou decide to trek on and take each step with extreme caution. Only 1/4 of the way there and you see a boulder rolling down the stairs. You can't really do much... there isnt anywhere to run. You close your eyes, expecting to be flattened.\n A minute passes, and you're not dead yet. You open your eyes slowly. Nothing you've seen so far has been normal, but this defintely takes the prize. The boulder is made out of the same material the eye was spitting at you earlier. It's like a big blood clot. It has arms and legs. I can't believe it, its SATAN!!!!! (Press 1 to continue)";
}

// death 
public String getScenarioR4Result2() {
	return ScenarioR4Result2 = "\n-----------------------------------------------------------------------------\nEverything suddenly fades away.";
}

// death 
public String getScenarioR4Result3() {
	return ScenarioR4Result3 = "\n-----------------------------------------------------------------------------\nEverything suddenly fades away.";
}

public String getScenarioR5() {
	return ScenarioR5 = "\n-----------------------------------------------------------------------------\nAfter defeating the abomination, you climb to the top of the stairs and attempt to break open the fence with the crowbar. You're successful in breaking open the fence and leading you back into the same environment you were in before.\n In front of you, you see a shop. That \"OPEN\" sign you saw through the crack has stopped flickering. To get to the shop you have to cross a street. You look both ways, and proceed to walk.\nAs you reach for the door handle, you hear a honk behind you. You look around. A car is positioned with its front bumper a little ways from your knees. You look into the drivers seat and you can't believe what you see. It's you... \nYour clone steps out of the car, and challenges you to a fight.(Press 1 to continue)";
}
// goes to before the doors 2 
public String getScenarioR6() {
	return ScenarioR6 = "\n-----------------------------------------------------------------------------\nYou've defeated your clone. It feels like you have cleansed yourself from all the sins you carried. You walk to the door and open it. Everything suddenly turns white.(Press 1 to continue)";
}

public String getBeforeTheDoors2() {
	return beforeTheDoors2Right = "\n-----------------------------------------------------------------------------\n \"God: Welcome, my child. You have done well.\"";
}

/////LEFT SIDE//////
public String getGoLeft1() {
	return goLeft1 = "\n-----------------------------------------------------------------------------\nTurning to your left, you begin to creep forwards. While moving ahead, you can't help but peer out the windows. A blanket of fog impairs your attempt at making out anything. Shifting your attention back to the corridor, you see a sign. As you continue to walk you can't help but notice the graffiti on the walls and cover your nose due to the strong marijuana odour. Suddenly, you're abbushed by what looks like a ghost affiliated with the blood gang.(Press 1 to continue)\n-----------------------------------------------------------------------------";
}	
}

