
public class Nba {

    private String conference;
    private String division;


    public Nba(){
        conference = "empty";
        division = "empty";
    }
    //Constructor with parameters
    public Nba(String conference, String division){
        this.conference = conference;
        this.division = division;
    }

    //Accessor method
    public String getConference(){
        return conference;
    }

    //Accessor method
    public String getDivision(){
        return division;
    }

    public String randomConference(){
        int ran = (int) (Math.random() * 2) + 1;
        if(ran == 1){
            return "Western Conference";
        }
        else{
            return "Eastern Conference";
        }
    }

    //Gives you a random Divison
    public String randomDivision(){
        int ran = (int) (Math.random() * 6) + 1;
        if(ran == 1){
            return "Northwest Division";
        }
        else if (ran==2){
            return "Pacific Division";
        }
        else if(ran==3){
            return "Southwest Division";
        }
        else if(ran==4){
            return "Atlantic Division";
        }
        else if(ran==5){
            return "Central Division";
        }
        else{
            return "Southeast Division";
        }
    }

    public boolean equals(Nba x){
        if (conference.equals(x.conference)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "Part of the " + conference + " and " + division + ".";
    }

}
