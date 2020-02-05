package learning.objects;

import learning.objects.aoe.civilization.Civilization;
import learning.objects.aoe.civilization.Civilizations;

import learning.objects.aoe.player.Player;

import learning.objects.aoe.game.map.Map;
import learning.objects.aoe.game.map.Size;
import learning.objects.aoe.game.map.Type;

public class Main{
    
    public static void main(String []args){
        Civilization bizantinos = new Civilization(Civilizations.BIZANTINOS);
        Civilization celtas = new Civilization(Civilizations.CELTAS);
        
        bizantinos.setArchitecture("Mediterranea");
        bizantinos.setSpecility("Defensa");
        bizantinos.setUniqueUnity("Catafracta");
        bizantinos.setUniqueTechnology("Fuego griego");
        
        celtas.setArchitecture("Europa Occidental");
        celtas.setSpecility(" Infantería y armas de asedio");
        celtas.setUniqueUnity("Invasor de pastos");
        celtas.setUniqueTechnology("Bastión");
        
        Player player1 = new Player();
        
        player1.setName("Erick");
        player1.setCivilization(bizantinos);
        
        Player player2 = new Player();
        
        player2.setName("computer");
        player2.setCivilization(celtas);
        
        Map map = new Map(Size.GIANT, Type.FOREST);
        
        map.addPlayer(player1);
        map.addPlayer(player2);
        
        map.start();
    }
}
