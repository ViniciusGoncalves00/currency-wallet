import currencies.ValueCurrency;

import java.util.HashMap;

public class Wallet
{
    public final int ID;
    public final String Owner;
    public final HashMap<ValueCurrency, Double> Currencies;

    public Wallet(int id, String owner)
    {
        ID = id;
        Owner = owner;
        Currencies = new HashMap<>();
    }

    public String getInfo()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Owner: ").append(Owner).append("\n");

        for (ValueCurrency currency : Currencies.keySet())
        {
            builder.append(currency.Name)
                    .append(": ")
                    .append(currency.Symbol)
                    .append(" ")
                    .append(Currencies.get(currency))
                    .append("\n");
        }

        return builder.toString();
    }

    public void Add(ValueCurrency currency, double amount)
    {
        if (Currencies.containsKey(currency))
        {
            double currentAmount = Currencies.get(currency);
            Currencies.put(currency, currentAmount + amount);
        }
        else
        {
            Currencies.put(currency, amount);
        }
    }
}