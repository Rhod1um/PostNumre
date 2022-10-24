public class By {
  private String postnummer;
  private String byNavn;

  public By(String postnummer, String by) {
    this.postnummer = postnummer;
    this.byNavn = by;
  }

  public String getPostnummer() {
    return postnummer;
  }

  public void setPostnummer(String postnummer) {
    this.postnummer = postnummer;
  }

  public String getByNavn() {
    return byNavn;
  }

  public void setByNavn(String byNavn) {
    this.byNavn = byNavn;
  }

  @Override
  public String toString() {
    return byNavn + " " + postnummer + ". ";
  }
}
