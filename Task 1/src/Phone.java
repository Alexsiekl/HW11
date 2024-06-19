public class Phone {
    static  String countryProd;
    int number;
    String model;
    double weight;

    public Phone () {}

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall (String name, long number) {
        System.out.println("Звонит абонент по имени " + name + (number == 0 ? "" : " номер " + number));
    }
    public void receoveCall (String name) {
        receiveCall(name, 0);
    }
}
