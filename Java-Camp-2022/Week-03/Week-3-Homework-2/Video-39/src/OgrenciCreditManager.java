public class OgrenciCreditManager extends BaseCreditManager{
    @Override
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }
}
