package Task3;

public class SortComparable implements Comparable<SortComparable> {

    private String id;

    public String getId() {
        return id;
    }

    public SortComparable(String id) {
        this.id = id;

    }

    @Override
    public int compareTo(SortComparable o) {
       return this.getId().compareTo(o.getId());

    }
}

