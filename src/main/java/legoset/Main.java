package legoset;

import album.Album;
import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;
import java.io.*;
import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet();
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setNumber("75211");
        legoSet.setYear(Year.parse("2018"));
        legoSet.setPieces(519);
        legoSet.setWeight(new Weight(0.89,"kg"));
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        Set<String> tags = new HashSet<String>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        legoSet.setTags(tags);
        List<Minifig> minifigs = new ArrayList<Minifig>();
        minifigs.add(new Minifig(2,"Imperial Mudtrooper"));
        minifigs.add(new Minifig(2,"Imperial Pilot"));
        minifigs.add(new Minifig(1,"Mimban Stormtrooper"));
        legoSet.setMinifigs(minifigs);

        JAXBHelper.toXML(legoSet, System.out);

        JAXBHelper.toXML(legoSet, new FileOutputStream("legoset.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoset.xml")));
    }
}
