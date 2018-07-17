package w9;

import java.util.Comparator;

public abstract class AbstractComparator implements Comparator<Flight> {
    private final AbstractComparator next;

    public AbstractComparator(AbstractComparator next) {
        this.next = next;
    }

    public int compare(Flight flight1, Flight flight2) {
        int result = doCompare(flight1, flight2);
        if (result != 0) {
            return result;
        } else {
            return next != null? next.compare(flight1, flight2) : 0;
        }
    }

    public abstract int doCompare(Flight flight1, Flight flight2);
}