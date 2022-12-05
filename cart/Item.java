package cart;

public class Item{

        private String name;
        private String code;
        private Float price = 0f;
        private Integer quantity = 0;

        //define custom constructor
        public Item(String code, String name){
            this.code = code;
            this.name = name;
        }
        
        //getters and setterss
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public Float getPrice() {
            return price;
        }
        public void setPrice(Float price) {
            this.price = price;
        }
        public Integer getQuantity() {
            return quantity;
        }
        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        //behaviour methods
        public Float totalCost(){
          Float cost = this.quantity * this.price;
          return cost;  
        }
    }
    
