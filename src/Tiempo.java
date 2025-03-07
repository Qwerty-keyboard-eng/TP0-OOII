import java.time.LocalDate;

public class Tiempo {
    private final LocalDate ff;

    public Tiempo() {
        ff = LocalDate.now();
    }

    public LocalDate getFf() {
        return ff;
    }
}
