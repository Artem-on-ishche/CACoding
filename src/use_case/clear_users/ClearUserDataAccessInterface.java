package use_case.clear_users;

import entity.User;

import java.util.List;

public interface ClearUserDataAccessInterface {
    List<User> deleteAll();
}
