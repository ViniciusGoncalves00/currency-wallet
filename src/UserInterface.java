import java.util.Scanner;

public class UserInterface
{
    private static UserInterface _instance;
    private final Scanner _scanner;

    private final String[] _mainOptions =
            {
                    "Exit.",
                    "Create a new wallet.",
                    "Create a new currency.",
                    "See existing wallets.",
                    "See existing currencies."
            };

    private final String[] _exitOptions =
            {
                    "Yes.",
                    "No.",
            };
    private final String[] _createWalletOptions =
            {
                    "0 - Return to main menu.",
                    "Insert wallet owner name:",
            };

    private UserInterface()
    {
        _scanner = new Scanner(System.in);

        for(int i = 0; i < _mainOptions.length; i++)
            _mainOptions[i] = i + " - " + _mainOptions[i];

        for(int i = 0; i < _exitOptions.length; i++)
            _exitOptions[i] = i + " - " + _exitOptions[i];
    }

    public static UserInterface GetInstance()
    {
        if(_instance == null)
        {
            _instance = new UserInterface();
        }

        return _instance;
    }

    public void NewInterface()
    {
        System.out.println("Welcome to your Currency Wallet!");

        Interface();
    }

    private void Interface()
    {
        var optionSelected = MainMenu();

        switch (optionSelected)
        {
            case 0:
                optionSelected = ExitMenu();
                break;
            case 1:
                CreateWalletMenu();
                break;
            case 2:
                CreateCurrencyMenu();
                break;
            case 3:
                SystemManager.GetInstance().walletManager.GetInfo();
                break;
            case 4:
                SystemManager.GetInstance().currencyManager.GetInfo();
                break;
            default:
                break;
        }

        if (optionSelected != 0)
            Interface();
    }

    private int MainMenu()
    {
        System.out.println("Please select an option:");
        for (String option : _mainOptions)
            System.out.println(option);

        return _scanner.nextInt();
    }

    private int ExitMenu()
    {
        System.out.println("You're sure?");
        for (String option : _exitOptions)
            System.out.println(option);

        var input = _scanner.nextInt();

        if (input != 0)
            DefaultMessage();

        return input;
    }

    private void CreateWalletMenu()
    {
        for (String option : _createWalletOptions)
            System.out.println(option);

        var input = _scanner.next();
        if (input.equals("0"))
        {
            System.out.println("Creation of an new wallet is cancelled.");
            DefaultMessage();
            return;
        }

        SystemManager.GetInstance().walletBuilder.CreateWallet(input);

        System.out.println("Wallet created!");
        DefaultMessage();
    }

    private void CreateCurrencyMenu()
    {

    }

    private void DefaultMessage()
    {
        System.out.println("Returning to main menu!");
    }
}