public class DeparturesArrivals
{
	private String ID;
	private Flight flight;
	private String Date;
	private String Time;
	private char Type;
	private Gate Gate;
	private char Status;
	private Aircraft airCraft;

	public DeparturesArrivals ( )	
	{ 
		ID = "No ID yet";	
		flight = null;
		Date = "No date yet";
		Time = "No time yet";
		Type = 'A';
		Gate = null;
		Status = 'I';
	}

	public DeparturesArrivals (String initialID, Flight initialflight, String initialDate, String initialTime, 
							   char initialType, Gate initialGate, char initialStatus, 
							   Aircraft initalAircraft )
	{ 
		ID = initialID;
		flight = initialflight;
		Date = initialDate;
		Time = initialTime;
		Type = initialType;
		Gate = initialGate;
		Status = initialStatus;
		airCraft = initalAircraft;
	}

	public void setID(String newID)
	{ 
		ID = newID;	
	}
	
	public void setType(char newType)
	{ 
		Type = newType;	
	}
	
	public void setFlight(Flight newFlight)
	{ 
		flight = newFlight;	
	}
	
	public void setDate(String newDate)
	{ 
		Date = newDate;	
	}

	public void setTime(String newTime)
	{ 
		Time = newTime;	
	}
	
	public void setGate(Gate newGate)
	{ 
		Gate = newGate;	
	}
	
	public void setStatus(char newStatus)
	{ 
		Status = newStatus;	
	}

	public void setAircraft (Aircraft newAircraft)
	{ 
		airCraft = newAircraft;	
	}
	
	public String getID ()		
	{ 
		return ID;		
	}
	
	public char getType ()		
	{ 
		return Type;		
	}
	
	public String getDate()		
	{ 
		return Date;		
	}
	
	public String getTime()		
	{ 
		return Time;		
	}
	
	public Flight getFlight()		
	{ 
		return flight;		
	}
	
	public Gate getGate()		
	{ 
		return Gate;		
	}
	
	public char getStatuts()		
	{ 
		return Status;		
	}
	
	public Aircraft getAircraft()		
	{ 
		return airCraft;		
	}
	
	public String writeOutput()
	{ 
		
		return Date + "\t" +  Time + "\t" +ID + "\t" + flight.getAirlineCode()+flight.getNumber() + "\t" + Type +"\t" + airCraft.getID();	
		
	}
	
	public String writeOutput2()
	{ 
		
		return Date + "\t" +  Time + "\t" +ID + "\t" + flight.getAirlineCode()+flight.getNumber() + "\t" + Type +"\t" + airCraft.getID() + "\t" + Gate.getTerminal() + Gate.getNumber();	
		
	}

	public boolean hasSameName (DeparturesArrivals otherDeparturesArrivals)
	{ 
		return this.ID == otherDeparturesArrivals.ID;	
	}
}      