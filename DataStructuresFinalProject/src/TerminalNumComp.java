import java.util.Comparator;


class TerminalNumComp implements Comparator<Terminal>{

    public int compare(Terminal t1, Terminal t2) {
        if(t1.getNumber().compareTo(t2.getNumber()) > 0){
            return 1;
        } else {
            return -1;
        }
    }
}

