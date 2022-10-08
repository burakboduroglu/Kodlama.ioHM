import jdk.jshell.spi.ExecutionControl;

public class MilitaryCreditManager extends BaseCreditManager implements CreditManager{
    @Override
    public void calculate() {
        //hesaplamalar
        System.out.println("Asker kredisi hesaplandı");
    }
}
