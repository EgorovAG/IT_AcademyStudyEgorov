import java.util.Date;

public class Passport {
    private String id;
    private Date effectiveAt;
    private String fio;

    public Passport(String id, Date effectiveAt, String fio) {
        this.id = id;
        this.effectiveAt = effectiveAt;
        this.fio = fio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                ", effectiveAt=" + effectiveAt +
                ", fio='" + fio + '\'' +
                '}';
    }
}

