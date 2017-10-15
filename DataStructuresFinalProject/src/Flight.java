public class Flight
{
	private String Number;
	private Airline airline;

	public Flight ( )	
	{ 
		Number = "No name yet";	
		airline = null;
	}

	public Flight (String initialNumber, Airline initalAirline)
	{ 
		Number = initialNumber;
		airline = initalAirline;
	}

	public void setNumber (String newNumber)
	{ 
		Number = newNumber;	
	}

	public void setAirline (Airline newAirline)
	{ 
		airline = newAirline;	
	}

	public String getNumber()		
	{ 
		return Number;		
	}
	
	public String getAirlineCode ()		
	{ 
		return airline.getCode();		
	}
	

	public String writeOutput()
	{ 
		return airline.getCode()+ Number;	
	}

	public boolean hasSameNumber( Flight otherFlight)
	{ 
		return this.Number.equalsIgnoreCase (otherFlight.Number);	
	}
}      