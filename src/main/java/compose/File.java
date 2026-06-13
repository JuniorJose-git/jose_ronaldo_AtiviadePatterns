package compose;

public class File implements FileSystemComponent {

    private String nome;
    private long size;
    private FileSystemComponent component;


    @Override
    public String getName() {
        return nome;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void display(String Indentation) {

    }

    @Override
    public void add(FileSystemComponent component) {

    }

    @Override
    public void remove(FileSystemComponent component) {

    }
}
