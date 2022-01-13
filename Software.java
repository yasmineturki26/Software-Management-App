
public class Software {
    private int id;
    private String name;
    private String license;

    public Software(int id, String name, String license) {
        this.id = id;
        this.name = name;
        this.license = license;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
    
    @Override
    public String toString() {
        return "ID= " + id + ", Name= " + name + ", Licence= " + license;
    }
    
    @Override
    public int hashCode() {
        return this.id;
    }
    
    @Override
    public boolean equals(Object obj) {
    
        if(!(obj instanceof Software))
            return false;
        boolean isEqual;
      
            isEqual = (this.id == ((Software) obj).id);
     
        return isEqual;
    }
}
