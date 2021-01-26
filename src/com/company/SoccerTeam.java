package com.company;

public class SoccerTeam {
    private  int wins;
    private  int losses;
    private  int ties;
    static int numGoals;
    static int matchesPlayed;

    public SoccerTeam() {
        wins = 0;
        losses = 0;
        ties = 0;
    }
    //comparing n0. of goals scored by THIS and the OTHER team and
    //increments appropriate fields for both teams
    public void played(SoccerTeam other, int myScore, int otherScore) {
        matchesPlayed++;
        numGoals +=  myScore + otherScore;
        if (myScore > otherScore) {
            wins++;
            other.losses++;
        } else if (myScore < otherScore) {
            losses++;
            other.wins++;
        } else
            ties++;
        other.ties++;
    }

    public int getPts() {
        int numPts = 3 * wins + ties;
        return numPts;
    }

    public void reset() {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public static int getNumGoals() {
        return numGoals;
    }

    public static int getNumMatches() {
        return matchesPlayed;
    }

    static void startTournament() {
        numGoals = 0;
        matchesPlayed = 0;
    }

    public String toString() {
        return wins + " wins, " + losses + " losses and " + ties + " ties";
    }
    public static void main(String[] args){
        SoccerTeam ManchesterUnitedFC = new SoccerTeam();
        SoccerTeam JuventusFC = new SoccerTeam();
        SoccerTeam LiverpoolFC = new SoccerTeam();
        SoccerTeam ChelseaFC = new SoccerTeam();

        startTournament();
        //First Tournament
        //Round 1
        ChelseaFC.played(ManchesterUnitedFC, 5, 6);
        LiverpoolFC.played(JuventusFC, 7, 4);
        //Round 2
        LiverpoolFC.played(ManchesterUnitedFC, 2, 3);
        ChelseaFC.played(JuventusFC, 3, 4);
        //Round 3
        LiverpoolFC.played(ChelseaFC, 1, 2);
        ManchesterUnitedFC.played(JuventusFC, 3, 2);

        System.out.println("First Tournament Stats:");
        System.out.println("Manchester United F.C Stats:\n"+ ManchesterUnitedFC.getPts()+" points, " + ManchesterUnitedFC);
        System.out.println("Juventus F.C Stats:\n"+ JuventusFC.getPts() + " points, " + JuventusFC);
        System.out.println("Liverpool F.C Stats:\n" + LiverpoolFC.getPts() + " points, " + LiverpoolFC);
        System.out.println("Chelsea F.C Stats:\n" + ChelseaFC.getPts() + " points, " + ChelseaFC);
        System.out.println("\nThere were a total of " + getNumMatches() + " matches played and " + getNumGoals() + " goals scored in the first tournaments");

        startTournament();
        ManchesterUnitedFC.reset();
        JuventusFC.reset();
        LiverpoolFC.reset();
        ChelseaFC.reset();
        //Second Tournament
        //Round 1
        ChelseaFC.played(ManchesterUnitedFC, 5, 4);
        LiverpoolFC.played(JuventusFC, 4, 2);
        //Round 2
        LiverpoolFC.played(ManchesterUnitedFC, 2, 2);
        ChelseaFC.played(JuventusFC, 3, 0);
        //Round 3
        LiverpoolFC.played(LiverpoolFC, 2, 0);
        ManchesterUnitedFC.played(JuventusFC, 1, 4);

        System.out.println("\nSecond Tournament Stats:");
        System.out.println("Manchester United F.C Stats:\n"+ ManchesterUnitedFC.getPts()+" points, " + ManchesterUnitedFC);
        System.out.println("Juventus F.C Stats:\n"+ JuventusFC.getPts() + " points, " + JuventusFC);
        System.out.println("Liverpool F.C Stats:\n" + LiverpoolFC.getPts() + " points, " + LiverpoolFC);
        System.out.println("Chelsea F.C Stats:\n" + ChelseaFC.getPts() + " points, " + ChelseaFC);
        System.out.println("\nThere were a total of " + getNumMatches() + " matches played and " + getNumGoals() + " goals scored in the first tournaments");
    }
}
