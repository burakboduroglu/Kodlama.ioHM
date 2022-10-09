public class FileLogger extends BaseLogger{
    @Override
    public void Log(String msg) {
        System.out.println("Dosyaya loglandı : " + msg);
    }
}
