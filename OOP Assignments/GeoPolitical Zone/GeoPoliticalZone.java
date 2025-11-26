public enum GeoPoliticalZone {
    NORTHCENTRAL ("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST("Kaduna", "Kano", "Katsina", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTHSOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTHWEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"),
    SOUTHEAST("Abia","Anambra","Ebonyi","Enugu","Imo");

    GeoPoliticalZone(String... states){
        this.states = states;
    }
    private String[] states;
    public String[] getStates(){
        return states;
    }
    public void setStates(String[] states){
        this.states = states;
    }
}