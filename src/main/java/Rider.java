public class Rider {
    public String getRytterNavn() {
        return rytterNavn;
    }

    public String getHoldNavn() {
        return holdNavn;
    }

    private String rytterNavn;
    private String holdNavn;

public Rider(String rytterNavn, String holdNavn){
    this.rytterNavn = rytterNavn;
    this.holdNavn = holdNavn;
}
}
