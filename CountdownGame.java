/*
C Odoemene
CountdownGame.java
07 05 2020
*/

//game has minor bugs still to be ironed out

import javax.swing.*;
public class CountdownGame{
	public static void main (String[]args){

		 int rounds;
		 int vowelsAmount;
		 int consAmount;
		 String vowels[] = {"a","e","i","o","u"};
		 String cons[] = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
		 StringBuffer playerLetters1;
		 playerLetters1 = new StringBuffer();
		 String bank[] = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "if", "import","int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"};
		 String playerWord1 = "";
		 String playerWord2 = "";
		 int points1 = 0;
		 int points2= 0;
		 int length1 = 0;
		 int length2 = 0;
		 boolean playAgainSwitch = false;
		 String playAgain = "";



			rounds = Integer.parseInt(JOptionPane.showInputDialog(null,"How many rounds are we playing ?"));

			for(int i = 0; i < rounds; i++){
				vowelsAmount = Integer.parseInt(JOptionPane.showInputDialog(null,"How many vowels do you want ? (1 - 8)"));
				consAmount = 9 - vowelsAmount ;
				JOptionPane.showMessageDialog(null,"you have "+ vowelsAmount+ " vowels and "+consAmount+" consonants");

				//player 1
				for(int j = 0; j < vowelsAmount ; j++){
					playerLetters1.append(vowels[(int)(Math.random()*4)+1]);
				}

				for(int t = 0; t < consAmount ; t++){
					playerLetters1.append(cons[(int)(Math.random()*20)+1]);
				}

				playerWord1 = JOptionPane.showInputDialog(null,"Player 1 : make the largest java keyword you can using these letter: "+ playerLetters1);
				playerWord2 = JOptionPane.showInputDialog(null,"Player 2 : make the largest java keyword you can using these letter: "+ playerLetters1);


				if(playerWord1.equalsIgnoreCase("if")|| playerWord1.equalsIgnoreCase("do")){
					length1 = 2;
					JOptionPane.showMessageDialog(null,"Player 1: your word was "+ length1+ " letters long.");
				}
				else if(playerWord1.equalsIgnoreCase("try")|| playerWord1.equalsIgnoreCase("new")|| playerWord1.equalsIgnoreCase("int")|| playerWord1.equalsIgnoreCase("for")){
					length1 = 3;
					JOptionPane.showMessageDialog(null,"Player 1: your word was "+ length1+ " letters long.");
				}
				else if(playerWord1.equalsIgnoreCase("this")|| playerWord1.equalsIgnoreCase("void")|| playerWord1.equalsIgnoreCase("long")|| playerWord1.equalsIgnoreCase("enum")|| playerWord1.equalsIgnoreCase("byte")|| playerWord1.equalsIgnoreCase("case")|| playerWord1.equalsIgnoreCase("char")|| playerWord1.equalsIgnoreCase("else")){
					length1 = 4;
					JOptionPane.showMessageDialog(null,"Player 1: your word was "+ length1+ " letters long.");
				}
				else if(playerWord1.equalsIgnoreCase("short")|| playerWord1.equalsIgnoreCase("super")|| playerWord1.equalsIgnoreCase("throw")|| playerWord1.equalsIgnoreCase("while")|| playerWord1.equalsIgnoreCase("float")|| playerWord1.equalsIgnoreCase("final")|| playerWord1.equalsIgnoreCase("break")|| playerWord1.equalsIgnoreCase("class")){
					length1 = 5;
					JOptionPane.showMessageDialog(null,"Player 1: your word was "+ length1+ " letters long.");
				}
				else if(playerWord1.equalsIgnoreCase("public")|| playerWord1.equalsIgnoreCase("return")|| playerWord1.equalsIgnoreCase("static")|| playerWord1.equalsIgnoreCase("switch")|| playerWord1.equalsIgnoreCase("throws")|| playerWord1.equalsIgnoreCase("native")|| playerWord1.equalsIgnoreCase("double")|| playerWord1.equalsIgnoreCase("import")){
					length1 = 6;
					JOptionPane.showMessageDialog(null,"Player 1: your word was "+ length1+ " letters long.");
				}
				else if(playerWord1.equalsIgnoreCase("private")|| playerWord1.equalsIgnoreCase("package")|| playerWord1.equalsIgnoreCase("finally")|| playerWord1.equalsIgnoreCase("extends")|| playerWord1.equalsIgnoreCase("boolean")|| playerWord1.equalsIgnoreCase("default")|| playerWord1.equalsIgnoreCase("package")){
					length1 = 7;
					JOptionPane.showMessageDialog(null,"Player 1: your word was "+ length1+ " letters long.");
				}
				else if(playerWord1.equalsIgnoreCase("strictfp")|| playerWord1.equalsIgnoreCase("volatile")|| playerWord1.equalsIgnoreCase("abstract")|| playerWord1.equalsIgnoreCase("continue")){
					length1 = 8;
					JOptionPane.showMessageDialog(null,"Player 1: your word was "+ length1+ " letters long.");
				}
				else if(playerWord1.equalsIgnoreCase("transient")|| playerWord1.equalsIgnoreCase("protected")|| playerWord1.equalsIgnoreCase("interface")){
					length1 = 9;
					JOptionPane.showMessageDialog(null,"Player 1: your word was "+ length1+ " letters long !!.");
				}
				else{
					JOptionPane.showMessageDialog(null,"Player 1 : you entered an invalid word");
				}

				//player 2

				if(playerWord2.equalsIgnoreCase("if")|| playerWord2.equalsIgnoreCase("do")){
					length2 = 2;
					JOptionPane.showMessageDialog(null,"Player 2: your word was "+ length2+ " letters long.");
				}
				else if(playerWord2.equalsIgnoreCase("try")|| playerWord2.equalsIgnoreCase("new")|| playerWord2.equalsIgnoreCase("int")|| playerWord2.equalsIgnoreCase("for")){
					length2 = 3;
					JOptionPane.showMessageDialog(null,"Player 2: your word was "+ length2+ " letters long.");
				}
				else if(playerWord2.equalsIgnoreCase("this")|| playerWord2.equalsIgnoreCase("void")|| playerWord2.equalsIgnoreCase("long")|| playerWord2.equalsIgnoreCase("enum")|| playerWord2.equalsIgnoreCase("byte")|| playerWord2.equalsIgnoreCase("case")|| playerWord2.equalsIgnoreCase("char")|| playerWord2.equalsIgnoreCase("else")){
					length2 = 4;
					JOptionPane.showMessageDialog(null,"Player 2: your word was "+ length2+ " letters long.");
				}
				else if(playerWord2.equalsIgnoreCase("short")|| playerWord2.equalsIgnoreCase("super")|| playerWord2.equalsIgnoreCase("throw")|| playerWord2.equalsIgnoreCase("while")|| playerWord2.equalsIgnoreCase("float")|| playerWord2.equalsIgnoreCase("final")|| playerWord2.equalsIgnoreCase("break")|| playerWord2.equalsIgnoreCase("class")){
					length2 = 5;
					JOptionPane.showMessageDialog(null,"Player 2: your word was "+ length2+ " letters long.");
				}
				else if(playerWord2.equalsIgnoreCase("public")|| playerWord2.equalsIgnoreCase("return")|| playerWord2.equalsIgnoreCase("static")|| playerWord2.equalsIgnoreCase("switch")|| playerWord2.equalsIgnoreCase("throws")|| playerWord2.equalsIgnoreCase("native")|| playerWord2.equalsIgnoreCase("double")|| playerWord2.equalsIgnoreCase("import")){
					length2 = 6;
					JOptionPane.showMessageDialog(null,"Player 2: your word was "+ length2+ " letters long.");
				}
				else if(playerWord2.equalsIgnoreCase("private")|| playerWord2.equalsIgnoreCase("package")|| playerWord2.equalsIgnoreCase("finally")|| playerWord2.equalsIgnoreCase("extends")|| playerWord2.equalsIgnoreCase("boolean")|| playerWord2.equalsIgnoreCase("default")|| playerWord2.equalsIgnoreCase("package")){
					length2 = 7;
					JOptionPane.showMessageDialog(null,"Player 2: your word was "+ length2+ " letters long.");
				}
				else if(playerWord2.equalsIgnoreCase("strictfp")|| playerWord2.equalsIgnoreCase("volatile")|| playerWord2.equalsIgnoreCase("abstract")|| playerWord2.equalsIgnoreCase("continue")){
					length2 = 8;
					JOptionPane.showMessageDialog(null,"Player 2: your word was "+ length2+ " letters long.");
				}
				else if(playerWord2.equalsIgnoreCase("transient")|| playerWord2.equalsIgnoreCase("protected")|| playerWord2.equalsIgnoreCase("interface")){
					length2 = 9;
					JOptionPane.showMessageDialog(null,"Player 2: your word was "+ length2+ " letters long !!.");
				}
				else{
					JOptionPane.showMessageDialog(null,"Player 2 : you entered an invalid word");
				}


				if(length1 > length2){
					JOptionPane.showMessageDialog(null,"Player 1 had a longer word & wins a point");
					points1 = points1 + 1;
				}
				else if(length2 > length1){
					JOptionPane.showMessageDialog(null,"Player 2 had a longer word & wins a point");
					points2 = points2 + 1;
				}
				else{
					JOptionPane.showMessageDialog(null,"both lengths of word were equal therefore both players get a point");
					points1 = points1 + 1 ;
					points2 = points2 + 1;
				}


				JOptionPane.showMessageDialog(null,"player 1 has "+points1+" point(s) and player 2 has "+points2+" point(s)");


				if(points1 > points2){
					JOptionPane.showMessageDialog(null,"Player 1 wins this round");
				}
				else if(points2 > points1){
					JOptionPane.showMessageDialog(null,"Player 2 wins this round");
				}
				else{
					JOptionPane.showMessageDialog(null,"The round is a draw");
				}
			}

			JOptionPane.showMessageDialog(null,"Player 1 total: "+points1);
			JOptionPane.showMessageDialog(null,"Player 2 total: "+points2);

			if(points1 > points2){
				JOptionPane.showMessageDialog(null,"Player 1 is the winner");
			}
			else if(points2 > points1){
				JOptionPane.showMessageDialog(null,"Player 2 is the winner");
			}
			else{
				JOptionPane.showMessageDialog(null,"The game is a draw");
			}


			playAgain = JOptionPane.showInputDialog(null,"Would you like to play again ?  (yes or no)");
			if(playAgain.equalsIgnoreCase("yes")){
				playAgainSwitch = true;
			}
			else if(playAgain.equalsIgnoreCase("no")){
				playAgainSwitch = false;
				JOptionPane.showMessageDialog(null,"Thanks for playing");
			}
	}
}

