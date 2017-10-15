
public class Terminal {
	private String Number;

	public Terminal ( )	
	{ 
		Number = "No number yet";	
	}

	public Terminal (String initialNumber)
	{ 
		Number = initialNumber;
	}

	public void setNumber (String newNumber)
	{ 
		 Number = newNumber;	
	}
	
	public String getNumber()		
	{ 
		return Number;		
	}
	
	
	public String writeOutput()
	{ 
		return Number ;	
	}

	public boolean hasSameNumber( Terminal otherTerminal)
	{ 
		return this.Number.equalsIgnoreCase (otherTerminal.Number);	
	}
}
