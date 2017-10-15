import java.io.IOException;
import java.util.*;

public class LaGuardiaAirport {

	public static void showMainMenu()
	{

		System.out.println("Main Menu");
		System.out.println("1 - Airlines & Aircrafts");
		System.out.println("2 - Flight");
		System.out.println("3 - Terminals & Gates");
		System.out.println("5 - Exit");
		System.out.print("Select an option:");
	}
	
	public static void showGateMenu()
	{

		System.out.println("Terminal & Gates Menu");
		System.out.println("1 - Add a Terminal");
		System.out.println("2 - Terminal List");
		System.out.println("3 - Add a New Gate");
		System.out.println("4 - Gates by Terminal");
		System.out.println("5 - Assign a Flight to a Gate");
		System.out.println("6 - Release a Flight from a Gate");
		System.out.println("7 - Gate Status");
		System.out.println("8 - Main Menu");
		System.out.print("Select an option:");
		
	}
	
	public static void showAirlinesMenu()
	{

		System.out.println("Airlines & Aircraft Menu");
		System.out.println("1 - Add Airlines");
		System.out.println("2 - Airlines List");
		System.out.println("3 - Add Aircraft");
		System.out.println("4 - Aircraft List by Airline");
		System.out.println("5 - Main Menu");
		System.out.print("Select an option:");
		
	}
	
	public static void showMFlightMenu()
	{
		System.out.println("Flight Menu");
		System.out.println("1 - Create a New flight Number");
		System.out.println("2 - Show Flights Numbers by Airline");
		System.out.println("3 - Create a Departure Flight");
		System.out.println("4 - Create an Arrival Flight");
		System.out.println("5 - Incompleted Flights");
		System.out.println("6 - Completed Flight");
		System.out.println("7 - Main Menu");
		System.out.print("Select an option:");
	}
	
	public static Airline AddAirilines()
	{
		Airline tempAirline = new Airline();
		System.out.println("\n");
		System.out.println("Airline Code?: ");
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		tempAirline.setCode(code);
		
		System.out.println("\n");
		System.out.println("Airline Name?: ");
		String name = sc.nextLine();
		tempAirline.setName(name);
		
		return tempAirline;
		
		
	}
	
	public static Aircraft AddAircraft( Airline newAirline )
	{
		Aircraft tempAircraft= new Aircraft();
		
		tempAircraft.setAirline(newAirline);
		
		System.out.println("Aircraft ID(Integers only)?: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		tempAircraft.setID(id);
		
		return tempAircraft;
		
		
	}

	public static Flight AddFlight( Airline newAirline)
	{
		Flight tempFlight= new Flight();
		
		tempFlight.setAirline(newAirline);
		
		System.out.println("Flight Number?: ");
		Scanner sc = new Scanner(System.in);
		String Number = sc.nextLine();
		tempFlight.setNumber(Number);;
		
		return tempFlight;
		
		
	}
	
	public static Gate AddGate(Terminal newTerminal )
	{
		Gate tempGate= new Gate();
		
		System.out.println("Gate Number?");		 	
		Scanner sc9 = new Scanner(System.in);
		String gateNumber= sc9.nextLine();
			
		tempGate.setNumber(gateNumber);
		tempGate.setTerminal(newTerminal);
		tempGate.assignDA(null);
		
		return tempGate;
		
	}
	
	public static Terminal AddTerminal()
	{
		Terminal tempTerminal= new Terminal();
		System.out.println("\n");
		System.out.println("Terminal Number: ");
		Scanner sc = new Scanner(System.in);
		String Number = sc.nextLine();
		tempTerminal.setNumber(Number);
		
		return tempTerminal;
	}
	
	public static DeparturesArrivals AddDepArr( String newID, Flight newFlight, String newDate, 
			String newTime, char newType, Gate newGate, char newStatus, Aircraft newAircraft  )
	{
		DeparturesArrivals tempDeparturesArrivals = new DeparturesArrivals ();
		
		tempDeparturesArrivals.setID(newID);
		tempDeparturesArrivals.setFlight(newFlight);
		tempDeparturesArrivals.setDate(newDate);		
		tempDeparturesArrivals.setTime(newTime);		
		tempDeparturesArrivals.setType(newType);		
		tempDeparturesArrivals.setGate(newGate);
		tempDeparturesArrivals.setStatus(newStatus);
		tempDeparturesArrivals.setAircraft(newAircraft);
		
		return tempDeparturesArrivals;
	}

	
	
	 public static void main(String[] args) {
		  
		 
		 int count = 0;
		 int b = 1;
		 int c = 1;
		 int d = 1;
		 int f = 1;
		 int g = 1;
		 
		 
		ArrayList <Airline> airlinesList = new ArrayList<Airline>();
		LinkedList <Aircraft> aircraftList = new LinkedList<Aircraft>();
		ArrayList <Flight> flightsList = new ArrayList<Flight>();
		ArrayList <Gate> gateList = new ArrayList<Gate>();
		ArrayList <Terminal> terminalList = new ArrayList<Terminal>();
		LinkedList<DeparturesArrivals> departuresArrivalsList = new LinkedList<DeparturesArrivals>();
		int countDA = 0;
		Stack<DeparturesArrivals> departuresArrivalsListS1 = new Stack<DeparturesArrivals>();
		Stack<DeparturesArrivals> departuresArrivalsListS2 = new Stack<DeparturesArrivals>();
		
		
	/*------------------------------------------------------------------*/	 
		Airline tempAirline1 = new Airline();
		Airline tempAirline2 = new Airline();
		
		tempAirline1.setCode("AA");
		tempAirline1.setName("American Airlines");
		airlinesList.add(tempAirline1);
		count ++;
		
		tempAirline2.setCode("DT");
		tempAirline2.setName("Delta Airlines");
		airlinesList.add(tempAirline2);
		count ++;
		
		Collections.sort(airlinesList,new NameComp());
		
	/*------------------------------------------------------------------*/
		
		Aircraft tempAircraft1= new Aircraft();
		Aircraft tempAircraft2= new Aircraft();
		Aircraft tempAircraft3= new Aircraft();
		Aircraft tempAircraft4= new Aircraft();
		
		tempAircraft1.setAirline(tempAirline1);
		tempAircraft1.setID(5586);
		aircraftList.add(tempAircraft1);
		

		tempAircraft2.setAirline(tempAirline1);
		tempAircraft2.setID(7778);
		aircraftList.add(tempAircraft2);
		
		tempAircraft3.setAirline(tempAirline1);
		tempAircraft3.setID(6698);
		aircraftList.add(tempAircraft3);

		tempAircraft4.setAirline(tempAirline2);
	    tempAircraft4.setID(9996);
	    aircraftList.add(tempAircraft4);
	    
	 /*------------------------------------------------------------------*/  
	    
	    Flight tempF1 = new Flight();
	    Flight tempF2 = new Flight();
	    Flight tempF3 = new Flight();
	    Flight tempF4 = new Flight();
	    
	    tempF1.setAirline(tempAirline1);
	    tempF1.setNumber("222");
	    flightsList.add(tempF1);
	    
	    tempF2.setAirline(tempAirline1);
	    tempF2.setNumber("333");
	    flightsList.add(tempF2);
		
	    tempF3.setAirline(tempAirline2);
	    tempF3.setNumber("222");
	    flightsList.add(tempF3);
	    
	    tempF4.setAirline(tempAirline2);
	    tempF4.setNumber("444");
	    flightsList.add(tempF4);
 /*------------------------------------------------------------------*/  
	    DeparturesArrivals tempD1 = new DeparturesArrivals();
	    DeparturesArrivals tempD2 = new DeparturesArrivals();
	    DeparturesArrivals tempD3 = new DeparturesArrivals();
	    DeparturesArrivals tempD4 = new DeparturesArrivals();
	    
	    tempD1.setAircraft(tempAircraft1);
	    tempD1.setDate("05/13/2017");
	    tempD1.setFlight(tempF1);
	    tempD1.setID("1234");
	    tempD1.setTime("19:00");
	    tempD1.setType('A');
	    departuresArrivalsList.add(tempD1);
	    
	    tempD2.setAircraft(tempAircraft2);
	    tempD2.setDate("05/14/2017");
	    tempD2.setFlight(tempF2);
	    tempD2.setID("2345");
	    tempD2.setTime("20:00");
	    tempD2.setType('A');
	    departuresArrivalsList.add(tempD2);
	    
	    tempD3.setAircraft(tempAircraft4);
	    tempD3.setDate("05/13/2017");
	    tempD3.setFlight(tempF3);
	    tempD3.setID("3456");
	    tempD3.setTime("5:00");
	    tempD3.setType('D');
	    departuresArrivalsList.add(tempD3);
	    
	    Collections.sort(departuresArrivalsList,new dateComp());
	    

		
/*------------------------------------------------------------------*/ 

	    Terminal tempTerminal1 = new Terminal();
	    Terminal tempTerminal2 = new Terminal();
	    Terminal tempTerminal3 = new Terminal();
	    Terminal tempTerminal4 = new Terminal();
	    
	    tempTerminal1.setNumber("A");
	    terminalList.add( tempTerminal1 );
	    
	    tempTerminal2.setNumber("B");
	    terminalList.add( tempTerminal2 );
	    
	    tempTerminal3.setNumber("C");
	    terminalList.add( tempTerminal3 );
	    
	    tempTerminal4.setNumber("D");
	    terminalList.add( tempTerminal4 );
	    
		Collections.sort(terminalList,new TerminalNumComp());
	    
/*------------------------------------------------------------------*/ 
		
		Gate tempGate1 = new Gate();
		Gate tempGate2 = new Gate();
		Gate tempGate3 = new Gate();
		Gate tempGate4 = new Gate();
		Gate tempGate5 = new Gate();
		Gate tempGate6 = new Gate();
		Gate tempGate7 = new Gate();
		Gate tempGate8 = new Gate();
		Gate tempGate9 = new Gate();
		Gate tempGate10 = new Gate();
		
		Queue<DeparturesArrivals> daQueue = new LinkedList<DeparturesArrivals>();
		
		tempGate1.setTerminal(tempTerminal1);
		tempGate1.setNumber("1");
		tempGate1.setQueue(daQueue);
		tempGate2.setTerminal(tempTerminal1);
		tempGate2.setNumber("2");
		tempGate2.setQueue(daQueue);
		gateList.add(tempGate1);
		gateList.add(tempGate2);
		
		tempGate3.setTerminal(tempTerminal2);
		tempGate3.setNumber("1");
		tempGate3.setQueue(daQueue);
		tempGate4.setTerminal(tempTerminal2);
		tempGate4.setNumber("2");
		tempGate4.setQueue(daQueue);
		gateList.add(tempGate3);
		gateList.add(tempGate4);
		
		tempGate5.setTerminal(tempTerminal3);
		tempGate5.setNumber("1");
		tempGate5.setQueue(daQueue);
		tempGate6.setTerminal(tempTerminal3);
		tempGate6.setNumber("2");
		tempGate6.setQueue(daQueue);
		gateList.add(tempGate5);
		gateList.add(tempGate6);
		
		tempGate7.setTerminal(tempTerminal4);
		tempGate7.setNumber("1");
		tempGate7.setQueue(daQueue);
		tempGate8.setTerminal(tempTerminal4);
		tempGate8.setNumber("2");
		tempGate8.setQueue(daQueue);
		gateList.add(tempGate7);
		gateList.add(tempGate8);
		
		tempGate9.setTerminal(tempTerminal2);
		tempGate9.setNumber("3");
		tempGate9.setQueue(daQueue);
		tempGate10.setTerminal(tempTerminal2);
		tempGate10.setNumber("4");
		tempGate10.setQueue(daQueue);
		gateList.add(tempGate9);
		gateList.add(tempGate10);
		
/*------------------------------------------------------------------*/ 	
		

		
		 while (b == 1)
		 {
			 c=1;
			 d=1;
			 f=1;
			 g=1;
			 
			 System.out.println("\n");
			 showMainMenu();	
			 Scanner sc = new Scanner(System.in);
			 int option = sc.nextInt();	 
		 
			 switch (option) 
			 {
			 	case 1: 
			 	{ 
			 		while (c == 1)
	 				{
			 			System.out.println("\n");
			 			showAirlinesMenu() ;
		 				Scanner sc1 = new Scanner(System.in);
		 				int option2 = sc1.nextInt();
		 				
			 				switch (option2) 
			 				{
			 	 				case 1: 
			 	 				{
			 	 					boolean found = false;
			 	 					Airline tempAirline = new Airline();
			 	 								 	 					
	 	 							tempAirline = AddAirilines();
	 	 							
	 	 							for (Airline e : airlinesList)
			 	 					{
			 	 						if (e.getCode().equals(tempAirline.getCode()))
			 	 						{
			 	 							tempAirline = e;
			 	 							found = true; 
			 	 						}
			 	 					}
	 	 							if (found)
		 	 						{
	 	 								System.out.println("WARNING: Airline code already exists");
		 	 							
		 	 						}else
		 	 						{
		 	 							airlinesList.add( tempAirline );
				 	 					Collections.sort(airlinesList,new NameComp());
				 	 					
				 	 					System.out.println("Airline Added");
				 	 					
				 	 					count ++;
		 	 						}
	 	 						}		
			 	 				break;
			 	 				
			 	 				case 2: 
			 	 				{
			 	 					
			 	 					for (Airline e : airlinesList)
			 	 					{
			 	 						System.out.println(e.writeOutput());
			 	 					}
			 	 				}
			 	 				break;
			 	 				
			 	 				case 3:
			 	 				{
			 	 						System.out.println("What airlines code does this new Aircraft belong?: ");		 	
			 	 						Scanner sc3 = new Scanner(System.in);
			 	 						String code = sc3.nextLine();
			 	 						
			 	 						boolean found = false;
			 	 						
			 	 						Airline tempAirline = new Airline();
			 	 						
			 	 						if (airlinesList.isEmpty()) 
			 	 						{
			 	 							System.out.println("WARNING: Airline List is Empty");
			 	 						}else 
			 	 						{
			 	 							for (Airline e : airlinesList)
					 	 					{
					 	 						if (e.getCode().equals(code))
					 	 						{
					 	 							tempAirline = e;
					 	 							found = true; 
					 	 						}
					 	 					}
			 	 							if (found)
				 	 						{
				 	 							aircraftList.add(AddAircraft(tempAirline));
				 	 							System.out.println("Aircraft Added");
				 	 							
				 	 						}else
				 	 						{
				 	 							System.out.println("WARNING: Airline code not found");
				 	 						}
			 	 						}
			 	 				}
			 	 				break;
			 	 				
			 	 				case 4:
			 	 				{
			 	 					
			 	 					System.out.println("Airline Code?: ");
			
			 	 					Scanner sc4 = new Scanner(System.in);
			 	 					String tempAirlineCode= sc4.nextLine();
			 	 					 
			 	 					for (Aircraft e : aircraftList)
			 	 					{
			 	 						if (e.getAirlineCode().equals(tempAirlineCode))
			 	 							System.out.println(e.getID() + " - " + e.getAirlineCode());
			 	 					}
			 	 				}
			 	 				break;
			 	 				
			 	 				case 5: c = 0;
			 	 				break;
			 	 				
			 				}
		 			 }
			 	}
			 	break;
			 	case 2: 
			 	{
			 		while (d == 1)
	 				{
						f=1;
						g=1;
			 			
				 		System.out.println("\n");
				 		showMFlightMenu();
				 		
				 		Scanner sc6 = new Scanner(System.in);
						int option6 = sc6.nextInt();	 
						
						switch (option6) 
						{
							case 1: 
						 	{ 

					 			System.out.println("Airline Code?");		 	
	 	 						Scanner sc3 = new Scanner(System.in);
	 	 						String code = sc3.nextLine();
	 	 						
	 	 						boolean found = false;
	 	 						
	 	 						Airline tempAirline = new Airline();
	 	 						
	 	 						if (airlinesList.isEmpty()) 
	 	 						{
	 	 							System.out.println("WARNING: Airline List is Empty");
	 	 						}else 
	 	 						{
	 	 							for (Airline e : airlinesList)
			 	 					{
			 	 						if (e.getCode().equals(code))
			 	 						{
			 	 							tempAirline = e;
			 	 							found = true; 
			 	 						}
			 	 					}
	 	 							if (found)
		 	 						{
	 	 								flightsList.add(AddFlight(tempAirline));
		 	 							System.out.println("Flight Created");
		 	 							
		 	 						}else
		 	 						{
		 	 							System.out.println("WARNING: Airline code not found");
		 	 						}
	 	 						}			
						 	}
						 	break;
						 	
							case 2:
							{
								System.out.println("Airle Code?: ");
								
		 	 					Scanner sc4 = new Scanner(System.in);
		 	 					String tempAirlineCode= sc4.nextLine();
		 	 					 
		 	 					for (Flight e : flightsList)
		 	 					{
		 	 						if (e.getAirlineCode().equals(tempAirlineCode))
		 	 							System.out.println(e.getAirlineCode() + e.getNumber());
		 	 					}
							}
							break;
							
							case 3: //Create Departures
							{
								String type ="Departure";
								char type2= 'D';
								System.out.println();
								System.out.println("Warning: Future Departure Flight Only!\n");
								System.out.println("Airline Code of this flight?");
								Scanner sc4 = new Scanner(System.in);
								String code = sc4.nextLine();
		 	 					
								boolean found = false;
	 	 						
	 	 						Airline tempAirline = new Airline();
	 	 						
	 	 						if (airlinesList.isEmpty()) 
	 	 						{
	 	 							System.out.println("WARNING: Airline List is Empty");
	 	 						}else 
	 	 						{
	 	 							for (Airline e : airlinesList)
			 	 					{
			 	 						if (e.getCode().equals(code))
			 	 						{
			 	 							tempAirline = e;
			 	 							found = true; 
			 	 						}
			 	 					}
	 	 							if (found)
		 	 						{
	 	 								System.out.println("Flight Number?");
	 									Scanner sc5 = new Scanner(System.in);
	 									String number1 = sc5.nextLine();
	 									boolean found1 = false;
	 		 	 						
	 		 	 						Flight tempFlight= new Flight();
	 		 	 						
	 		 	 						if (flightsList.isEmpty()) 
	 		 	 						{
	 		 	 							System.out.println("WARNING: Flight List is Empty");
	 		 	 						}else 
	 		 	 						{
	 		 	 							for (Flight e : flightsList)
	 				 	 					{
	 				 	 						if ((e.getNumber().equals(number1)) && (e.getAirlineCode().equals(code)))
	 				 	 						{
	 				 	 							tempFlight = e;
	 				 	 							found1 = true; 
	 				 	 						}
	 				 	 					}
	 		 	 							if (found1)
	 			 	 						{
	 		 									
	 		 	 								System.out.println("New " + type + " Flight ID?:");
	 		 									Scanner sc7 = new Scanner(System.in);
	 		 									String ID = sc7.nextLine();
	 		 									
	 		 									System.out.println("New " + type + " Flight Date (mm/dd/yyyy): ");
	 		 									String date = sc7.nextLine();
	 		 									
	 		 									System.out.println("New " + type + " Flight Time?(24 hrs format): ");
	 		 									String time = sc7.nextLine();
	 		 									
	 		 									boolean found2 = true;
	 		 									
	 		 									DeparturesArrivals  TempDeparturesArrivals = new DeparturesArrivals ();
	 		 									
	 		 									
 		 		 	 							for (DeparturesArrivals  e : departuresArrivalsList)
 		 				 	 					{
 		 				 	 						if ( ( e.getID().equals(ID) ) || ( e.getFlight().getNumber().equals(number1) && e.getType() == 'D' && e.getTime().equals(time)) && e.getDate().equals(date) )
 		 				 	 							found2 = false; 
 		 				 	 					}
 		 		 	 							if (found2)
 		 			 	 						{	
 		 		 	 								
	 		 		 	 							System.out.println("Aircraft ID? (numbers olny): ");
		 		 									Scanner sc8 = new Scanner(System.in);
		 		 									int aircID = sc8.nextInt();
		 		 									
		 		 									boolean found3 = false;
		 		 									
		 		 									Aircraft tempAircraft= new Aircraft ();
		 		 									
		 		 									if (aircraftList.isEmpty()) 
		 		 		 	 						{
		 		 		 	 							System.out.println("WARNING: Aircraft List is Empty");
		 		 		 	 						}else 
		 		 		 	 						{
		 		 		 	 							for (Aircraft e : aircraftList)
		 		 				 	 					{
		 		 				 	 						if ( ( e.getID()==aircID ) && ( e.getAirlineCode().equals(code) ))
		 		 				 	 						{
		 		 				 	 							found3 = true; 
		 		 				 	 							tempAircraft = e;
		 		 				 	 							
		 		 				 	 						}
		 		 				 	 					}
		 		 		 	 							if (found3)
		 		 			 	 						{	
		 		 		 	 								
		 		 		 	 								departuresArrivalsList.add(AddDepArr(ID,tempFlight,date,time,type2,null,'I',tempAircraft));	
		 		 		 	 								countDA++;
		 		 		 	 								Collections.sort(departuresArrivalsList,new dateComp());
		 		 		 	 								System.out.println("Departure Flight Created");
		 		 			 	 							
		 		 			 	 						}else
		 		 			 	 						{
		 		 			 	 							System.out.println("WARNING: Aircraft error. Aircraft could not exists or Airline does not match with this aircraft ID.");
		 		 			 	 						}
		 		 		 	 						}
 		 			 	 							
 		 			 	 						}else
 		 			 	 						{
 		 			 	 							System.out.println("WARNING: " + type + " flight already exits");
 		 			 	 						}		
	 			 	 						}else
	 			 	 						{
	 			 	 							System.out.println("WARNING: Flight not found");
	 			 	 						}
	 		 	 						}	
		 	 						}else
		 	 						{
		 	 							System.out.println("WARNING: Airline code not found");
		 	 						}
	 	 						}	
		 	 					
		 	 					
							}
							break;
							
							case 4: //Create Arrival Flight
							{
								String type ="Arrival";
								char type2= 'A';
								System.out.println();
								System.out.println("Warning: Future Arrival Flight Only!\n");
								System.out.println("Airline Code of this flight?");
								Scanner sc4 = new Scanner(System.in);
								String code = sc4.nextLine();
		 	 					
								boolean found = false;
	 	 						
	 	 						Airline tempAirline = new Airline();
	 	 						
	 	 						if (airlinesList.isEmpty()) 
	 	 						{
	 	 							System.out.println("WARNING: Airline List is Empty");
	 	 						}else 
	 	 						{
	 	 							for (Airline e : airlinesList)
			 	 					{
			 	 						if (e.getCode().equals(code))
			 	 						{
			 	 							tempAirline = e;
			 	 							found = true; 
			 	 						}
			 	 					}
	 	 							if (found)
		 	 						{
	 	 								System.out.println("Flight Number?");
	 									Scanner sc5 = new Scanner(System.in);
	 									String number1 = sc5.nextLine();
	 									boolean found1 = false;
	 		 	 						
	 		 	 						Flight tempFlight= new Flight();
	 		 	 						
	 		 	 						if (flightsList.isEmpty()) 
	 		 	 						{
	 		 	 							System.out.println("WARNING: Flight List is Empty");
	 		 	 						}else 
	 		 	 						{
	 		 	 							for (Flight e : flightsList)
	 				 	 					{
	 				 	 						if ((e.getNumber().equals(number1)) && (e.getAirlineCode().equals(code)))
	 				 	 						{
	 				 	 							tempFlight = e;
	 				 	 							found1 = true; 
	 				 	 						}
	 				 	 					}
	 		 	 							if (found1)
	 			 	 						{
	 		 									
	 		 	 								System.out.println("New " + type + " Flight ID?:");
	 		 									Scanner sc7 = new Scanner(System.in);
	 		 									String ID = sc7.nextLine();
	 		 									
	 		 									System.out.println("New " + type + " Flight Date (mm/dd/yyyy): ");
	 		 									String date = sc7.nextLine();
	 		 									
	 		 									System.out.println("New " + type + " Flight Time?(24 hrs format): ");
	 		 									String time = sc7.nextLine();
	 		 									
	 		 									boolean found2 = true;
	 		 									
	 		 									DeparturesArrivals  TempDeparturesArrivals = new DeparturesArrivals ();
	 		 									
	 		 									
 		 		 	 							for (DeparturesArrivals  e : departuresArrivalsList)
 		 				 	 					{
 		 				 	 						if ( ( e.getID().equals(ID) ) || ( e.getFlight().getNumber().equals(number1) && e.getType() == 'D' && e.getTime().equals(time)) && e.getDate().equals(date) )
 		 				 	 							found2 = false; 
 		 				 	 					}
 		 		 	 							if (found2)
 		 			 	 						{	
 		 		 	 								
	 		 		 	 							System.out.println("Aircraft ID? (numbers olny): ");
		 		 									Scanner sc8 = new Scanner(System.in);
		 		 									int aircID = sc8.nextInt();
		 		 									
		 		 									boolean found3 = false;
		 		 									
		 		 									Aircraft tempAircraft= new Aircraft ();
		 		 									
		 		 									if (aircraftList.isEmpty()) 
		 		 		 	 						{
		 		 		 	 							System.out.println("WARNING: Aircraft List is Empty");
		 		 		 	 						}else 
		 		 		 	 						{
		 		 		 	 							for (Aircraft e : aircraftList)
		 		 				 	 					{
		 		 				 	 						if ( ( e.getID()==aircID ) && ( e.getAirlineCode().equals(code) ))
		 		 				 	 						{
		 		 				 	 							found3 = true; 
		 		 				 	 							tempAircraft = e;
		 		 				 	 							
		 		 				 	 						}
		 		 				 	 					}
		 		 		 	 							if (found3)
		 		 			 	 						{	
		 		 		 	 								
		 		 		 	 								departuresArrivalsList.add(AddDepArr(ID,tempFlight,date,time,type2,null,'I',tempAircraft));	
		 		 		 	 								countDA++;
		 		 		 	 								Collections.sort(departuresArrivalsList,new dateComp());
		 		 			 	 							System.out.println("Arrival Flight Created");
		 		 			 	 							
		 		 			 	 						}else
		 		 			 	 						{
		 		 			 	 							System.out.println("WARNING: Aircraft error. Aircraft could not exists or Airline does not match with this aircraft ID.");
		 		 			 	 						}
		 		 		 	 						}
 		 			 	 							
 		 			 	 						}else
 		 			 	 						{
 		 			 	 							System.out.println("WARNING: " + type + " flight already exits");
 		 			 	 						}		
	 			 	 						}else
	 			 	 						{
	 			 	 							System.out.println("WARNING: Flight not found");
	 			 	 						}
	 		 	 						}	
		 	 						}else
		 	 						{
		 	 							System.out.println("WARNING: Airline code not found");
		 	 						}
	 	 						}		
							}
							break;
							
							case 5: //Incomplete Flight List
							{
								
								
								if (!departuresArrivalsList.isEmpty())
								{
									System.out.println("Date\t\tTime\tID\tFlight\tType\tAircraft Code");
									for (DeparturesArrivals e2 : departuresArrivalsList)
			 	 					{
			 	 							System.out.println( e2.writeOutput() );
			 	 					}
									
								}
							}
							break;
							
							case 6: //Completed Flight by Airlines
							{
								System.out.println("Date\t\tTime\tID\tFlight\tType\tAircraftCode\tGate");
								
								departuresArrivalsListS2 = departuresArrivalsListS1;
								while (!departuresArrivalsListS2.isEmpty())
								{
									System.out.println(departuresArrivalsListS2.pop().writeOutput2());
								}
								
							}
							
							
							case 7: d = 0;
		 	 				break;
						 }
	 				}
			 	}
			 	break;
			 	
			 	case 3: // Terminal Gate Menu
			 	{
			 		while (g == 1)
	 				{
			 			System.out.println("\n");
				 		showGateMenu();
				 		
				 		Scanner sc7 = new Scanner(System.in);
						int option7 = sc7.nextInt();	 
						
						switch (option7) 
						{
							case 1: // AddTerminal
						 	{
						 		
						 		boolean found = false;
		 	 					Terminal tempTerminal= new Terminal();
		 	 					
 	 							tempTerminal= AddTerminal();
 	 							
 	 							for (Terminal e : terminalList)
		 	 					{
		 	 						if (e.getNumber().equals(tempTerminal.getNumber()))
		 	 						{
		 	 							tempTerminal = e;
		 	 							found = true; 
		 	 						}
		 	 					}
 	 							if (found)
	 	 						{
 	 								System.out.println("WARNING: The Terminal already exists");
	 	 							
	 	 						}else
	 	 						{
	 	 							terminalList.add( tempTerminal );
			 	 					Collections.sort(terminalList,new TerminalNumComp());
			 	 					
			 	 					System.out.println("Terminal Added");
			 	 					
			 	 					count ++;
	 	 						}
						 		
						 		
						 	}
						 	break;
						 	
							case 2: //Terminal List
							{
		 	 					for (Terminal e : terminalList)
		 	 					{
		 	 						System.out.println(e.getNumber());
		 	 					}
							}
							break;
							
							case 3: //Add Gate
							{
								System.out.println("What terminal does this new gate belong?: ");		 	
	 	 						Scanner sc3 = new Scanner(System.in);
	 	 						String number = sc3.nextLine();
	 	 						
	 	 						boolean found = false;
	 	 						
	 	 						Terminal tempTerminal = new Terminal();
	 	 						
	 	 						if (terminalList.isEmpty()) 
	 	 						{
	 	 							System.out.println("WARNING: Terminal List is Empty");
	 	 						}else 
	 	 						{
	 	 							for (Terminal e : terminalList)
			 	 					{
			 	 						if (e.getNumber().equals(number))
			 	 						{
			 	 							tempTerminal = e;
			 	 							found = true; 
			 	 						}
			 	 					}
	 	 							if (found)
		 	 						{
		 	 							gateList.add(AddGate(tempTerminal));
		 	 							System.out.println("Gate Added");
		 	 							
		 	 						}else
		 	 						{
		 	 							System.out.println("WARNING: Terminal not found");
		 	 						}
	 	 						}
							}
							break;
							case 4://Gates by Terminal
							{
								System.out.println("Terminal?: ");
								
		 	 					Scanner sc4 = new Scanner(System.in);
		 	 					String tempTerminalNum= sc4.nextLine();
		 	 					 
		 	 					for (Gate e : gateList)
		 	 					{
		 	 						if (e.getTerminal().equals(tempTerminalNum))
		 	 							System.out.println(e.getTerminal() + e.getNumber());
		 	 					}
							}
							break;
							case 5://Assign a Flight to a Gate
							{
								int count1 = 0;
								int count2 = 0;
								
								System.out.println("Terminal Number?:");
								Scanner sc4 = new Scanner(System.in);
		 	 					String tempTerminalNum= sc4.nextLine();
		 	 					System.out.println("Gate Number?:");
		 	 					String tempgGateNum= sc4.nextLine();
		 	 					
		 	 					boolean found = false;
		 	 					for (Gate e : gateList)
		 	 					{
		 	 						if (e.getTerminal().equals(tempTerminalNum))
		 	 						{
		 	 							if (e.getNumber().equals(tempgGateNum))
		 	 							{
		 	 								
		 	 								found = true;
		 	 								System.out.println("Flight ID?:");
				 	 						Scanner sc5 = new Scanner(System.in);
					 	 					String tempFlightID= sc5.nextLine();
					 	 					
					 	 					boolean found2 = false;
					 	 					
					 	 					for (DeparturesArrivals e2 :  departuresArrivalsList)
					 	 					{
					 	 						count1++;
					 	 						if (e2.getID().equals(tempFlightID))
					 	 						{	
					 	 							count2 = count1;
					 	 							e.assignDA(e2);
					 	 							found2 = true; 
					 	 						}

					 	 					}
					 	 					if (found2)
					 	 					{
					 	 						DeparturesArrivals tempDA = new DeparturesArrivals ();
					 	 						tempDA = departuresArrivalsList.remove(count2-1);
					 	 						tempDA.setGate(e);
					 	 						System.out.println( "Fligh " + tempDA.getFlight().getAirlineCode() + tempDA.getFlight().getNumber() + " is Assigned to Gate "+ tempDA.getGate().getTerminal()+tempDA.getGate().getNumber());
					 	 					//	departuresArrivalsListS1.push(tempDA);
					 	 						
					 	 					}else
					 	 					{
					 	 						System.out.println("Warning: Invalid Flight ID");
					 	 					}
					 	 					
		 	 							}
		 	 						}
		 	 					}
		 	 						
		 	 					if (!found)
		 	 						System.out.println("Warning: Invalid Terminal/Gate");
		 	 					
							}
							break;
							
							case 6:
							{
								System.out.println("Terminal Number?:");
								Scanner sc4 = new Scanner(System.in);
		 	 					String tempTerminalNum= sc4.nextLine();
		 	 					System.out.println("Gate Number?:");
		 	 					String tempgGateNum= sc4.nextLine();
		 	 					
		 	 					if (!gateList.isEmpty())
		 	 					{
		 	 						boolean found = false;
		 	 						boolean found2 = false;
			 	 					for (Gate e : gateList)
			 	 					{
			 	 						if (e.getTerminal().equals(tempTerminalNum))
			 	 						{
			 	 							if (e.getNumber().equals(tempgGateNum))
			 	 							{
			 	 								found = true;
			 	 								if (!(e.daQueue.isEmpty()))
			 	 								{
			 	 									found = true;
			 	 									DeparturesArrivals tempDA;
			 	 									tempDA = e.removeDA();
			 	 									tempDA.setStatus('C');
				 	 								departuresArrivalsListS1.push(tempDA);
				 	 								System.out.println("Gate Released");
			 	 									
			 	 								}else
			 	 								{
			 	 									System.out.println("No flights assign to this gate");
			 	 								}
			 	 							}
			 	 						}
			 	 					}
			 	 						
			 	 					if (!found)
			 	 						System.out.println("Warning: Invalid Terminal/Gate");		
		 	 					}
								
								
							}
							break;
							
							case 7:
							{
								System.out.println("Terminal Number?:");
								Scanner sc4 = new Scanner(System.in);
		 	 					String tempTerminalNum= sc4.nextLine();
		 	 					System.out.println("Gate Number?:");
		 	 					String tempgGateNum= sc4.nextLine();
		 	 					
		 	 					if (!gateList.isEmpty())
		 	 					{
		 	 						boolean found = false;
		 	 						boolean found2 = false;
			 	 					for (Gate e : gateList)
			 	 					{
			 	 						if (e.getTerminal().equals(tempTerminalNum))
			 	 						{
			 	 							if (e.getNumber().equals(tempgGateNum))
			 	 							{
			 	 								found = true;
			 	 								int c2 = 0;
			 	 								String tempDAS = new String();
			 	 								DeparturesArrivals tempDA = new DeparturesArrivals();
			 	 								Queue<DeparturesArrivals> tempDAQueue = new LinkedList<DeparturesArrivals>();
			 	 								if (!(e.daQueue.isEmpty()))
			 	 								{
			 	 									tempDAQueue = e.getDAQueue();
			 	 									
			 	 									if (c2==0)
			 	 									{
			 	 										tempDA = tempDAQueue.remove();
			 	 										if (tempDA.getType() == 'A')
			 	 											tempDAS = "Arrival";
			 	 										if (tempDA.getType() == 'D')
			 	 											tempDAS = "Departure";
			 	 											
			 	 										System.out.println("\n" + tempDAS + " Flight Number " + tempDA.getFlight().getAirlineCode() + tempDA.getFlight().getNumber() + " is assigned to this gate\n");	
			 	 										c2++;
			 	 									}
			 	 									
			 	 									for (DeparturesArrivals e2 : tempDAQueue)
			 	 									{
			 	 										System.out.println("Flights waiting to the gate:");
			 	 										System.out.println("Date\t\tTime\tID\tFlight\tType\tAircraft Code");
				 	 									System.out.println(tempDAQueue.remove().writeOutput() );
			 	 										
				 	 								}
			 	 										
			 	 										
			 	 									
			 	 									
			 	 								}else
			 	 								{
			 	 									System.out.println("No flights assign to this gate");
			 	 								}
			 	 							}
			 	 						}
			 	 					}
			 	 						
			 	 					if (!found)
			 	 						System.out.println("Warning: Invalid Terminal/Gate");		
		 	 					}
		 	 					
							}
							break;
							case 8:
							{
								g=0;
							}
							break;
							
						}				 			
	 				}
			 	}
			 	break;
			 	
			 	case 5:	b=0;
			 	break;				 
		    }
		 }
	 }
}