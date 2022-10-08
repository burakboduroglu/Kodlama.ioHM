abstract class BaseCreditManager implements CreditManager{
    @Override
    public abstract void calculate();

    @Override
    public void save() {
        System.out.println("Kaydedildi");
    }
}
