package cart;

public class Apple extends Item {

    private String type;

    //overloaded constructors
    public Apple(){
        super("apple", "Apple");
    }
    public Apple(String name, String code){
        super(code, name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
}
