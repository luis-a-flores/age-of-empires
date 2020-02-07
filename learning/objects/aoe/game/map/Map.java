package learning.objects.aoe.game.map;
import learning.objects.aoe.player.*;
import learning.objects.aoe.civilization.*;
import learning.objects.aoe.game.map.*;

public class Map
{
    private Size size;
    private Type type;
    private Player player;
    private Civilization civilization;
    public Map(Size size,Type type)
    {
        this.size=size;
        this.type=type;
    }
    
    public void addPlayer(Player player)
    {
        this.player=player;
    }
    
    public void setCivilization(Civilization civilization)
    {
        this.civilization=civilization;
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
        System.out.println("Cargando mapa "+ getSize() + "de tipo "+ getType()+"...listo");
        System.out.println("Cargando jugador"+ player.getName());
        System.out.println("Civilizacion: "+ civilization.getCivilization());
        System.out.println("Arquitectura: "+ civilization.getArchitecture());
        System.out.println("Especialidad: "+ civilization.getSpecility());
        System.out.println("Unidad Unica: "+ civilization.getUniqueUnity());
        System.out.println("Tecnologia Unica: "+ civilization.getUniqueTechnology());
    }
    
        
    
}
