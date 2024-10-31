public class File {
    private String name;

    public File(String input) {
        name = input;
    }

    public boolean canRead() {
        return false;
    }

    public void delete() {

    }

    public boolean exists() {
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean isDirectory() {
        return false;
    }

    public int length() {
        return -1;
    }

    public void renameTo(String f) {
        name = f;
    }

    public File[] listFiles() {
        return new File[];
    }
}