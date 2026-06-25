public class Main {

    public static void main(String[] args) {

        IVersionControl git = new GitVersionControl();
        DevelopmentTeam team1 = new DevelopmentTeam(git);

        team1.makeCommit("Initial commit");
        team1.performPush();
        team1.performPull();

        System.out.println();

        IVersionControl svn = new SVNVersionControl();
        DevelopmentTeam team2 = new DevelopmentTeam(svn);

        team2.makeCommit("Bug Fix");
        team2.performPush();
        team2.performPull();
    }
}