package com.softserve.edu.hw6;
import java.util.Comparator;


public class Screecher { //screecher is a toy for boys :)
    public static class NameComparator implements Comparator<Screecher> {
        public int compare(Screecher s1, Screecher s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

    private String name;

    public Screecher(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Screecher name is " + name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object screecher) {
        if (this == screecher)
            return true;
        if (screecher == null)
            return false;
        if (getClass() != screecher.getClass())
            return false;
        Screecher friends_one = (Screecher) screecher;
        if (name == null) {
            if (friends_one.name != null)
                return false;
        } else if (!name.equals(friends_one.name))
            return false;
        return true;
    }
}
