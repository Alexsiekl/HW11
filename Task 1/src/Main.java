public class Main {
    public static void main(String[] args) {
Phone.countryProd = "China";
Phone tel1 = new Phone();
tel1.receiveCall("Алексей", 8_911_888_01_76L);
Phone tel2 = new Phone(258, "Xiomi", 241.3);
tel2.receiveCall("Alex", 8_911_370_16_14L);
    }
}
