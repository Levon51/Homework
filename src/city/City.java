package city;
/**
 * 4.	Սահմանել City class : instance fields (char code , int  population ) .
 * Ստեղծել  main method -ում  object ներ yerevan, moscow, new york , paris
 * քաղաքները  համապատասխան  code - քաղաքի անվան առաջին տառ,  population մարդաքանակով ։
 */
public class City {
    public char code;
    public int population;

       public City() {

            }

        public void printPopulationCode(){
           System.out.println(code);
           System.out.println(population);
        }


            public static void main(String[] args) {
            City y = new City();
           y.code = 'Y';
           y.population = 1000000;
           y.printPopulationCode();
           City m = new City();
           m.code = 'M';
           m.population = 12000000;
           m.printPopulationCode();
           City n = new City();
           n.code = 'N';
           n.population = 8175133;
           n.printPopulationCode();
           City p = new City();
           p.code = 'P';
           p.population = 2148000;
           p.printPopulationCode();










        }

}
