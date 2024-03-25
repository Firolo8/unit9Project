public class Teams extends Nba {

    private String teamName;

    public Teams(String conference, String division, String teamName) {
        super(conference, division);
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    public String toString() {
        return super.toString() + " Team: " + teamName;
    }


    public boolean equals(Object obj) {
        if (teamName.equals(obj.teamName)){
            return true;
        }
        else{
            return false;
        }
    }


    public void uniqueMethod1() {
        System.out.println("Coach of " + teamName + ": Phil Jackson");
    }


    public void uniqueMethod2() {
        System.out.println("Home Stadium of " + teamName + ": Staples Center");
    }
}
