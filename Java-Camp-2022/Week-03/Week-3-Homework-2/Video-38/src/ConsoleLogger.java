public class ConsoleLogger extends BaseLogger{
    @Override
    public void Log(String msg) {
        System.out.println("Konsole loglandı : " + msg);
    }
}
