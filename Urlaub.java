public class Urlaub
{
    private String ort;
    private int preis;
    private boolean allInclusive;
    private boolean lastMinute;
    
    public String getOrt()
    {
        return ort;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public boolean getAllInclusive()
    {
        return allInclusive;
    }
    
    public void setOrt(String neuOrt)
    {
        ort = neuOrt;
    }
    
    public void setPreis(int neuPreis)
    {
        preis = neuPreis;
    }
    
    public void setAllInclusive(boolean neuAllInclusive)
    {
        allInclusive = neuAllInclusive;
    }
}




