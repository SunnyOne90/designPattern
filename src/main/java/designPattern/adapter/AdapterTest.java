package designPattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        powerAdapter.outPutDC5V();
    }
}
