package org.example.menus;

import org.example.entity.User;

/** Заготовка меню администратора; доступные действия ещё не реализованы. */
public class AdminMenu {

    private User user;



    // Конструктор запоминает, для какого администратора создано меню.
    public AdminMenu(User user){
        this.user = user;
    }


    public void launch(){
        // Здесь будут команды администратора. Сейчас метод ничего не делает.
    }





}
