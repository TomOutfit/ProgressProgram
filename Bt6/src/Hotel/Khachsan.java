package Hotel;

public class Khachsan extends Nguoi {
    private int Songaythue;
    private String Loaiphong;

    public Khachsan(String CMND, String Hoten, Integer Tuoi, int songaythue, String loaiphong) {
        super(CMND, Hoten, Tuoi);
        this.Songaythue = songaythue;
        this.Loaiphong = loaiphong;
    }

    public int getSongaythue() {
        return Songaythue;
    }

    public void setSongaythue(int songaythue) {
        Songaythue = songaythue;
    }

    public String getLoaiphong() {
        return Loaiphong;
    }

    public void setLoaiphong(String loaiphong) {
        Loaiphong = loaiphong;
    }

    @Override
    public String toString() {
        return "Khachsan [Hoten=" + Hoten + ", Songaythue=" + Songaythue + ", Tuoi=" + Tuoi + ", Loaiphong=" + Loaiphong
                + ", CMND=" + CMND + "]";
    }       
}