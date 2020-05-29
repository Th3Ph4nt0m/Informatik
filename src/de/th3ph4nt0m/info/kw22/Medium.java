package de.th3ph4nt0m.info.kw22;

@SuppressWarnings ("SpellCheckingInspection") public class Medium
{
    private final int erscheinungsjahr;
    private String urheber;

    public Medium(int erscheinungsjahr, String urheber){
        this.erscheinungsjahr = erscheinungsjahr;
        this.urheber = urheber;
    }

    public String getUrheber()
    {
        return urheber;
    }

    public int getErscheinungsjahr()
    {
        return erscheinungsjahr;
    }

    protected void setUrheber(String urheber)
    {
        this.urheber = urheber;
    }
}
