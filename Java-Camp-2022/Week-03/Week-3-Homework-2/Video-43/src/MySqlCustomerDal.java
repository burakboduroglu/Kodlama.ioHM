public class MySqlCustomerDal implements ICustomerDal, Irepository{
    @Override
    public void add() {
        System.out.println("My sql eklendi");
    }
}
