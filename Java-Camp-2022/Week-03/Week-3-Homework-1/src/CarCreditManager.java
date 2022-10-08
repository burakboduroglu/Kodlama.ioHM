public class CarCreditManager extends BaseCreditManager implements CreditManager{
    @Override
    public void calculate() {
        System.out.println("Araba kredisi hesaplandı");
    }
}
