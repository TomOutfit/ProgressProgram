package Hotel;

public class Nguoi {
    
protected String Hoten;
protected int Tuoi;
protected String CMND;

    public Nguoi(String CMND, String Hoten, Integer Tuoi) {
        this.CMND = CMND;
        this.Hoten = Hoten;
        this.Tuoi = Tuoi;
    }

public String getHoten() {
    return Hoten;
}
public void setHoten(String hoten) {
    Hoten = hoten;
}
public Integer getTuoi() {
    return Tuoi;
}
public void setTuoi(Integer tuoi) {
    Tuoi = tuoi;
}
public String getCMND() {
    return CMND;
}
public void setCMND(String cMND) {
    CMND = cMND;
}
@Override
public String toString() {
    return "Nguoi [Hoten=" + Hoten + ", Tuoi=" + Tuoi + ", CMND=" + CMND + "]";
}
}