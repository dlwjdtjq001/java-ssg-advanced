package day02homework.Exception.ex02;

public abstract class Payment implements Payable{
    protected String shopName;
    protected String productName;
    protected long productPrice;

    public Payment(String shopName, String productName, long productPrice) {
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    // Payable 구현은 CardPayment, CashPayment 에서 한다.
}
