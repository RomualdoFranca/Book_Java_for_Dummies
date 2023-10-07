public class UseAccount {
    public static void main(String[] args) {

        // creating objects
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.name = "Romualdo";
        myAccount.address = "R: Olinda, N° 33, Igarassu";
        myAccount.balance = 1000.00;
        myAccount.display();
        // pode se inserir o valor do parametro usado numero
        System.out.println("My Interest per month: R$" + myAccount.getInterest(1.3));


        yourAccount.name = "Lua";
        yourAccount.address = "R: das casas, N° 0, Lugar nenhum";
        yourAccount.balance = 1500.00;
        double yourInterest = 5.00;
        // pode se inserir o valor do paramentro usando uma variavel
        System.out.println("Your Interest per month: R$" + myAccount.getInterest(yourInterest));








    }
}
