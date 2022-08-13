package Ibstanceof;

public class Bird extends Animal {
    String name;

    public Bird(){
    }
    public Bird(String color, String name) {
        super(color);
        this.name = name;
    }

    public void show()
    {
        System.out.println("Bird");
    }
}
