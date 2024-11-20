import currencies.ValueCurrency;

import java.util.HashMap;

public class CurrencyManager
{
    private static CurrencyManager _instance;
    private static HashMap<ValueCurrency, Double> _currencies;

    private CurrencyManager()
    {
        _currencies = new HashMap<>();
    }

    public static CurrencyManager GetInstance()
    {
        if(_instance == null)
        {
            _instance = new CurrencyManager();
        }

        return _instance;
    }

    public HashMap<ValueCurrency, Double> GetCurrencies()
    {
        return _currencies;
    }

    public void GetInfo()
    {

    }
}