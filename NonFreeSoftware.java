
public class NonFreeSoftware extends Software{
    private int price;
    
    public NonFreeSoftware(int id, String name, String license, int price) {
        super(id, name, license);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Price= " + price;
}
}
