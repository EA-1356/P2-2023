package predavanje03.dn02;

public class DN02a {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Napaka pri uporabi programa!");
        } else {
          //c ustvarim niz z vsemi besedami  
          String a = String.join(" ", args);
            int dolzina = a.length() + 4;
            
            // ustvarim niz z zvezdicami
            String obroba = "*".repeat(dolzina);
            
            System.out.println(obroba);
            System.out.println("* " + a + " *");
            System.out.println(obroba);
        }
    }
}

