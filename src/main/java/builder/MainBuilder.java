package builder;

public class MainBuilder {
    public static void main(String[] args) {
        Computador basico = new ComputadorBuilder()
                .processador("Intel Core i5")
                .ram("8GB")
                .armazenamento("256GB SSD")
                .build();

        Computador gamer = new ComputadorBuilder()
                .processador("Intel Core i9")
                .ram("32GB")
                .armazenamento("1TB SSD")
                .placaDeVideo("NVIDIA RTX 4070")
                .build();

        System.out.println("=== Computador Básico ===");
        System.out.println(basico);
        System.out.println();
        System.out.println("=== Computador Gamer ===");
        System.out.println(gamer);
    }
}
