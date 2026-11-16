package org.example.entity;

import java.util.List;

/** Заготовка банковского счёта: номер, валюта и история операций. */
public class Account {

    // Номер — строка: с ним не выполняют арифметику, а ведущие нули могут быть важны.
    private String accountNumber;

    private String currency; // валюта

    // История операций по одному счёту. Пока список не создан и поле равно null.
    private List<Transaction> transaction;



    // Связь объектов: пользователь -> его счета -> операции каждого счёта.
    // Создание счетов и работа с историей пока не реализованы.

}
