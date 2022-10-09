public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] baseCreditManager = new BaseCreditManager[]
                {new OgretmenKrediManager(), new TarımKrediManager(), new OgrenciCreditManager()};

        for (BaseCreditManager creditManager : baseCreditManager){
            System.out.println(creditManager.hesapla(1000));
        }
    }
}