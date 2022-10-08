package core;

public class FileLogger implements BaseLogger{
    @Override
    public void log(String logMessage) {
        System.out.println("Dosyaya loglandı : " + logMessage);
    }
}
