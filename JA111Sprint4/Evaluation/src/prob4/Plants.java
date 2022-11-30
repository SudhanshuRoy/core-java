package prob4;

public class Plants {
    private String nameOfPlant;
    private Integer priceOfPlant;

    public Plants(String nameOfPlant, Integer priceOfPlant) {
        this.nameOfPlant = nameOfPlant;
        this.priceOfPlant = priceOfPlant;
    }

    public String getNameOfPlant() {
        return nameOfPlant;
    }

    public void setNameOfPlant(String nameOfPlant) {
        this.nameOfPlant = nameOfPlant;
    }

    public Integer getPriceOfPlant() {
        return priceOfPlant;
    }

    public void setPriceOfPlant(Integer priceOfPlant) {
        this.priceOfPlant = priceOfPlant;
    }

    @Override
    public String toString() {
        return "{" +
                "Name: " + nameOfPlant + '\'' +
                ", price: " + priceOfPlant +
                '}';
    }
}
