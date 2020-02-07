package learning.objects.aoe.player;
import learning.objects.aoe.civilization.*;


public class Player
{
    private String name;
    private Civilization civilizationType;
    
    public Player(String name)
    {
        this.name=name;
    }

    public void setName(String Name)
    {
        this.name=name;
    }
    
    public void setCivilization(Civilization civilizationType)
    {
        this.civilizationType=civilizationType;
    }
    
    public String getName()
    {
        return name;
    }
}
