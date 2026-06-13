package compose;

public interface FileSystemComponent {

    String getName();
    long getSize();
    void display(String Indentation);
    void add(FileSystemComponent component);
    void remove(FileSystemComponent component);
}
