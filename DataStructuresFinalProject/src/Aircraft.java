public class Aircraft 
{
	private int ID;
	Airline airlineC = new Airline();

	public Aircraft( )	
	{ 
		super();
		ID = 0;	
		airlineC = null;
	}

	public Aircraft (int initialID, Airline initalAirline)
	{ 
		ID = initialID;
		airlineC = initalAirline;
	}

	public void setID (int newID)
	{ 
		ID = newID;	
	}
	
	public void setAirline (Airline newAirline)
	{ 
		airlineC = newAirline;	
	}

	public int getID ()		
	{ 
		return ID;		
	}
	
	public String getAirlineCode ()		
	{ 
		return airlineC.getCode();		
	}
	
	public String getAirlineName ()		
	{ 
		return airlineC.getName();		
	}

	public String writeOutput()
	{ 
		return "Aircraft ID: " + ID + " Airline: " + airlineC.getCode();	
	}

	public boolean hasSameAircraft ( Aircraft otherAircraft)
	{ 
		return this.ID == otherAircraft.getID();	
	}
}      