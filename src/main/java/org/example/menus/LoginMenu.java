package org.example.menus;

import org.example.Globals;
import org.example.entity.User;


/** Запрашивает логин и пароль, затем ищет совпадение в общем списке пользователей. */
public class LoginMenu {


    public User launch(){
        // Если данные не подошли, цикл начнёт попытку входа заново.
        while (true){

            System.out.println("Здавствуйте! Пожалуйста введите логин:");
            System.out.println("Напишите exit чтобы выйти");
            String loginInput = Globals.scanner.nextLine();

            if (loginInput.equals("exit")){
                // Завершает всё приложение. Код 0 означает обычное завершение.
                System.exit(0);
            }


            System.out.println("Введите пароль:");
            String passwordInput= Globals.scanner.nextLine();


            // Индексы списка начинаются с 0. size() — количество пользователей.
            // После каждой проверки i++ увеличивает индекс на 1.
            for (int i = 0; i < Globals.users.size(); i++){
                // get(i) берёт пользователя с текущим индексом из списка.
                User currentUser = Globals.users.get(i);
                // && требует совпадения обоих условий: и логина, и пароля.
                if (currentUser.getUsername().equals(loginInput)
                        && currentUser.getPassword().equals(passwordInput)
                ){
                    // return завершает метод launch() и передаёт пользователя в Main.
                    return currentUser;
                }

            }

        }
    }



}
