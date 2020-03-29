package com.softserve.edu.hw6;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task1ListEquals {

    public static void main(String[] args) {

        Set<Screecher> mine = new TreeSet<>(new Screecher.NameComparator());

        mine.add(new Screecher("h2octane"));
        mine.add(new Screecher("monkeyrange"));
        mine.add(new Screecher("sparkbug"));
        mine.add(new Screecher("rattlecat"));
        mine.add(new Screecher("nightbite"));
        mine.add(new Screecher("shtormhorn"));
        mine.add(new Screecher("crocshok"));

        System.out.println("Mine list of screechers:");
        System.out.println(mine);

        Set<Screecher> friends = new TreeSet<>(new Screecher.NameComparator());
        // Set<Student> set = new TreeSet<>();
        friends.add(new Screecher("gatekeeper"));
        friends.add(new Screecher("knightvision"));
        friends.add(new Screecher("jayhawk"));
        friends.add(new Screecher("nightweaver"));
        friends.add(new Screecher("spikestripe"));
        friends.add(new Screecher("crocshok"));
        friends.add(new Screecher("nightbite"));


        System.out.println("My friend's list of screechers:");
        System.out.println(friends);

        System.out.println("Here is list of duplicate screechers:");
        List<Screecher> SameScreechers = new ArrayList<>(friends);
        SameScreechers.retainAll(mine);
        System.out.println(SameScreechers);



    }
}
