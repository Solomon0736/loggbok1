public class Lista {
    private String användernamn;
    private double datum;

public Lista() {
        användernamn = "solomontikabocom";
        datum= 2020/2/18;
        }

    public String getAnvändernamn() {
        return användernamn;
    }

    public void setAnvändernamn(String användernamn) {
        this.användernamn = användernamn;
    }

    public double getDatum() {
        return datum;
    }

    public void setDatum(int datum) {
        this.datum = datum;
    }
}