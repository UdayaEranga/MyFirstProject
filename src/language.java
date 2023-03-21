public class language {
    String languages;
    language(String a){
        languages = a;
        System.out.println(languages + "is language ");
    }

    public static void main(String[] args) {
        language l = new language("Sinhala");
        language l1 = new language("English");
        language l2 = new language("Tamil");
    }
}

