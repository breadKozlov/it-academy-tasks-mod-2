package by.kozlov.entity;

import java.util.ArrayList;
import java.util.List;

public enum Theme {

    JAKARTA("JAKARTA",Link.getLinksOfTheme("JAKARTA")),
    MAVEN("MAVEN",Link.getLinksOfTheme("MAVEN")),
    SQL("SQL",Link.getLinksOfTheme("SQL")),
    DAO("DAO",Link.getLinksOfTheme("DAO")),
    HIBERNATE("HIBERNATE",Link.getLinksOfTheme("HIBERNATE")),
    SPRING("SPRING",Link.getLinksOfTheme("SPRING"));

    private String nameOfTheme;
    private List<Link> links = new ArrayList<>();

    Theme(String nameOfTheme) {
        this.nameOfTheme = nameOfTheme;
    }

    Theme(String nameOfTheme, List<Link> links) {
        this.nameOfTheme = nameOfTheme;
        this.links = links;
    }

    public String getNameOfTheme() {
        return nameOfTheme;
    }

    public void setNameOfTheme(String nameOfTheme) {
        this.nameOfTheme = nameOfTheme;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public static List<Theme> getThemes(String numberOfModule) {
        List<Theme> out = new ArrayList<>();
        switch (numberOfModule) {
            case "1" -> {out.add(JAKARTA);
                         out.add(MAVEN);}
            case "2" -> {out.add(SQL);
                         out.add(DAO);}
            case "3" -> {out.add(HIBERNATE);}
            default -> {out.add(SPRING);}
        }
        return out;
    }
}
