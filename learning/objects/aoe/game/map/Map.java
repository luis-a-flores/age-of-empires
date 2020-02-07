package learning.objects.aoe.game.map;
import learning.objects.aoe.player.*;
import learning.objects.aoe.civilization.*;
import learning.objects.aoe.game.map.*;

public class Map
{
    private Size size;
    private Type type;
    private Player player;
    
    public Map(Size size,Type type)
    {
        this.size=size;
        this.type=type;
    }
    
    public void addPlayer(Player player)
    {
        this.player=player;
    }
    
    public Size getSize()
    {
        return size;
    }
    
    public Type getType()
    { 
        return type;
    }
    
    public void start()
    {
        System.out.println("cargando mapa "+ getSize() + "de tipo "+ getType()+"...listo");
        System.out.println("cargando jugador"+ player.getName());
    }
    
        
    
}
