import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SalesReport {

    private int id;
    private String address;
    private String name;

    public static void main(String[] args) {
        SalesReport salesReport = new SalesReport(10, "Jiit Noida", "Shivam Bhasin");
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(salesReport);
        System.out.println(json);
    }

    public SalesReport(int id, String address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

}
