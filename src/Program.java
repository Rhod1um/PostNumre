import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
  private List<By> byer;

  Program (){
    byer = new ArrayList<>();
  }

  public void askCity(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Indtast postnummer: ");
    String input = sc.nextLine();
    searchCities(input);
  }

  public void searchCities(String input){
    String byNavn=null;
    for (By by : byer){
      if (byer.contains(by.getPostnummer())){
        byNavn = by.getByNavn();
      }
      else System.out.println("intet sådant postnummer. ");
    }
    System.out.println(byNavn);
  }

  public void loadCitiesFile() {
    try {
      Scanner sc = new Scanner(new File("csvFil/danske-postnumre-byer-ny.csv"));
      sc.useDelimiter(";|\n");
      while(sc.hasNext()){
        String postNummer = sc.next();
        String byNavn = sc.next();

        By by = new By(postNummer, byNavn);
        byer.add(by);
        }
      } catch(FileNotFoundException e){
      System.out.println(e);
    }
  }
}
