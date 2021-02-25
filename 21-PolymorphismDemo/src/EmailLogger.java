public class EmailLogger extends BaseLogger{

    public void log(String message){
        System.out.println("Logged to email : " + message);
    }
}

// extends etmemize rağmen burdada aynı parametreyi alan ayrı şeyler
// yazdıran metotlar tanımladık bu işleme overwrite deniyor