package use_case.clear_users;

import java.util.List;

public record ClearOutputData(List<String> usernamesOfUsersDeleted) {
}
