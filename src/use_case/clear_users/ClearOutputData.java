package use_case.clear_users;

import entity.User;

import java.util.List;

public class ClearOutputData {
    private final List<User> usersDeleted;

    public ClearOutputData(List<User> usersDeleted) {
        this.usersDeleted = usersDeleted;
    }

    public List<User> getUsersDeleted() {
        return usersDeleted;
    }
}
