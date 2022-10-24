package transport;

import java.util.ArrayList;

public class Sponsor {
    private String sponsorName;
    private int sponsorGrand;

    private ArrayList<Transport> transports;



    public Sponsor(String sponsorName, int sponsorGrand) {
        setSponsorName(sponsorName);
        setSponsorGrand(sponsorGrand);
    }

    public void sponsorCompeting() {
        System.out.println("Организовать соревнования.");
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        if (sponsorName != null && !sponsorName.isEmpty() && !sponsorName.isBlank()) {
            this.sponsorName = sponsorName;
        } else {
            System.out.println("Укажите название человека или компании.");

        }
    }

    public int getSponsorGrand() {
        return sponsorGrand;
    }

    public void setSponsorGrand(int sponsorGrand) {
        if (sponsorGrand > 0) {
            this.sponsorGrand = sponsorGrand;
        } else {
            System.out.println("Укажите объём гранда.");
        }
    }
}
