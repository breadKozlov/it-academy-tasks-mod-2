package by.kozlov.entity;

import java.util.ArrayList;
import java.util.List;

public enum Modules {

    MODULE1("MODULE_1",Theme.getThemes("1")),
    MODULE2("MODULE_2",Theme.getThemes("2")),
    MODULE3("MODULE_3",Theme.getThemes("3")),
    MODULE4("MODULE_4",Theme.getThemes("4"));

    private String nameOfModule;
    private List<Theme> themesOfModule = new ArrayList<>();

    Modules(String nameOfModule) {
        this.nameOfModule = nameOfModule;
    }

    Modules(String nameOfModule, List<Theme> themesOfModule) {
        this.nameOfModule = nameOfModule;
        this.themesOfModule = themesOfModule;
    }

    public String getNameOfModule() {
        return nameOfModule;
    }

    public void setNameOfModule(String nameOfModule) {
        this.nameOfModule = nameOfModule;
    }

    public List<Theme> getThemesOfModule() {
        return themesOfModule;
    }

    public void setThemesOfModule(List<Theme> themesOfModule) {
        this.themesOfModule = themesOfModule;
    }
}
