package interface_adapter.clear_users;

import java.util.Objects;

public final class ClearState {
    private String usernames;

    public ClearState(String usernames) {
        this.usernames = usernames;
    }

    public ClearState() {
    }

    public String getUsernames() {
        return usernames;
    }

    public void setUsernames(String usernames) {
        this.usernames = usernames;
    }

    @Override
    public String toString() {
        return "ClearState[" +
                "usernames=" + usernames + ']';
    }

}
