package use_case.clear_users;

import entity.User;

public class ClearInteractor implements ClearInputBoundary {

    private final ClearUserDataAccessInterface clearUserDao;
    private final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDao, ClearOutputBoundary clearPresenter) {
        this.clearUserDao = clearUserDao;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute() {
        var users = clearUserDao.deleteAll();
        clearPresenter.prepareView(new ClearOutputData(users.stream().map(User::getName).toList()));
    }
}
