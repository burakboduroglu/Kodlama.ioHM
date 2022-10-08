package core;

public class DatabaseLogger implements BaseLogger{
    @Override
    public void log(String logMessage) {
        System.out.println("Veritabanına loglandı : " + logMessage);
    }
}
