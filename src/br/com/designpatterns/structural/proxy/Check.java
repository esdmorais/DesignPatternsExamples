package br.com.designpatterns.structural.proxy;

public class Check implements Payable {

    private Money money;
    private String checkSign;
    private boolean verifySigning;

    public Check(Money money, String checkSign) {
        this.money = money;
        this.checkSign = checkSign;
    }

    public boolean verifySigning(String sign) {
        verifySigning = checkSign.equals(sign);
        return verifySigning;
    }

    @Override
    public void pay() {
        if (verifySigning) {
            this.money.pay();
            System.out.println("using check signed by " + checkSign + " to pay it");
        } else {
            System.out.println(checkSign + " signing is not valid to pay it");
        }
    }

}
