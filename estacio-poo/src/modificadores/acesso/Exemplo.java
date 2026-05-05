package modificadores.acesso;

public class Exemplo {
    private static String name;
    private int x;

    public void add(int x){
        this.x += x;
    }
    public void add(int x, int y){
        this.x += (x + y);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =  name;
    }
    public Exemplo() {
    }
    public Exemplo(String name) {
        this.name = name;
    }
}
