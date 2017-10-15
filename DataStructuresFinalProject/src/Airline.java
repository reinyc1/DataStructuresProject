public class Airline
{
	private String code;
	private String name;

	public Airline ( )	
	{ 
		name = "No name yet";	
		code = "No code yet";
	}

	public Airline (String initialName, String initalCode)
	{ 
		name = initialName;
		code = initalCode;
	}

	public void setName (String newName)
	{ 
		name = newName;	
	}
	
	public void setCode (String newCode)
	{ 
		code = newCode;	
	}

	public String getName ()		
	{ 
		return name;		
	}
	
	public String getCode ()		
	{ 
		return code;		
	}

	public String writeOutput()
	{ 
		return code + " - "+ name  ;	
	}

	public boolean hasSameName ( Airline otherAirline)
	{ 
		return this.name.equalsIgnoreCase (otherAirline.name);	
	}
}      