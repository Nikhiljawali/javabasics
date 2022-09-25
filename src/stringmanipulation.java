import java.util.Locale;

public class stringmanipulation {
    public static void main(String[] args) {
        String name = "Nikhil";
        String lname = "Jawali";
        // To find length of a string
        System.out.println(name.length());
        // To capiatalize strigs
        System.out.println(name.toUpperCase());
        // TO smaller case
        System.out.println(name.toLowerCase());
        // To search a character by its position
        System.out.println(name.charAt(3));
        // To find the index number by the charcter
        System.out.println(name.indexOf("h"));
        // to comapre 2 strings
        if (name.compareTo(name)==0){
            System.out.println("strings are equal");

        } else {
            System.out.println("strings are not equal");
        }
        // comare using equal key word

        if (name.equals(lname)){
            System.out.println("name is equal");
        }else {
            System.out.println("names are not equal");
        }
        // giving strings in if condition
        if (new String("nikhil").equals(new String("jawali"))){
            System.out.println("ngiven names are same ");

        }else {
            System.out.println("given names are not same");
        }
        // Creating sub strings
        String sentence = " my name is nikhil jawali living in banglore";
        String sname= sentence.substring(12,18);
        String slanme= sentence.substring(19,25);
        String location = sentence.substring(35,sentence.length());
        System.out.println(sname+" "+slanme+" "+location);

    }
}
