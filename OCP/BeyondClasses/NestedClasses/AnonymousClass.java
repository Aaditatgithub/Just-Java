public class AnonymousClass{

    abstract class SaleOnlyToday{
        abstract int dollarOff();
    }

    public int admission(int baseprice){
        // Anonymous class must require an existing class or interface
        SaleOnlyToday sale = new SaleOnlyToday() {
            int dollarOff() {return 10;}
        };
        return baseprice - sale.dollarOff();
    }

    public static void main(String[] args) {
        AnonymousClass any = new AnonymousClass();
        System.out.println("new price of admission: " + any.admission(200));
    }
}