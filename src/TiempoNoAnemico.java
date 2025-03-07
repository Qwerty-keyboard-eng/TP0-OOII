import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TiempoNoAnemico {
    private final LocalDate ffna;

    public TiempoNoAnemico() {
        ffna = LocalDate.now();
    }

    public String TiempoCorto() {
        DateTimeFormatter tcorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return ffna.format(tcorto);
    }

    public String TiempoLargo() {
        DateTimeFormatter tlargo = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        return ffna.format(tlargo);
    }
}
