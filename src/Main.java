public class Main {

  public void go(){
    Program program = new Program();
    program.loadCitiesFile();
    program.askCity();
  }

  public static void main(String[] args) {
    new Main().go();
  }
}