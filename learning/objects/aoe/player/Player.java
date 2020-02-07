package learning.objects.aoe.player;
import learning.objects.aoe.civilization.*;


public class Player
{
    private String name;
    private Civilization civilization;
    
    public Player()
    {
    
    }

    public void setName(String Name)
    {
        this.name=name;
    }
    
    public void setCivilization(Civilization civilization)
    {
        this.civilization=civilization;
    }
    
    public String getName()
    {
        return name;
    }
    
    
}
