import java.util.Comparator;

public class dateComp implements Comparator<DeparturesArrivals> {

	public int compare(DeparturesArrivals da1, DeparturesArrivals da2) {
        if(da1.getDate().compareTo(da2.getDate()) > 0){
            return 1;
        } else {
            return -1;
        }
    }
}
