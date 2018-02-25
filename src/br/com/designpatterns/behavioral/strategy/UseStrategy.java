package br.com.designpatterns.behavioral.strategy;

public class UseStrategy {

    public static void main(String[] args) {
        Item item = new Item("Zenfone 3", 99.5);

        FederalTax federalTax = new FederalTax();
        ProvincialTax provincialTax = new ProvincialTax();

        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.caculate(item, federalTax);
        taxCalculator.caculate(item, provincialTax);
    }
}
