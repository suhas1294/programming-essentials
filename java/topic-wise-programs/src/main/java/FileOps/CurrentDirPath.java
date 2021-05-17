package FileOps;

public class CurrentDirPath {
    public static void main(String[] args) {
        System.getProperty("user.dir");
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
    }
}
