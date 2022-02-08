public class Car {
    private String model;
    private int miles;
    public Car(String model, int miles)
    {
        this.model = model;
        this.miles = miles;
    }

    public String toString()
    {
        String str = model + " " + miles + "mi";
        return str;
    }

}
