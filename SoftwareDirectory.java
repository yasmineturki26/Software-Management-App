
import java.util.*;

public class SoftwareDirectory {
    
    private ArrayList<Software> L;
    
    public SoftwareDirectory() {
        L = new ArrayList<Software>();
    }
    
    public void addSoftware(Software x)
    {
        L.add(x);
    }
    
    public boolean SoftwareExist(Software x) {
        return L.contains(x);
    }
    
    public int GetNbNonFreeSoft() {
        int n=0;
        for(int i=0; i<L.size(); i++)
        {
            if(L.get(i) instanceof NonFreeSoftware)
                n++;
        }
        return n;
    }
    
   public String toString() {
        return L.toString();
}
}
