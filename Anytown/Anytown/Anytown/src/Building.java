public class Building {

    private static int numBuildings = 0;
    private String address;
    private String owner;

    public Building() {
        this.address = "";
        this.owner = "";
       numBuildings++;
    }

    public Building(String address, String owner) {
       this.address = address;
       this.owner = owner;
       numBuildings++;
    }

    public String getAddress() {
       return this.address;
    }

    public void setAddress(String address) {
       this.address = address;
    }

    public String getOwner() {
       return this.owner;
    }

    public void setOwner(String owner) {
       this.owner = owner;
    }

    public static int getNumBuildings() {
       return numBuildings;
    }

    @Override
    public boolean equals(Object obj) {
       if (this == obj) {
           return true;
       }
       if (!(obj instanceof Building)) {
           return false;
       }
       Building other = (Building) obj;
       return this.address.equals(other.address) && this.owner.equals(other.owner);
    }

    @Override
    public int hashCode() {
       return 31 * this.address.hashCode() + this.owner.hashCode();
    }

    public String toString() {
       return this.address + " occupied by " + this.owner;
    }

    public static void main(String[] args) {
       Building b1 = new Building();
       Building b2 = new Building("27 Main Street", "Rex Dog Groomer");
       Building b3 = new Building("18 Low Street", "Mary Jones");

       b1.setAddress("3 High Street");
       b1.setOwner("Smith's Newsagent");

       System.out.println(b1);
       System.out.println(b2);
       System.out.println(b3);

       System.out.println(b1.getAddress());
       System.out.println(b1.getOwner());
    }
}