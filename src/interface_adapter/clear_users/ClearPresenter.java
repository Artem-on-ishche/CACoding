package interface_adapter.clear_users;

import entity.User;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareView(ClearOutputData data) {
        var clearState = clearViewModel.getState();
        var formattedUsernames = getFormattedUsernamesString(data);

        clearState.setUsernames(formattedUsernames);
        clearViewModel.firePropertyChanged();
    }

    private String getFormattedUsernamesString(ClearOutputData data) {
        return String.join("\n", data.getUsersDeleted().stream().map(User::getName).toList());
    }
}
