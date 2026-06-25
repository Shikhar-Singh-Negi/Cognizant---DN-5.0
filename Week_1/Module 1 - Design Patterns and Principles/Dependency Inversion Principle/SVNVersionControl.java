public class SVNVersionControl implements IVersionControl {

    @Override
    public void commit(String message) {
        System.out.println("Committing changes to SVN with message: " + message);
    }

    @Override
    public void push() {
        System.out.println("Pushing changes to remote SVN repository.");
    }

    @Override
    public void pull() {
        System.out.println("Pulling changes from remote SVN repository.");
    }
}