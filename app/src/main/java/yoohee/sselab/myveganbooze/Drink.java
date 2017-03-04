package yoohee.sselab.myveganbooze;

/**
 * Created by sec on 2017-03-04.
 */

public class Drink {
    private String name;
    private Country country;
    private boolean veganFriendly;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public boolean isVeganFriendly() {
        return veganFriendly;
    }

    public void setVeganFriendly(boolean veganFriendly) {
        this.veganFriendly = veganFriendly;
    }

    public  Drink(){
        this.name="null";
        this.country = Country.ETC;
        this.veganFriendly = false;
    }

    public Drink(String name, Country country, boolean friendly){
        this.name = name;
        this.country = country;
        this.veganFriendly = friendly;
    }

}
