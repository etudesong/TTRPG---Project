package Logic;

import Classes.Adventurer;

public class CommandHelp extends Command {

	@Override
	public void execute(Adventurer player, GameLogic game) {
		if (target.isBlank()) {
			System.out.println("List of Commands available:\nAttack\nExamine\nMove\nTake\nSkill\nUse\nExit\n" +
				"For More information on a command, type 'Help' and then the command you want more information on.");
		} else {
			String text = "Invalid text. Please review the command and try again.";
			switch (target) {
				case "attack":
					text = "Attack <target>. Causes the player to start combat, focusing on the enemy specified by replacing <target> with their name.";
				case "examine":
					text = "Examine <item>. Allows player to get a description on a specified item, or if no target is specified, gives a description of the room player is in.";
				case "ove": 
					text = "Move <direction>. Allows player to move to another room in the direction specified, either North, East, South, or West.\n" + 
					"There must be an exit in that direction that isn't blocked.";
				case "take":
					text = "Take <item>. Picks up an specified item. Items locked in chests are unavailable until unlocked.";
				case "skill":
					text = "Skill <player skill>. Allows the player to use a racial or class skill. Only useful in certain scenarios";
				case "use":
					text = "Use <item>. Allows a player to use an item in their inventory. Using equipment will allow the player to equip it for a permanent boost, all other items are one time use.";
				case "exit":
					text = "Exit. Quit the game. No saves, only restarts.";
			} 
			
			System.out.println(text);
				
		}

	}

}
