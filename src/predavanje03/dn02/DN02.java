package predavanje03.dn02;

public class DN02 {
  
    static void zvezdice(int n) {
      for (int k = 0; k<n; k++) {
        System.out.print("*");
      }
      System.out.println();      
    }
  
    public static void main (String [] args) {

        if (args.length == 0){
            System.out.println("Napaka pri uporabi programa!");
            System.exit(0);
        }
        
        // zgradimo niz z vsemi besedami
        String besede = "*";
        for (int j = 0;j<args.length; j++) {
            besede += " " + args[j];
        }
        besede += " *";

        // izpis zvezdic prve vrstice
        zvezdice(besede.length());
        // izpis vseh besed
        System.out.println(besede);
        // izpis zvezdic prve vrstice
        zvezdice(besede.length());   
    }
}

