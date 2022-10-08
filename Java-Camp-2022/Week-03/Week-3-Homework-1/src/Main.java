public class Main {
    public static void main(String[] args) {
        /*
        *Değer Tipleri*
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println("değer tiplerde sonuç : " + sayi1);

		*Referans Tipleri*
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 10, 20, 30 };
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		System.out.println("referans tiplerde sonuç : " + sayilar1[0]);
        */

        /*
        *Class Kavramı*
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer(); //örneğini oluşturmak, instance oluşturmak, instance creation
        customer.id = 1;
        customer.city = "City-1";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.taxNumber = "100000";
        company.companyName = "Şirket Adı";
        company.id = 100;

        CustomerManager customerManager2 = new CustomerManager(new Person());

        Person person = new Person();
        person.firstName = "";
        person.nationalIdentity = "";

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
        */

        // IoC Container
        CustomerManager customerManager = new CustomerManager(new Customer(),new CarCreditManager());
        customerManager.giveCredit();
        customerManager.save();
    }
}