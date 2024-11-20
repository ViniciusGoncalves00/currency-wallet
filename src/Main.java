public class Main {
    public static void main(String[] args)
    {
        System.out.println("Initializing...");
        var systemManager = SystemManager.GetInstance();
        systemManager.userInterface.NewInterface();
        System.out.println("Finishing...");
    }

//        ValueCurrency real = currencyBuilder.CreateCurrency("Real", "BRL", "R$", 0.17);
//        ValueCurrency dollar = currencyBuilder.CreateCurrency("Dollar", "USD", "$", 1);
//        ValueCurrency euro = currencyBuilder.CreateCurrency("Euro", "", "€", 1.07);
//
//        Wallet wallet = new Wallet("Vinicius");
//        wallet.Add(real, 1412);
//        wallet.Add(dollar, 11.09);
//        wallet.Add(euro, 19.45);
//
//        System.out.println(wallet.getInfo());
//
//        System.out.println(converter.Convert(wallet, real));
//        System.out.println(converter.Convert(wallet, dollar));
//        System.out.println(converter.Convert(wallet, euro));
//    }
}