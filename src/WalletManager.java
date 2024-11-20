import java.util.ArrayList;

public class WalletManager
{
    private static WalletManager _instance;
    private static ArrayList<Wallet> _wallets;

    private WalletManager()
    {
        _wallets = new ArrayList<>();
    }

    public static WalletManager GetInstance()
    {
        if(_instance == null)
        {
            _instance = new WalletManager();
        }

        return _instance;
    }

    public ArrayList<Wallet> GetWallets()
    {
        return _wallets;
    }

    public void GetInfo()
    {

    }
}