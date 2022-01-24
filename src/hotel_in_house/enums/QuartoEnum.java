package hotel_in_house.enums;

public enum QuartoEnum implements StringValueEnum {
    SIMPLES("simples", "Quarto Simples", 90, 140),
    LUXO("luxo", "Quarto Luxo", 150, 400),
    SUITE_SUPREMA("suprema", "Suíte Suprema", 500, 800);

    private String idQuarto;
    private String descricaoQuarto;
    private int valorDiaria;
    private int valorDiariaTemporada;

    private QuartoEnum(String idQuarto, String descricaoQuarto, int valorDiaria, int valorDiariaTemporada) {
        this.idQuarto = idQuarto;
        this.descricaoQuarto = descricaoQuarto;
        this.valorDiaria = valorDiaria;
        this.valorDiariaTemporada = valorDiariaTemporada;
    }

    @Override
    public String getValue() {
        return this.idQuarto;
    }

    @Override
    public String getDisplayName() {
        return this.descricaoQuarto;
    }

    public int getValorDiaria() {
        return valorDiaria;
    }

    public int getValorDiariaTemporada() {
        return valorDiariaTemporada;
    }
}
