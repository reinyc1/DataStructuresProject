import java.util.LinkedList;
import java.util.Queue;

public class Gate
{
	private String Number;
	private Terminal terminal;
	Queue<DeparturesArrivals> daQueue = new LinkedList<DeparturesArrivals>();

	public Gate ( )	
	{ 
		Number = "No number yet";	
		terminal = null;
		daQueue = null;
	}

	public Gate (String initialNumber, Terminal initalTerminal, Queue<DeparturesArrivals> initialdaQueue)
	{ 
		Number = initialNumber;
		terminal= initalTerminal;
		daQueue = initialdaQueue;
	}

	public void setNumber (String newNumber)
	{ 
		 Number = newNumber;	
	}
	
	public void setTerminal (Terminal newTerminal)
	{ 
		terminal = newTerminal;	
	}
	
	public void setQueue( Queue<DeparturesArrivals> newdaQueue)
	{ 
		daQueue	= newdaQueue;
	}
	
	public void assignDA (DeparturesArrivals newDA)
	{ 
		daQueue.add(newDA);	
	}
	
	public DeparturesArrivals removeDA ()
	{ 
		return daQueue.remove();	
	}
	

	public String getNumber()		
	{ 
		return Number;		
	}
	
	public String getTerminal()		
	{ 
		return terminal.getNumber();		
	}
	
	public Queue<DeparturesArrivals> getDAQueue()
	{
		return daQueue;
		
	}

	public String writeOutput()
	{ 
		return terminal.writeOutput() + Number ;	
	}

	public boolean hasSameNumber( Gate otherGate)
	{ 
		return this.Number.equalsIgnoreCase (otherGate.Number);	
	}
}      