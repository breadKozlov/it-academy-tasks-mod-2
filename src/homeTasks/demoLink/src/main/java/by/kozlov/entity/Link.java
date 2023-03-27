package by.kozlov.entity;

import java.util.ArrayList;
import java.util.List;

public class Link {

    private String description;
    private String link;

    public Link(String description, String link) {
        this.description = description;
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static List<Link> getLinksOfTheme(String nameOfTheme) {
        List<Link> links = new ArrayList<>();
        switch (nameOfTheme) {
            case "JAKARTA" -> links.add(new Link("Download Jakarta","..."));
            case "MAVEN" -> {links.add(new Link("Download Maven","..."));
                             links.add(new Link("Manual Maven","..."));}
            case "SQL" -> {links.add(new Link("Download Sql",".../"));}
            case "DAO" -> {links.add(new Link("Download Dao","../.."));}
            case "HIBERNATE" -> {links.add(new Link("Download Hibernate","....."));
                links.add(new Link("Manual here","..."));}
            default -> {{links.add(new Link("Download Spring","..."));
                links.add(new Link("Manual here","..."));}}
        }
        return links;
    }
}
