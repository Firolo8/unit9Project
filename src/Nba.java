public class Nba {

    private String conference;
    private String division;


    public Nba(){
        conference = "empty";
        division = "empty";
    }

    public Nba(String conference, String division){
        this.conference = conference;
        this.division = division;
    }

    public String getConference(){
        return conference;
    }
    public boolean equals(Nba x){
        if (conference.equals(x.conference)){
            return true;
        }
        else{
            return false;
        }
    }

}
