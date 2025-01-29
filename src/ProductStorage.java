public class ProductStorage {
    String ItemName;
    int ItemPrice;
    String payMethod;
    Boolean pay;

    public  ProductStorage(String ItemName, int ItemPrice, String payMethod) {
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.payMethod = payMethod;
        this.pay = false;
    }
}
