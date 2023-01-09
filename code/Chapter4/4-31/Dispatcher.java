public class Dispatcher {
    private HomeView homeView;
    private UserView userView;

    public Dispatcher() {
        homeView = new HomeView();
        userView = new UserView();
    }

    public void dispatch(String request) {
        if(request.equalsIgnoreCase("USER")) {
            userView.display();
        } else {
            homeView.display();
        }
    }
}
