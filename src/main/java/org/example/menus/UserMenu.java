package org.example.menus;

import org.example.Globals;
import org.example.entity.User;

/** Показывает действия, доступные обычному пользователю после входа. */
public class UserMenu {
    private User user;

    // Сохраняем ссылку на вошедшего пользователя для последующих действий меню.
    public UserMenu(User user){
        this.user =user;
    }

    public void launch(){
        // После каждого действия меню показывается снова, пока не выполнится return.
        while (true) {
             System.out.println("Привет "+ user.getUsername());
             System.out.println("Выберите действие");
            System.out.println("1. Создать счет");
             System.out.println("2. Посмотреть счета");
              System.out.println("3. Выйти");
              String input = Globals.scanner.nextLine();
              // Ввод читается как строка, поэтому сравниваем с "1", а не с числом 1.
              if (input.equals("1")){
                // Здесь ещё предстоит реализовать создание счёта.

                
              }
              if (input.equals("2")){
                // Здесь ещё предстоит реализовать просмотр счетов.

              }
              if (input.equals("3")){
                // Выходим только из этого метода: Main снова покажет меню входа.
                return;
              }
    }
}

}