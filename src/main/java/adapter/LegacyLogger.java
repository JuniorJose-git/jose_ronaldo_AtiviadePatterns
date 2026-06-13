package adapter;

public class LegacyLogger {
    public void log(String level, String text) {
        System.out.printf("[%s] %s%n", level, text);
    }
}
