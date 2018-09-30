
public class SalesReport {

    private int id;
    private String address;
    private String name;

    public static void main(String[] args) {
        SalesReport salesReport = new SalesReport(10, "Jiit Noida, Sector 62", "Shivam Bhasin");
        JsonDisplay.showJSON(salesReport);
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
