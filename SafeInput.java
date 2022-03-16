 import java.util.Scanner; 
import java.util.regex.Pattern;

public class SafeInput
{

// getNonZeroLenString
    public static String getNonZeroLenString(Scanner pipe, String prompt)
{
   String retString = ""; 

        System.out.println(prompt); 
        retString = pipe.nextLine();
        
        while(retString.length()== 0){
            System.out.println("Input is invalid ");
            System.out.println("Please input a valid expression");
            System.out.println(prompt);
            retString = pipe.nextLine();
}
            return retString;
}
//getInt
    public static int getInt (Scanner pipe, String prompt) 
    {
      int retInt; 
      while(true)
   {
       try
       {
           System.out.print(prompt); 
   retInt = Integer.parseInt(pipe.nextLine());
   break;
       }
       catch (Exception e) {
          
       }
   }
   
   return retInt;
}

//getDouble
   public static double getDouble (Scanner pipe, String prompt) 
    { 
        double retDouble;
        while (true)
        {
            try
            {
             System.out.println(prompt);  
             retDouble = Double.parseDouble(pipe.nextLine()); 
             break;
            }
            catch (Exception e) {
        }
        }
            return retDouble;

    }        
    
    
//getRangedint
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
 { 
     boolean done = false;
     String trash = "";
     int retRangedInt = 0;
     do
     {
     
        System.out.println(prompt + "[" + low + "-" + high + "]");
        if (pipe.hasNextInt())
        {
          retRangedInt = pipe.nextInt();
          
        if(retRangedInt >= low || retRangedInt <= high) {
           done = true;
        } else {
            System.out.println("Please enter a value in range" + retRangedInt);
        }
        }else{
            trash = pipe.nextLine();
            System.out.println("You must enter an interger in range: " + trash);
        }   
        if (high <=0) {
            retRangedInt = 0;
            high = -1;
        }
     } while (!done);
        return retRangedInt;
 }
//getRangedDouble
 public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
 { 
       boolean done = false;
     String trash = "";
     double retRangedDouble = 0;
     do
     {
     
        System.out.println(prompt + "[" + low + "-" + high + "]");
        if (pipe.hasNextDouble())
        {
          retRangedDouble = pipe.nextDouble();
        if(retRangedDouble >= low || retRangedDouble <= high) {
           done = true;
        } else {
            System.out.println("Please enter a value in range" + retRangedDouble);
        }
        }else{
            trash = pipe.nextLine();
            System.out.println("You must enter a number in range: " + trash);
        } 
        
     } while (!done);
        return retRangedDouble;
 }

//getYNConfirm
public static boolean getYNConfirm(Scanner pipe, String prompt)
{ 
        System.out.println(prompt);
        String retStringYN = pipe.nextLine();
        while(!retStringYN.equalsIgnoreCase("n") && !retStringYN.equalsIgnoreCase("y")) {
            
            retStringYN = pipe.nextLine();
        }
        if(retStringYN.equalsIgnoreCase("n")) {
            return false;
        } else {
            return true;
        }
            
}
//getRegExstring
public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
{
        String response = "";
        boolean gotAValue = false;
        
        do
        {
            System.out.println(prompt);
            response = pipe.nextLine();
            
            if (response.matches(regExPattern))
            {
                gotAValue = true;
                
                
            }else {
                
                System.out.println("Invalid input: "+ response + "must match the pattern"+ regExPattern);
                
            }
        }while (!gotAValue);
        return response;

}

 // pretty header
   public static void prettyHeader(String msg) {
       int starCount=60;
       while(starCount!=0)
           {System.out.print("*");
           starCount--;
           }
       
       System.out.println();
       System.out.print("***");
       int whiteSpace=(53-msg.length())/2;
       int left=1;
       while(left<=whiteSpace)
       {
       System.out.print(" ");
       left++;
       }
       System.out.print(msg);
       int right=0;
       while(right<=whiteSpace)
       {
           System.out.print(" ");
           right++;
           
       }  
           System.out.print("***");
       
       System.out.println();
       starCount=60;
       while(starCount!=0)
       {
           System.out.print("*");
           starCount--;
       }
   }
}
