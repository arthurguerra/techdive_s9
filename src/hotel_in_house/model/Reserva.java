package hotel_in_house.model;

import java.time.LocalDate;
import java.util.List;

public class Reserva {

    private Hospede cliente;
    private LocalDate inicio;
    private LocalDate fim;
    private List<Hospede> pessoasHospedadas;
}
