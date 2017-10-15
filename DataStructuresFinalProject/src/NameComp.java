import java.util.Comparator;

class NameComp implements Comparator<Airline>{

	    public int compare(Airline a1, Airline a2) {
	        if(a1.getName().compareTo(a2.getName()) > 0){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
	}