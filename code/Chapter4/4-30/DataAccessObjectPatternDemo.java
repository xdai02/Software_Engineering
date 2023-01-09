public class DataAccessObjectPatternDemo {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();

        for(User user : userDAO.getAllUsers()) {
            System.out.println(user);
        }

        System.out.println(userDAO.getUserByName("Terry"));
    }
}
