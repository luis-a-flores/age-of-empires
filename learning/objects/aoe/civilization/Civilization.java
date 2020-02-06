package learning.objects.aoe.civilization;



public class Civilization
{
    private String architecture;
    private String specility;
    private String uniqueUnity;
    private String uniqueTechnology;
    private Civilizations type;

    public Civilization(Civilizations type)
    {
       this.type=type;
    }

    public void setArchitecture(String architecture){
        this.architecture=architecture;
    }
   
    public void setSpecility(String specility){
        this.specility=specility;
    }
    
    public void setUniqueUnity(String uniqueUnity){
        this.uniqueUnity=uniqueUnity;
    }
    
    public void setUniqueTechnology(String uniqueTechnology){
        this.uniqueTechnology=uniqueTechnology;
    }
    
    public String getArchitecture(){
        return architecture;
    }
    
    public String getSpecility(){
        return specility;
    }
    
    public String getUniqueUnity(){
        return uniqueUnity;
    }
    
    public String getUniqueTechnology(){
        return uniqueTechnology;
    }
}
