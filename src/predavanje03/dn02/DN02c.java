package predavanje03.dn02;


class DN02b {
    public static void main(String[] args){
        if(args.length != 0){
            String message = args[0];
            for(int i = 1; i < args.length; i++)
                message += " " + args[i];
            String lineOfStars = "";
            for(int i = 0; i < message.length() + 4; i++)
                lineOfStars += "*";
            System.out.println(lineOfStars);
            System.out.println("* " + message + " *");
            System.out.println(lineOfStars);
        }
        else{
            System.out.println("Napaka pri uporabi programa!");
        }
    
    }
}

