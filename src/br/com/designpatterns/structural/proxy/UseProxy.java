package br.com.designpatterns.structural.proxy;

public class UseProxy {
    public static void main(String[] args) {
        Money money = new Money(150);
        money.pay();

        Check rossCheck = new Check(new Money(369), "Ross Geller");
        rossCheck.verifySigning("Ross-A-Tron");
        rossCheck.pay();

        Check phoebeCheck = new Check(new Money(517), "Phoebe Buffay");
        phoebeCheck.verifySigning("Phoebe Buffay");
        phoebeCheck.pay();
    }
}
