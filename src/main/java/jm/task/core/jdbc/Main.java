package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl methodsForUsers1 = new UserServiceImpl();
        methodsForUsers1.createUsersTable();
        methodsForUsers1.saveUser("Катя", "Первая", (byte) 30);
        methodsForUsers1.saveUser("Максим", "Второй", (byte) 25);
        methodsForUsers1.saveUser("Иван", "Третий", (byte) 19);
        methodsForUsers1.saveUser("Князь", "Четвертый", (byte) 50);
        for (User user : methodsForUsers1.getAllUsers()) {
            System.out.println(user);
        }
        methodsForUsers1.cleanUsersTable();
        methodsForUsers1.dropUsersTable();
    }
}

