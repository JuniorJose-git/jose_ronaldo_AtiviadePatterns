package builder;

public class Computador {

    private final String processador;
    private final String ram;
    private final String armazenamento;
    private final String placaDeVideo;
    private final String sistemaOperacional;

    Computador(ComputadorBuilder builder) {
        this.processador = builder.processador;
        this.ram = builder.ram;
        this.armazenamento = builder.armazenamento;
        this.placaDeVideo = builder.placaDeVideo;
        this.sistemaOperacional = builder.sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Processador: " + processador + "\n" +
               "RAM: " + ram + "\n" +
               "Armazenamento: " + armazenamento + "\n" +
               "Placa de vídeo: " + (placaDeVideo != null ? placaDeVideo : "N/A") + "\n" +
               "Sistema operacional: " + (sistemaOperacional != null ? sistemaOperacional : "N/A");
    }
}
