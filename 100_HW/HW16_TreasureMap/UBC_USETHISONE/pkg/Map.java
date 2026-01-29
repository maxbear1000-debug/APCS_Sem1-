package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		map = new int[row][column];
		posX = 0;
		posY = 0; 
		generateTreasure(); 
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		treasureX = (int)(Math.random()*map[0].length);
		treasureY = (int)(Math.random()*map.length);
		
		
		
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		Scanner sc = new Scanner(System.in);
		System.out.println("What direction would you like to move in?");
		System.out.println("1 - Up");
		System.out.println("2 - Down");
		System.out.println("3 - Left");
		System.out.println("4 - Right");
		System.out.println("5 - LeftUp");
		System.out.println("6 - RightUp");
		System.out.println("7 - LeftDown");
		System.out.println("8 - RightDown");
		String answer = sc.nextLine();
	    int newX = posX;
		int newY = posY;
	
		if (m == 1) { 
			newY--;
		} else if (m == 2) { 
			newY++;
		} else if (m == 3) { 
			newX--;
		} else if (m == 4) { 
			newX++;
		} else if (m == 5) { 
			newX--;
			newY--;
		} else if (m == 6) { 
			newX++;
			newY--;
		} else if (m == 7) { 
			newX--;
			newY++;
		} else if (m == 8) { 
			newX++;
			newY++;
		} else {
			return false;
		}
	
		return move(newY, newX);
			
			
			
		

		
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		if (row < 0 || row >= map.length || col < 0 || col >= map[0].length) {
				return false;
			}
		
			map[posY][posX] -= 2;
		
			posY = row;
			posX = col;
		
			map[posY][posX] += 2;
		
			return true;




		// Dummy value to make work
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if (map[posY][posX] < 1) {
		map[posY][posX] += 1;

			if (posX == treasureX && posY == treasureY) {
				return true;
			}
		}

		return false;// Dummy value to make work
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		map[treasureY][treasureX] = 7; 
		
		System.out.println("the Treasyre is at the location " +treasureX + ", " + treasureY + "!!!");
		printMap();
		
		
		
		
		
	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		System.out.println("MAPPPPP");
		
		for(int r = 0; r < map.length; r++){
			System.out.println("|");
			for(int c = 0; c < map[0].length; c++){
				System.out.println(map[r][c]+ " ");
			}
			System.out.println("|");
		}
		
		
		
		

	}

}
