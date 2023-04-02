package section12Generics.G1Generics;

interface Player{
    String name();
}
record BaseballPlayer (String name, String position) implements Player{}
record FootballPlayer (String name, String position) implements Player{}
record VollyballPlayer(String name, String poistion) implements Player{}

public class Main {
    public static void main(String[] args) {

        var philly = new Affiliation("city","Philadelphia, PA","US");
        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1,3,astros1,5);

        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2,33,astros2,5);

        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies",philly);
        Team<BaseballPlayer, Affiliation> astros = new Team<>("Houston Astros");
        scoreResult(phillies,33,astros,5);

        var harper = new BaseballPlayer("B Harper","Right Fielder");
        var marsh = new BaseballPlayer("B Marsh","Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseballPlayer("D Guthrie","Center Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMember();

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, String> afc = new Team<>("Adelaide Crows",
                "City of Adelaide, South Australia, in AU");

        var tex = new FootballPlayer("Tex Walker","Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird","Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMember();

        Team<VollyballPlayer,Affiliation> adelaid = new Team<>("Adelaid Storm");
        adelaid.addTeamMember(new VollyballPlayer("N Roberts","Setter"));
        adelaid.listTeamMember();

        var canberra = new Team<VollyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VollyballPlayer("B Black","Opposite"));
        canberra.listTeamMember();
        scoreResult(canberra,0,adelaid,1);

//        Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");
    }
    public static void scoreResult(BaseballTeam team1,int t1_score,
                                   BaseballTeam team2,int t2_score) {

        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }
    public static void scoreResult(SportsTeam team1,int t1_score,
                                   SportsTeam team2,int t2_score) {

        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }
    public static void scoreResult(Team team1,int t1_score,
                                   Team team2,int t2_score) {

        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }
}
