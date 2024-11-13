package currencies;

public abstract class ValueCurrency
{
    public final String Name;
    public final String Acronym;
    public final String Symbol;

    public ValueCurrency(String name, String acronym, String symbol) {
        Name = name;
        Acronym = acronym;
        Symbol = symbol;
    }

    public String getInfo() { return "Name: " + ", Symbol: " + Symbol; }
}