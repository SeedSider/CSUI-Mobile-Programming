package id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld;

public class nameTitle {
    String getTitle(String name) {
        String title;
        if(name.length()%2 == 0) {
            title = "the Crewmate";
        }
        else {
            title = "the Impostor";
        }
        return title;
    }
}
