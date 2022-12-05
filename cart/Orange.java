package cart;

public class Orange extends Item{

    private String type;
    
    public Orange() {
        super("c-orange", "Orange");
    }
    public Orange(String name, String code){
        super(code, name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
}

}
