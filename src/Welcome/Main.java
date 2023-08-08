package Welcome;
public class Main {
    public static void main(String[] args) {
        idioma("english");
    }
    public static String idioma(String lengua) {
        String saludo;
        switch (lengua) {
            case "english":
                saludo = "Welcome";
                break;
            case "czech":
                saludo = "Vitejte";
                break;
            case "danish":
                saludo = "Velkomst";
                break;
            case "dutch":
                saludo = "Welkom";
                break;
            case "estonian":
                saludo = "Tere tulemast";
                break;
            case "finnish":
                saludo = "Tervetuloa";
                break;
            case "flemish":
                saludo = "Welgekomen";
                break;
            case "french":
                saludo = "Bienvenue";
                break;
            case "german":
                saludo = "Willkommen";
                break;
            case "irish":
                saludo = "Failte";
                break;
            case "italian":
                saludo = "Benvenuto";
                break;
            case "latvian":
                saludo = "Gaidits";
                break;
            case "lithuanian":
                saludo = "Laukiamas";
                break;
            case "polish":
                saludo = "Witamy";
                break;
            case "spanish":
                saludo = "Bienvenido";
                break;
            case "swedish":
                saludo = "Valkommen";
                break;
            case "welsh":
                saludo = "Croeso";
                break;
            default:
                saludo = "Welcome";
        }
        System.out.println(saludo);
        return saludo;
    }
}
