//imports & extensions
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

//file name and main driver of the program
public class ULTIMATECOMPUTERWORKSTATION
{
//Hardware price array list that records and calculates the prices for the parts 
static void recordPrice(double price, ArrayList<Double> priceList) {
    Scanner input = new Scanner(System.in);
    price = input.nextDouble();
    priceList.add(price);
    }
//Hardware & software names array that gathers names of all of the parts/items
static void recordNames(String names, ArrayList<String> namesList) {
    Scanner input = new Scanner(System.in);
    names = input.nextLine();
    namesList.add(names);
}

//MAIN DRIVER OF THE PROGRAM
public static void main (String[] args)
    {
    //step#3
    //HARDWARE INPUT OF PRICES
    double keyboard=0, mouse=0, headset=0, monitor=0;
    double mousePad=0, wristRest=0, chair=0, footRest=0;
    // declaring final cost variables
    double price = 0;
    double discount =0;
    String names="";
    //Price of prebuilt
    double prebuilt = 1999.99;

    //step #4- how do I set up for user input?
    //#4 SET UP AND OBTAIN USER INPUT
    ArrayList<Double> priceList = new ArrayList<Double>();
    ArrayList<String> namesList = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    //INSIDE OF A COMPUTER- BUILDING YOUR OWN PC - 7 costs
    //HARDWARE
    //INSIDE OF A COMPUTER- BUILDING YOUR OWN PC - 7 cost
    //input cpu
    System.out.print("CPU NAME ");
    recordNames(names,namesList);
    System.out.print("CPU COST $");
    recordPrice(price, priceList);
    //input cpu cooler
    System.out.print("CPU COOLER NAME ");
    recordNames(names,namesList);
    System.out.print("CPU COOLER COST $");
    recordPrice(price, priceList);
    //input RAM
    System.out.print("RAM NAME ");
    recordNames(names,namesList);
    System.out.print("RAM COST $");
    recordPrice(price, priceList);
    //input GPU
    System.out.print("GRAPHICS CARD NAME ");
    recordNames(names,namesList);
    System.out.print("GRAPHICS CARD COST $");
    recordPrice(price, priceList);
    //input storage
    System.out.print("STORAGE NAME ");
    recordNames(names,namesList);
    System.out.print("STORAGE COST $");
    recordPrice(price, priceList);
    //input MOBO
    System.out.print("MOTHERBOARD NAME ");
    recordNames(names,namesList);
    System.out.print("MOTHERBOARD COST $");
    recordPrice(price, priceList);
    //input case
    System.out.print("CASE NAME ");
    recordNames(names,namesList);
    System.out.print("CASE COST $");
    recordPrice(price, priceList);
    //input PSU
    System.out.print("POWER SUPPLY NAME ");
    recordNames(names,namesList);
    System.out.print("POWER SUPPLY COST $");
    recordPrice(price, priceList);
    
    //PERIPHERALS 
    System.out.println ("");
    //input keyboard
    System.out.print("KEYBOARD NAME ");
    recordNames(names,namesList);
    System.out.print("KEYBOARD COST $");
    keyboard = input.nextDouble();
    //input mouse
    System.out.print("MOUSE NAME ");
    recordNames(names,namesList);
    System.out.print("MOUSE COST $");
    mouse = input.nextDouble();
    //input headset
    System.out.print("HEADSET NAME ");
    recordNames(names,namesList);
    System.out.print("HEADSET COST $");
    headset = input.nextDouble();
    //input monitor
    System.out.print("MONITOR NAME ");
    recordNames(names,namesList);
    System.out.print("MONITOR PRICE $");
    monitor = input.nextDouble();

    //EXTRA ERGONOMIC WORKSTATION ITEMS
    System.out.println ("");
    //input chair 
    System.out.print("CHAIR NAME");
    recordNames(names,namesList);
    System.out.print("CHAIR COST $");
    chair = input.nextDouble();
    //input foot rest
    System.out.print("FOOT REST NAME ");
    recordNames(names,namesList);
    System.out.print("FOOT REST COST $");
    footRest = input.nextDouble();
    //input mouse pad
    System.out.print("MOUSE PAD NAME ");
    recordNames(names,namesList);
    System.out.print("MOUSE PAD COST $");
    mousePad = input.nextDouble();
    //input wrist rest
    System.out.print("WRIST REST NAME ");
    recordNames(names,namesList);
    System.out.print("WRIST REST PRICE $");
    wristRest = input.nextDouble();
    //DISCOUNT

    System.out.println ("");
    //INTERNET SERVICE PROVIDER COST (Rogers or Bell or ?? for WIFI)
    //input wifi
    System.out.print("WIFI PROVIDER ");
    recordNames(names,namesList);
    System.out.print("MONTHLY WIFI PRICE $");
    double wifi = input.nextDouble();
    //SAFEGUARDING TOOLS (VPN, ANIT VIRUS)
    //input VPN
    System.out.print("VPN PROVIDER ");
    recordNames(names,namesList);
    System.out.print("MONTHLY VPN PRICE $");
    double vpn = input.nextDouble();
    System.out.println ("");
    System.out.print("AMOUNT OF DISCOUNT ");
    discount = input.nextDouble();
    //discount perentage can't be higher than 100
    if (discount > 100) {
        discount = 100;
    }
    //ERGONOMIC WORKSTATION(4-5 ITEMS and costs)
   
    //STEP #5 PROCESSING
    //TOTAL BEFORE TAX
    //adds all of the parts from partslist to calculate the totalprice of hardware
    double hardware = 0.0;
    for (double i : priceList) {
    hardware += i;
    }
    //adding ergonomics items
    double ergonomics = chair + footRest + mousePad + wristRest;
    //adding peripherals
    double peripherals = mouse + keyboard + headset + monitor;
    //equation for totalcost before tax
    double totalCost= (hardware + peripherals + ergonomics
    - (hardware + peripherals + ergonomics)* discount/100);
    
   
    //cost can't be lower than 0
    if (totalCost < 0 ) {
        totalCost = 0;
    }
    //TAX
    double grandtotalcost = totalCost*1.13;
    double monthlyExpenses = wifi + vpn *1.13;
    //TOTAL
    //STEP #6 OUTPUT
    System.out.println ("");
    //currency/dollar sign set up
    Locale locale = new Locale("en", "CA");     
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    //HARDWARE PRICE
    System.out.println ("YOUR TOTAL COST FOR HARDWARE: " + currencyFormatter.format(hardware));
    //ERGONOMIC PRICES
    System.out.println ("YOUR TOTAL COST FOR ERGONOMICS: " + currencyFormatter.format(ergonomics));
    //PERIPHERALS PRICE
    System.out.println ("YOUR TOTAL COST FOR PERIPHERALS: " + currencyFormatter.format(peripherals));
    //TOTAL COST BEFORE TAX
    System.out.println("YOUR TOAL COST: " + currencyFormatter.format(totalCost));
    //TOTAL COST AFTER TAX
    System.out.print ("YOUR TOTAL COST AFTER TAX: " + currencyFormatter.format(grandtotalcost));
    System.out.println (" + " + currencyFormatter.format(monthlyExpenses) + " monthly");
    //PRINT LIST OF EVERYTHING CHOSEN
    System.out.println ("HERE IS A LIST OF EVERYTHING YOU CHOSE: " + namesList);
    System.out.println ("");
    //prebuilt or custom build?
    if (hardware + peripherals <= prebuilt) {
    System.out.println ("BUILD YOUR OWN PC!");
    }
    else {
    System.out.println ("GET A PREBUILT !");
    }
  }
}