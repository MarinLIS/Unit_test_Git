package seminars.third.hw;

import java.util.ArrayList;
import java.util.List;

/*Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов. Для этого,
вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами.
Протестируйте данную функцию.*/

public class UserRepository {

    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.getAuthentication()) {
            data.add(user);
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.getLogin().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutAll() {
        for (User user : data) {
            user.setAuthentication(false);
        }
    }

    public void logoutAllNonAdmins() {
        for (User user : data) {
            if (!user.isAdmin()) {
                user.setAuthentication(false);
            }
        }
    }
}