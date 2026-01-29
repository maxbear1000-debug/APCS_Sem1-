import java.util.*;

class SmashUltimateMatchupLogic {
    // first i made the methd to assin all the ssbu characters to the array
    public static String[] getAllCharacters() {
        return new String[
            "Mario","Donkey Kong","Link","Samus","Dark Samus","Yoshi","Kirby","Fox","Pikachu",
            "Luigi","Ness","Captain Falcon","Jigglypuff","Peach","Daisy","Bowser","Ice Climbers",
            "Sheik","Zelda","Dr. Mario","Pichu","Falco","Marth","Lucina","Young Link",
            "Ganondorf","Mewtwo","Roy","Chrom","Mr. Game & Watch","Meta Knight","Pit","Dark Pit",
            "Zero Suit Samus","Wario","Snake","Ike","Pokémon Trainer","Diddy Kong","Lucas",
            "Sonic","King Dedede","Olimar","Lucario","R.O.B.","Toon Link","Wolf","Villager",
            "Mega Man","Wii Fit Trainer","Rosalina & Luma","Little Mac","Greninja","Mii Brawler",
            "Mii Swordfighter","Mii Gunner","Palutena","Pac-Man","Robin","Shulk","Bowser Jr.",
            "Duck Hunt","Ryu","Ken","Cloud","Corrin","Bayonetta","Inkling","Ridley","Simon",
            "Richter","King K. Rool","Isabelle","Incineroar","Piranha Plant","Joker","Hero",
            "Banjo & Kazooie","Terry","Byleth","Min Min","Steve","Sephiroth","Pyra","Mythra",
            "Kazuya","Sora"
        ];
    }

    // telsl you waht tipe of character each guy is ssbu is ... 
    public static String[] getTypes() {
        return new String[
            "Brawler","Heavy","Sword","Zoner","Zoner","Brawler","Brawler","Fast","Fast",
            "Brawler","Zoner","Fast","Brawler","Brawler","Brawler","Heavy","Brawler",
            "Fast","Zoner","Brawler","Fast","Fast","Sword","Sword","Sword",
            "Heavy","Zoner","Sword","Sword","Brawler","Fast","Fast","Fast",
            "Fast","Brawler","Zoner","Sword","Brawler","Fast","Zoner",
            "Fast","Heavy","Zoner","Brawler","Zoner","Sword","Fast","Zoner",
            "Zoner","Brawler","Zoner","Heavy","Fast","Brawler",
            "Sword","Zoner","Zoner","Zoner","Zoner","Sword","Brawler",
            "Zoner","Brawler","Fast","Fast","Sword","Sword","Zoner","Zoner","Heavy","Zoner",
            "Heavy","Zoner","Heavy","Brawler","Zoner","Zoner","Zoner","Sword","Sword",
            "Brawler","Zoner","Fast","Sword"
        ];
    }

    public static boolean contains(String[] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
    
    

    public static void printCharacters(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("%-20s", arr[i]);
            if ((i + 1) % 4 == 0){ 
                System.out.println();
            }
        }
    }


    public static String getTypeOf(String[] chars, String[] types, String name) {
        for (int i = 0; i < chars.length; i++)
            if (chars[i].equalsIgnoreCase(name)){
                return types[i];
            }
        return "IDK BRUV";
    }


    // this satys why one character will win agaisnt the other character
    public static int determineWinner(String p, String c) {

        if (p.equals(c)){
            return 0; 
        } // this is a tie !!!


        // Sthe sword charcters beet the heavy characcters so they get +1 
        if (p.equals("Sword") && c.equals("Heavy")){
            return 1;
        }
        if (p.equals("Heavy") && c.equals("Sword")){
            return - 1; 
        }  




        // Hheavy beats fast
        if (p.equals("Heavy") && c.equals("Fast")){ 
            return 1;
        }
        if (p.equals("Fast") && c.equals("Heavy")) {
            return -1;
        }
        
        
        
        
        
        
        // Fthe fast guys beat the zoners
        if (p.equals("Fast") && c.equals("Zoner")){
            return 1;
        }
        if (p.equals("Zoner") && c.equals("Fast")){ 
            return -1;
        }
        
        
        
        
        //the zoners beeat the heavyes
        if (p.equals("Zoner") && c.equals("Heavy")){
            return 1;
        }
        if (p.equals("Heavy") && c.equals("Zoner")){
            return -1;
        }


        // the braweler beat the sword
        if (p.equals("Brawler") && c.equals("Sword")){ 
            return 1;
        }
        if (p.equals("Sword") && c.equals("Brawler")){ 
            return -1;
        }


        // Bthe brawlers lose to the sword characters
        if (p.equals("Brawler") && c.equals("Zoner")){ 
            return -1;
        }
        if (p.equals("Zoner") && c.equals("Brawler")){ 
            return 1;
        }

        // if it is a tie thatit will not return a number... just zero
        return 0;
    }
        
        
        
        
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            String[] characters = getAllCharacters();
            String[] types = getTypes();
    
            System.out.println("The super ultimate super cool SUper SMash bros MAthup BY ... Max Perez");
            System.out.println("-------------------------------------------");
            printCharacters(characters);
    
            System.out.print("Enter your chracter and make sure you spell correctly and capatlize ");
            String player = sc.nextLine();
    
            if (!contains(characters, player)) {
                System.out.println("This cahracter is not real.... try again please:   ");
                return;
            }
    
            System.out.print("enter the other opponents charcter: ");
            String cpu = sc.nextLine();
    
            if (!contains(characters, cpu)) {
                System.out.println("Hmmm. that isnt a character ..... try again");
                return;
            }
    
            String playerType = getTypeOf(characters, types, player);
            String cpuType = getTypeOf(characters, types, cpu);
    
            System.out.println("\nYou chose: " + player + " (" + playerType + ")");
            System.out.println("CPU chose: " + cpu + " (" + cpuType + ")");
    
            int result = determineWinner(playerType, cpuType);
    
            if (result == 1){
                System.out.println("Good job you win !!!");
            }
            
            
            else if (result == -1){
                System.out.println("You lost 🤣");
            }
            
            else{
                System.out.println("Its a darn tie ..... broing ");
            }
        }
    }
}