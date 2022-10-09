public class DatabaseLogger extends BaseLogger{
    @Override
    public void Log(String msg) {
        System.out.println("Veritabanına loglandı : " + msg);
    }
}
