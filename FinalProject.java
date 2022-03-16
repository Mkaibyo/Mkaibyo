//Sarah August 4th 2021, Final Project (or warriors game)

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
import java.lang.*;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FinalProject{
        
 static ArrayList<String> list = new ArrayList<>();
 static ArrayList<String> Slist = new ArrayList<>();
 static ArrayList<String> Elist = new ArrayList<>();
 static ArrayList<String> Alist = new ArrayList<>();
 static ArrayList<String> Ilist = new ArrayList<>();
 static ArrayList<String> Llist = new ArrayList<>();
 static ArrayList<String> Clist = new ArrayList<>();
 static ArrayList<String> prefixes = new ArrayList<String>();
 //variables outside 
 
   public static void main(String[] args) throws IOException {
      
       //variables
       String welcomeChoice = "";
       boolean done = false;
       boolean finished = false;
       boolean loadIn = false;
       String back = "";
       String fileName= "";
       String characterChoice = "";
       String skillChoice= "";
       String clanChoice = "";
       int num = 0; 
       String clan= "";
       
            String genderChoice = "";
            String gender = "";
            String sizeChoice = "";
            String size = "";
            String color = "";
            boolean ranColor = false;
            boolean ranName = false;
            boolean displaynames= false;
            String lengthChoice= "";
            String length = "";
            String furChoice= "";
            String fur = "";
            String pronoun = "";
            String eyes = "";
            String phrase = size + ", "+ color +" "+ gender + " with "+ eyes + " colored eyes. " + pronoun + " fur is "+ length + " and "+ fur +"."; 
            int prefix = 0;
            String error = "";
            String name = ""; 
            int strength = 0;
             int endurance = 0;
             int intelligence =0;
             int agility =0;
             int charisma =0;
             int luck =0;

 //welcome menu
 do{
       System.out.println("\nWelcome to Warrior Cats, the Game!");
        System.out.println("\n********************************");
       System.out.println("            New Game              ");
       System.out.println("            Load Game              ");
       System.out.println("              Exit                 ");
        System.out.println("********************************");
       
       Scanner in = new Scanner(System.in);
       Scanner sc = new Scanner(System.in);
       welcomeChoice=SafeInput.getRegExString(in, "Enter your menu choic (N, L , or E) ", "[NnLlEe]");
       welcomeChoice= welcomeChoice.toUpperCase();
      
   switch(welcomeChoice)
    {
        case "N":
           
            
           //New game code (intro)
           System.out.println("\nWelcome to the Forest young kit!");
           
              
             
           //Display Character stats
           
            do{
             while(characterChoice != "Y") {   
                System.out.println("********************************");
                System.out.println("         Character Info         ");
                 System.out.println("Name = " + name);
                System.out.println("Clan = " + clan);
                System.out.println("Appearance = ");
                displayList();
               
                System.out.println("\nPerk Points = ");
                System.out.println("Strength =" + strength);
                System.out.println("Endurance = " + endurance);
                System.out.println("Intelligence = "+ intelligence);
                System.out.println("Agility = " + agility);
                System.out.println("Charisma = "+ charisma);
                System.out.println("Luck = "+ luck);     
                
                System.out.println("********************************");
           //characterMenu  
                System.out.println("\n********************************");
                System.out.println("***           menu           ***");
                System.out.println("********************************");
            System.out.println("-Clan-     -Appearance-     -Name-     -PerkPoints-");
            characterChoice=SafeInput.getRegExString(in, "\nEnter your menu choice (C, A, N, P) ", "[CcAaNnPp]");
            characterChoice= characterChoice.toUpperCase();
            
            
                        switch (characterChoice)
                        {
                            
                                    case "C":
                        
                                        System.out.println("\nWhat clan will you join?");
                                        //thunderclans discription
                                        System.out.println("\nThunderClan: Fierce and Brave");
                                        System.out.println("ThunderClan cats are very brave yet also peaceful. They do their best to avoid battles.");
                                        System.out.println("ThunderClan cats see Kittypets as an oppurtunity, not a weakness. Therefore, many ThunderClan");
                                        System.out.println("cats have Kittypet blood. They live in the forest.");
                                        //Riverclan Discription
                                        System.out.println("\nRiverClan: Clever and Strong");
                                        System.out.println("RiverClan are the only clan that is at ease in the water. They hunt for fish and live on the river");
                                        System.out.println("bank. They mainly stay out of battles, in less, of course, it involves other cats going in the river.");
                                        System.out.println("Sometimes they act a bit lazy, but mostly they just live life to the fullest.");
                                        //Shadowclan desc
                                        System.out.println("\nShadowClan : Willy and Proud");
                                        System.out.println("ShadowClan is the most aggressive and battle-hungry clan. They look for fights and are never");
                                        System.out.println("trusted by the other clans. If a battle occurs between other clans, ShadowClan joins in. They");
                                        System.out.println("reside in the dark pine forest.");
                                        //WindClan desc
                                        System.out.println("\nWindclan: Swift and Loyal");
                                        System.out.println("WindClan has fast runners and loyal cats. Very, very few have ever proved disloyal to WindClan or");
                                        System.out.println("the warrior code in general. They live out in the open, on the moore. The can be sensitive and");
                                        System.out.println("touchy though, so don't steal their prey.");

                                        clanChoice=SafeInput.getRegExString(in, "\nEnter the Clan you would like to join (T, R, S, W, or type A for a random choice) ", "[TtRrSsWwAa]");
                                        clanChoice= clanChoice.toUpperCase();
                                            if (clanChoice.equalsIgnoreCase("A")) {
                                                Random generator = new Random();
                                                num = generator.nextInt(4) + 1; 
                                                if (num == 1) {
                                                    clanChoice = "T";
                                                }
                                                if (num == 2) {
                                                    clanChoice = "R";
                                                }
                                                if (num == 3) {
                                                    clanChoice = "S";   
                                                }
                                                if (num == 4) {
                                                    clanChoice = "W";    
                                                }
                                            }
                                                if (clanChoice.equalsIgnoreCase("T")) {
                                                    clan = "ThunderClan";
                                                }
                                                if (clanChoice.equalsIgnoreCase("R")) {
                                                    clan = "RiverClan";
                                                }
                                                if (clanChoice.equalsIgnoreCase("W")) {
                                                    clan = "WindClan";
                                                }
                                                if (clanChoice.equalsIgnoreCase("S")) {
                                                    clan = "ShadowClan";
                                                }
                                        break;


                                        
                                    case "A":
                                        //Apperance
                                                System.out.println("What do you look like?");

                                        //Gender
                                                System.out.println("\nGENDER: ");
                                                genderChoice=SafeInput.getRegExString(in, "Are you a Tomcat or a Shecat? (T, S , or R for random) ", "[TtSsRr]");
                                        genderChoice= genderChoice.toUpperCase();
                                            if (genderChoice.equalsIgnoreCase("T")){
                                                gender = "tom";
                                            }
                                            if (genderChoice.equalsIgnoreCase("S")) {
                                                gender = "she-cat";
                                            }
                                            if (genderChoice.equalsIgnoreCase("R")) {
                                                Random generator = new Random();
                                                num = generator.nextInt(2) + 1; 
                                                if (num == 1) {
                                                    genderChoice = "T";
                                                }
                                                if (num == 2) {
                                                    genderChoice = "S";
                                                }
                                            }
                                            if (genderChoice.equalsIgnoreCase("T")) {
                                                    gender = "tom";
                                                }
                                                if (genderChoice.equalsIgnoreCase("S")) {
                                                    gender = "she-cat";
                                                }
                                                list.add(gender);
                                        //Size
                                            System.out.println("\nSIZE: ");
                                            System.out.println("Very Small - V,   Small - S,   Medium - M,   Large - L,   Very Large - W,    Random - R");
                                               sizeChoice=SafeInput.getRegExString(in, "What size are you? (V,S,M,L,W,R) ", "[VvSsMmLlWwRr]");
                                        sizeChoice= sizeChoice.toUpperCase();
                                            if (sizeChoice.equalsIgnoreCase("V")){
                                                size = "very small";
                                            }
                                            if (sizeChoice.equalsIgnoreCase("S")) {
                                                size = "small";
                                            } 
                                            if (sizeChoice.equalsIgnoreCase("M")){
                                                size = "medium sized";
                                            }
                                            if (sizeChoice.equalsIgnoreCase("L")) {
                                                size = "large";
                                            } 
                                             if (sizeChoice.equalsIgnoreCase("W")) {
                                                size = "very large";
                                            } 
                                             if (sizeChoice.equalsIgnoreCase("R")) {
                                                Random generator = new Random();
                                                num = generator.nextInt(5) + 1; 
                                                if (num == 1) {
                                                    sizeChoice = "V";
                                                }
                                                if (num == 2) {
                                                    sizeChoice = "S";
                                                }
                                                if (num == 3) {
                                                    sizeChoice = "M";   
                                                }
                                                if (num == 4) {
                                                    sizeChoice = "L";    
                                                }
                                                if (num == 5) {
                                                    sizeChoice = "W";
                                                }
                                            }
                                                if (sizeChoice.equalsIgnoreCase("V")) {
                                                    size = "very small";
                                                }
                                                if (sizeChoice.equalsIgnoreCase("S")) {
                                                    size = "small";
                                                }
                                                if (sizeChoice.equalsIgnoreCase("M")) {
                                                    size = "medium sized";
                                                }
                                                if (sizeChoice.equalsIgnoreCase("L")) {
                                                    size = "large";
                                                }
                                                if (sizeChoice.equalsIgnoreCase("W")) {
                                                    size = "extremely large";
                                                }
                                                list.add(size);
                                        //color
                                             System.out.println("\nCOLOR: ");
                                             ranColor = SafeInput.getYNConfirm(in, "Do you want your pelt color to be randomly generated? (y/n)"); 
                                            if (ranColor == true) {
                                             Random generator = new Random();
                                                num = generator.nextInt(12) + 1; 
                                                if (num == 1) {
                                                    color = "white fur";
                                                }
                                                if (num == 2) {
                                                    color = "black fur";
                                                }
                                                if (num == 3) {
                                                    color = "tabby fur";   
                                                }
                                                if (num == 4) {
                                                    color = "calico fur";    
                                                }
                                                if (num == 5) {
                                                    color = "grey fur";
                                                }
                                                if (num == 6) {
                                                    color = "blue silver fur";
                                                }
                                                if (num == 7) {
                                                    color = "silver fur";
                                                }
                                                if (num == 8) {
                                                    color = "tortoiseshell fur";   
                                                }
                                                if (num == 9) {
                                                    color = "brown and golden fur";    
                                                }
                                                if (num == 10) {
                                                    color = "fawn colored fur";
                                                }
                                                if (num == 11) {
                                                    color = "sandy fur";
                                                }
                                                if (num == 12) {
                                                    color = "dark grey fur";
                                                }
                                            }else{
                                            color = SafeInput.getNonZeroLenString(in, "Type what color your pelt is"); 
                                            color = color + " fur";
                                            }
                                            list.add(color);
                                        //length of fur
                                            System.out.println("\nLENGTH OF FUR: ");
                                            System.out.println("Very Short - V,   Short - S,   Medium - M,   Long - L,   Extremely Long - W,    Random - R");
                                               lengthChoice=SafeInput.getRegExString(in, "What is the length of your fur? (V,S,M,L,W,R) ", "[VvSsMmLlWwRr]");
                                        lengthChoice= lengthChoice.toUpperCase();
                                            if (lengthChoice.equalsIgnoreCase("V")){
                                                length = "very short fur";
                                            }
                                            if (lengthChoice.equalsIgnoreCase("S")) {
                                                length = "short fur";
                                            } 
                                            if (lengthChoice.equalsIgnoreCase("M")){
                                                length = "medium fur";
                                            }
                                            if (lengthChoice.equalsIgnoreCase("L")) {
                                                length = "long fur";
                                            } 
                                             if (lengthChoice.equalsIgnoreCase("W")) {
                                                length = "extremely long fur";
                                            }     
                                             if (lengthChoice.equalsIgnoreCase("R")) {
                                                Random generator = new Random();
                                                num = generator.nextInt(5) + 1; 
                                                if (num == 1) {
                                                    lengthChoice = "V";
                                                }
                                                if (num == 2) {
                                                    lengthChoice = "S";
                                                }
                                                if (num == 3) {
                                                    lengthChoice = "M";   
                                                }
                                                if (num == 4) {
                                                    lengthChoice = "L";    
                                                }
                                                if (num == 5) {
                                                    lengthChoice = "W";
                                                }
                                            }
                                                if (lengthChoice.equalsIgnoreCase("V")) {
                                                    length = "very short fur";
                                                }
                                                if (lengthChoice.equalsIgnoreCase("S")) {
                                                    length = "short fur";
                                                }
                                                if (lengthChoice.equalsIgnoreCase("M")) {
                                                    length = "medium fur";
                                                }
                                                if (lengthChoice.equalsIgnoreCase("L")) {
                                                    length = "long fur";
                                                }
                                                if (lengthChoice.equalsIgnoreCase("W")) {
                                                    length = "extremely long fur";
                                                }
                                                list.add(length);
                                        //texture of fur
                                            System.out.println("\nTEXTURE OF FUR: ");
                                            System.out.println("Sleek - S,   Feathery - F,   Tangled - T,   Matted - M,     Lush - L,     Wiry - W,    Random - R  ");
                                               furChoice=SafeInput.getRegExString(in, "What is the Texture your fur? (S,F,T,M,L,W,R) ", "[SsFfTtMmLlWwRr]");
                                        furChoice= furChoice.toUpperCase();
                                            if (furChoice.equalsIgnoreCase("S")) {
                                                fur = "sleek fur";
                                            } 
                                            if (furChoice.equalsIgnoreCase("F")){
                                                fur = "feathery fur";
                                            }
                                            if (furChoice.equalsIgnoreCase("T")) {
                                                fur = "tangled fur";
                                            } 
                                             if (furChoice.equalsIgnoreCase("M")) {
                                                fur = "matted fur";
                                            }        
                                             if (furChoice.equalsIgnoreCase("L")) {
                                                fur = "lush fur";
                                            } 
                                             if (furChoice.equalsIgnoreCase("W")) {
                                                fur = "wiry fur";
                                            }        
                                             if (furChoice.equalsIgnoreCase("R")) {
                                                Random generator = new Random();
                                                num = generator.nextInt(6) + 1; 
                                                }
                                                if (num == 1) {
                                                    furChoice = "S";
                                                }
                                                if (num == 2) {
                                                    furChoice = "F";   
                                                }
                                                if (num == 3) {
                                                    furChoice = "T";    
                                                }
                                                if (num == 4) {
                                                    furChoice = "M";
                                                }
                                                if (num == 5) {
                                                    furChoice = "L";   
                                                }
                                                if (num == 6) {
                                                    furChoice = "W";    
                                                }
                                            
                                                if (furChoice.equalsIgnoreCase("S")) {
                                                    fur = "sleek fur";
                                                }
                                                if (furChoice.equalsIgnoreCase("F")) {
                                                    fur = "feathery fur";
                                                }
                                                if (furChoice.equalsIgnoreCase("T")) {
                                                    fur = "tangled fur";
                                                }
                                                if (furChoice.equalsIgnoreCase("M")) {
                                                    fur = "matted fur";
                                                }
                                                if (furChoice.equalsIgnoreCase("L")) {
                                                    fur = "lush fur";
                                                }
                                                if (furChoice.equalsIgnoreCase("W")) {
                                                    fur = "wiry fur";
                                                }
                                                list.add(fur);
                                        //color of eyes
                                             System.out.println("\nCOLOR OF EYES: ");
                                             ranColor = SafeInput.getYNConfirm(in, "Do you want your eye color to be randomly generated? (y/n)"); 
                                            if (ranColor == true) {
                                             Random generator = new Random();
                                                num = generator.nextInt(10) + 1; 
                                                if (num == 1) {
                                                    eyes = "light blue eyes";
                                                }
                                                if (num == 2) {
                                                    eyes = "blue eyes";
                                                }
                                                if (num == 3) {
                                                    eyes = "hazel eyes";   
                                                }
                                                if (num == 4) {
                                                    eyes = "green eyes";    
                                                }
                                                if (num == 5) {
                                                    eyes = "amber eyes";
                                                }
                                                if (num == 6) {
                                                    eyes = "black eyes";
                                                }
                                                if (num == 7) {
                                                    eyes = "dark brown eyes";
                                                }
                                                if (num == 8) {
                                                    eyes = "light brown eyes";   
                                                }
                                                if (num == 9) {
                                                    eyes = "dark amber eyes";    
                                                }
                                                if (num == 10) {
                                                    eyes = "grey eyes";
                                                }
                                            }else{
                                            eyes = SafeInput.getNonZeroLenString(in, "Type what color your eyes are");
                                            eyes = eyes + " eyes";
                                            }
                                            list.add(eyes);
                                        break;

                                        
                                        
                                    case "P":
                                        
                                                         do{
                                                            System.out.println("********************************");
                                                            System.out.println("         PERK POINTS         ");
                                                            System.out.println("Strength =" + strength);
                                                            System.out.println("Endurance = " + endurance);
                                                            System.out.println("Intelligence = "+ intelligence);
                                                            System.out.println("Agility = " + agility);
                                                            System.out.println("Charisma = "+ charisma);
                                                             System.out.println("Luck = "+ luck);
                                                            System.out.println("********************************");
                                                       //SkillMenu  
                                                            System.out.println("\n********************************");
                                                            System.out.println("***        Perk Menu         ***");
                                                            System.out.println("********************************");
                                                        System.out.println("-INFO (I)-     -ADD POINTS (A)-     -FINISH/SAVE (F)-");
                                                        skillChoice=SafeInput.getRegExString(in, "\nEnter your menu choice (I, A, F) ", "[IiAaFf]");
                                                        skillChoice= skillChoice.toUpperCase();
                                                           
                                                             switch (skillChoice) {
                                                                 
                                                                                    case "I":
                                                        
                                                                                         System.out.println("\nINFO: PERK POINTS");

                                                                                         System.out.println("\nPerk Points can only be given at the start of character creation.");
                                                                                         System.out.println("They can not be changed once starting the game. These points are used to ");
                                                                                         System.out.println("to simulate characters being gifted with different traits at birth.");
                                                                                         System.out.println("\nEach point will equal 5% increase in the respected category.");
                                                                                         System.out.println("You will only have 6 skill points available to use.");

                                                                                         System.out.println("\nINFO: CATERGORIES");

                                                                                         System.out.println("\nStrength : Strength determines your physical power.");
                                                                                         System.out.println("Increasing this stat will allow you to carry more stuff,and increases damage done in combat");

                                                                                         System.out.println("\nEndurance : Endurance impacts your health and stamina.");
                                                                                         System.out.println("Increasing this stat will give you a larger health pool, more stamina, and give you slight resistances to diseases.");

                                                                                         System.out.println("\nIntelligence : Intelligence has a wide impact range ");
                                                                                         System.out.println("Increasing this stat will allow you to gain more experience and learn skills faster");

                                                                                         System.out.println("\nAgility : Agility impacts your speed and movement ability");
                                                                                         System.out.println("Increasing this stat will increase your movement speed, ability, and bonuses to sneaking");

                                                                                         System.out.println("\nCharisma : Charisma expands your options in conversations");
                                                                                         System.out.println("Increasing this stat will allow you to gain better relationships with characters, ");
                                                                                         System.out.println("more conversational options, as well as better chancing when persuading");

                                                                                         System.out.println("\nLuck : Luck increases the frequency of certain events");
                                                                                         System.out.println("Increasing this skill will give you an increased chance at finding rare items");
                                                                                       System.out.println("as well as increased chances for critical hits");

                                                                                         break;
                                                             


                                                                                         
                                                                                    case "A":

                                                                                         int N= 6;

                                                                                         System.out.println("\nEach Point equals to 5% in the respected catergory");
                                                                                         System.out.println("Amount of points able to be used : "+ N);
                                                                                         strength =SafeInput.getRangedInt(in, "\nEnter how many points you want to put towards Strength", 0, N);
                                                                                         if (strength > N) {
                                                                                             strength = N;
                                                                                         }

                                                                                         N = N - strength;
                                                                                         System.out.println("\nAmount of points able to be used : "+ N);
                                                                                         endurance =SafeInput.getRangedInt(in, "Enter how many points you want to put towards Endurance", 0, N);
                                                                                         if (endurance > N) {
                                                                                             endurance = N;
                                                                                         }

                                                                                         N = N - endurance;
                                                                                         System.out.println("\nAmount of points able to be used : "+ N);
                                                                                         intelligence =SafeInput.getRangedInt(in, "Enter how many points you want to put towards Intelligence", 0, N);
                                                                                         if (intelligence > N) {
                                                                                             intelligence = N;
                                                                                         }

                                                                                         N = N - intelligence;
                                                                                         System.out.println("\nAmount of points able to be used : "+ N);
                                                                                         agility =SafeInput.getRangedInt(in, "Enter how many points you want to put towards Agility", 0, N);
                                                                                         if (agility > N) {
                                                                                             agility = N;
                                                                                         }

                                                                                         N = N - agility;
                                                                                         System.out.println("\nAmount of points able to be used : "+ N);
                                                                                         charisma =SafeInput.getRangedInt(in, "Enter how many points you want to put towards Charisma", 0, N);
                                                                                         if (charisma > N) {
                                                                                             charisma = N;
                                                                                         }

                                                                                         N = N - charisma;
                                                                                         System.out.println("\nAmount of points able to be used : "+ N);
                                                                                         luck =SafeInput.getRangedInt(in, "Enter how many points you want to put towards Luck", 0, N);
                                                                                         if (luck > N) {
                                                                                             luck = N;
                                                                                         }

                                                                                         N = N - luck;
                                                                                         break;
                                                                                         
                                                                                         
                                                                                         
                                                                                    case "F":
                                                                                       finished= SafeInput.getYNConfirm(in, "\nAre you sure you are finished/Want to save? (y/n)");
                                                                                        if (finished == true) {

                                                                                        fileName = SafeInput.getNonZeroLenString(in, "Enter File Name");

                                                                                       try {
                                                                                           FileWriter fw = new FileWriter (fileName);
                                                                                           Writer output = new BufferedWriter (fw);
                                                                                           output.write(name);
                                                                                           output.write("\n"+clan+ "\n");
                                                                                           int sz = list.size();
                                                                                           for (int i = 0; i < sz; i++) {
                                                                                               output.write(list.get(i).toString() + "\n");
                                                                                           }
                                                                                           output.write("Strength " + strength + "\n");
                                                                                            output.write("Endurance " + endurance +"\n");
                                                                                             output.write("Agility " + agility+"\n");
                                                                                              output.write("Intelligence " + intelligence+"\n");
                                                                                               output.write("Charisma " + charisma+"\n");
                                                                                                output.write("Luck " + luck+"\n");
                                                                                           output.close();
                                                                                       } catch (Exception e) {
                                                                                           System.out.println("missing information, I cannot create that file");
                                                                                       }     


                                                                                        System.out.println("\nCharacter saved successfully to disk.");

                                                                                            System.out.println("\nYour journey will now begin");
                                                                                            System.exit(0);
                                                                                        }else {
                                                                                        }
                                                                                    break;

                                                                                     }
                                                                                  } while (!done); 
                                                                                
                        
                                                         
                                                         
                                    case "N":
                                        System.out.println("\n****************************");
                                    System.out.println("NAME SELECTION: ");
                                    //prefix array list
                                    prefixes.add("Acorn");
                                    prefixes.add("Adder");
                                    prefixes.add("Alder");
                                    prefixes.add("Apple");
                                    prefixes.add("Ash");
                                    prefixes.add("Aspen");
                                    prefixes.add("Autumn");
                                    prefixes.add("Badger");
                                    prefixes.add("Birch");
                                    prefixes.add("Bird");
                                    prefixes.add("Blizzard");
                                    prefixes.add("Blossom");
                                    prefixes.add("Bramble");
                                    prefixes.add("Brave");
                                    prefixes.add("Breeze");
                                    prefixes.add("Briar");
                                    prefixes.add("Bright");
                                    prefixes.add("Cedar");
                                    prefixes.add("Cherry");
                                    prefixes.add("Cinder");
                                    prefixes.add("Claw");
                                    prefixes.add("Cloud");
                                    prefixes.add("Copper");
                                    prefixes.add("Cricket");
                                    prefixes.add("Crooked");
                                    prefixes.add("Crow");
                                    prefixes.add("Cypress");
                                    prefixes.add("Daisy");
                                    prefixes.add("Dandelion");
                                    prefixes.add("Dapple");
                                    prefixes.add("Dark");
                                    prefixes.add("Dawn");
                                    prefixes.add("Dead");
                                    prefixes.add("Dew");
                                    prefixes.add("Doe");
                                    prefixes.add("Dove");
                                    prefixes.add("Drizzle");
                                    prefixes.add("Eagle");
                                    prefixes.add("Echo");
                                    prefixes.add("Fawn");
                                    prefixes.add("Feather");
                                    prefixes.add("Fern");
                                    prefixes.add("Finch");
                                    prefixes.add("Fire");
                                    prefixes.add("Flash");
                                    prefixes.add("Fox");
                                    prefixes.add("Frost");
                                    prefixes.add("Fuzzy");
                                    prefixes.add("Golden");
                                    prefixes.add("Hare");
                                    prefixes.add("Hawk");
                                    prefixes.add("Hazel");
                                    prefixes.add("Heather");
                                    prefixes.add("Holly");
                                    prefixes.add("Hope");
                                    prefixes.add("Ivy");
                                    prefixes.add("Juniper");
                                    prefixes.add("Lark");
                                    prefixes.add("Leaf");
                                    prefixes.add("Leopard");
                                    prefixes.add("Lightning");
                                    prefixes.add("Lily");
                                    prefixes.add("Lion");
                                    prefixes.add("Maple");
                                    prefixes.add("Meadow");
                                    prefixes.add("Mint");
                                    prefixes.add("Mist");
                                    prefixes.add("Misty");
                                    prefixes.add("Moon");
                                    prefixes.add("Moss");
                                    prefixes.add("Needle");
                                    prefixes.add("Night");
                                    prefixes.add("Oak");
                                    prefixes.add("Otter");
                                    prefixes.add("Owl");
                                    prefixes.add("Pearl");
                                    prefixes.add("Petal");
                                    prefixes.add("Pine");
                                    prefixes.add("Pollen");
                                    prefixes.add("Poppy");
                                    prefixes.add("Pounce");
                                    prefixes.add("Primrose");
                                    prefixes.add("Rain");
                                    prefixes.add("Raven");
                                    prefixes.add("Ripple");
                                    prefixes.add("Robin");
                                    prefixes.add("Rook");
                                    prefixes.add("Rose");
                                    prefixes.add("Rush");
                                    prefixes.add("Sandy");
                                    prefixes.add("Shimmer");
                                    prefixes.add("Shy");
                                    prefixes.add("Silver");
                                    prefixes.add("Sky");
                                    prefixes.add("Sleek");
                                    prefixes.add("Snail");
                                    prefixes.add("Snake");
                                    prefixes.add("Snow");
                                    prefixes.add("Sparrow");
                                    prefixes.add("Speckle");
                                    prefixes.add("Spider");
                                    prefixes.add("Splash");
                                    prefixes.add("Spotted");
                                    prefixes.add("Squirrel");
                                    prefixes.add("Stone");
                                    prefixes.add("Storm");
                                    prefixes.add("Sun");
                                    prefixes.add("Swallow");
                                    prefixes.add("Swift");
                                    prefixes.add("Talon");
                                    prefixes.add("Thorn");
                                    prefixes.add("Thrush");
                                    prefixes.add("Tiger");
                                    prefixes.add("Tiny");
                                    prefixes.add("Tumble");
                                    prefixes.add("Turtle");
                                    prefixes.add("Twig");
                                    prefixes.add("Vine");
                                    prefixes.add("Violet");
                                    prefixes.add("Vixen");
                                    prefixes.add("Whisker");
                                    prefixes.add("White");
                                    prefixes.add("Wild");
                                    prefixes.add("Willow");
                                    prefixes.add("Wind");
                                    prefixes.add("Wish");
                                    prefixes.add("Wolf");
                                    prefixes.add("Yellow");
                                    //display all prefixes available 
                                    displaynames= SafeInput.getYNConfirm(in, "\nWould you like to see name suggestions? (y/n)");
                                            if (displaynames == true) {
                                    displayPrefixes();
                                            }
                                            
                                    // Choose a name
                                    
                                    ranName = SafeInput.getYNConfirm(in, "Do you want your name to be randomly generated? (y/n)"); 
                                            if (ranName == true) {
                                    String random = prefixes.get(new Random().nextInt(prefixes.size())); 
                                    name = random + " kit";
                                            } else {
                                        name = SafeInput.getNonZeroLenString(in, "Type the prefix you would like to have");
                                        name = name + " kit";
                                             
                                    }
                                            
                                        break;
      
                                    }
             }
            
                            } while (!done);  
            
           
             
    case "L":  
        
        System.out.println("Select a file to go into");
        ArrayList newList = new ArrayList();
        
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = jfc.getSelectedFile();
        System.out.println(selectedFile.getAbsolutePath());
           fileName=selectedFile.getName();
           String s = selectedFile.getAbsolutePath();
           System.out.println(s+"\n");
           
            try
           {
               File file=new File(s); 
               //read the file
               FileReader fr=new FileReader(file); 
               BufferedReader br=new BufferedReader(fr);   
               String line;
               while((line=br.readLine())!=null)
               {
               
               newList.add(line);   
               }
                fr.close();   
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
            int sz= newList.size();
            for (int i = 0; i < sz; i++) {
                System.out.println(newList.get(i).toString());
            }
        }
        loadIn = SafeInput.getYNConfirm(in, "\nWould you like to play this character? (y/n)");
        if (loadIn == true) {
            System.out.println("\nInto the forest you go");
            System.exit(0);
        } 
        if (loadIn == false) {
        break;
        }

   case "E":
   done = SafeInput.getYNConfirm(in, "Are you sure you want to quit? (y/n)"); 
        if (done == true) {
     System.exit(0);
        }else{

   break;
   }
            
   }
 }while (!done);
 }
    private static void displayList()
    {
        
        if(list.size() != 0)
        {
            for (int i = 0; i < list.size(); i++)
            {
              System.out.printf( ", " + list.get(i) ); 
            }
        }
      
    }

private static void displayPrefixes()
    {
        System.out.println("++++++++++++++++++++++++++++++++++\n");
        if(prefixes.size() != 0)
        {
                System.out.print(" [ ");
                for(int i = 0; i< 25; i++) {
                  System.out.print(" " + prefixes.get(i)+ " ");
                }
                System.out.println("]");
                    }
        {
                System.out.print(" [ ");
                for(int i = 25; i< 50; i++) {
                  System.out.print(" " + prefixes.get(i)+ " ");
                }
                System.out.println("]");
                    }
         {
                System.out.print(" [ ");
                for(int i = 50; i< 75; i++) {
                  System.out.print(" " + prefixes.get(i)+ " ");
                }
                System.out.println("]");
                    }
         {
                System.out.print(" [ ");
                for(int i = 75; i< 100; i++) {
                  System.out.print(" " + prefixes.get(i)+ " ");
                }
                System.out.println("]");
                    }
          {
                System.out.print(" [ ");
                for(int i = 100; i< 128; i++) {
                  System.out.print(" " + prefixes.get(i)+ " ");
                }
                System.out.println("]");
                    }
         
           System.out.println("\n++++++++++++++++++++++++++++++++++");
                }

         }
    
   

   
       
      
