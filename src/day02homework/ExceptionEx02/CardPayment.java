package day02homework.ExceptionEx02;

public class CardPayment extends Payment{
    private String cardNumber;
    private String cardPassword;
    private int monthlyInstallment;

    public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) {
        super(shopName, productName, productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }

    @Override
    public void pay() throws PayException {
        if(super.productPrice <= 0 || this.monthlyInstallment <0){
            throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
        }
    }

    @Override
    public String toString() {
        return "신용카드가 정상적으로 지불되었습니다.\n" +
                "[ 신용카드 결제 정보 }" +
                "\n상점명 : " + super.shopName +
                "\n상품명 : " + super.productName +
                "\n상품가격 : " + super.productPrice +
                "\n신용카드번호 : " + this.cardNumber +
                "\n항부개월 : " + this.monthlyInstallment;

    }
}
