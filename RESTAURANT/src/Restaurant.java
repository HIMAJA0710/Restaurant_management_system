
public class Restaurant {
    private String rname;   
    private String rlocation;

    public Restaurant(){

    }

    public String getNameLocation() {
        return rname + ", " + rlocation;
    }

    public void setNameLocation(String rname, String rlocation) {
        this.rname = rname;
        this.rlocation = rlocation;
    }
}