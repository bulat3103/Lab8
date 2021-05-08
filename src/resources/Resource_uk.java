package resources;

import java.util.ListResourceBundle;

public class Resource_uk extends ListResourceBundle {
    private static final Object[][] contents =
            {
                    {"back_button", "Назад"},
                    {"nameTitle", "Ім'я"},
                    {"healthTitle", "Здоров'я"},
                    {"heartTitle", "Серце"},
                    {"achieveTitle", "Досягнення"},
                    {"weaponTitle", "Зброя"},
                    {"chapterLegionTitle", "Легіон"},
                    {"remove_button", "Видалити"},
                    {"login_button", "Увійти"},
                    {"marineData_Title", "Дані про Spacemarine"},
                    {"coordinatesData_Title", "Координата"},
                    {"chapterData_Title", "Частина"},
                    {"registration", "Реєстрація"},

                    {"startMenu_closeButton", "Заплющити"},

                    {"mainMenu_signOutButton", "Вийти"},
                    {"mainMenu_insertButton", "insert"},
                    {"mainMenu_updateButton", "update"},
                    {"mainMenu_showButton", "show"},
                    {"mainMenu_sumHealthButton", "sumHealth"},
                    {"mainMenu_visualizeButton", "visualize"},
                    {"mainMenu_averHeartButton", "averHeart"},
                    {"mainMenu_byKeyButton", "byKey"},
                    {"mainMenu_greaterButton", "greater"},
                    {"mainMenu_infoButton", "info"},
                    {"mainMenu_historyButton", "history"},
                    {"mainMenu_scriptButton", "script"},
                    {"mainMenu_helpButton", "help"},
                    {"mainMenu_sumHealthButton", "sumHealth"},
                    {"mainMenu_label1", "Додавання/зміна"},
                    {"mainMenu_label2", "Інформація про об'єкти"},
                    {"mainMenu_label3", "Видалення елементів"},
                    {"mainMenu_label4", "Службові команди"},

                    {"filter_label1", "Поле фільтра:"},
                    {"filter_label2", "Аргумент:"},
                    {"filter_label3", "Тип фільтра:"},
                    {"filter_filterButton", "Фільтрувати"},

                    {"login_name", "Вход"},
                    {"login_loginName", "Логін"},
                    {"login_passwordName", "Пароль"},

                    {"register_loginName", "Логін"},
                    {"register_passwordName", "Пароль"},
                    {"register_confirmPassword", "Підтвердження пароля"},

                    {"show_filterButton", "Фільтр"},
                    {"show_resetButton", "Скидання"},
                    {"show_updateButton", "Оновити"},
                    {"show_keyColumn", "ключ"},
                    {"show_nameColumn", "iм'я"},
                    {"show_dateColumn", "дата"},
                    {"show_healthColumn", "здоров'я"},
                    {"show_heartColumn", "серце"},
                    {"show_achieveColumn", "досягнення"},
                    {"show_weaponColumn", "зброя"},
                    {"show_chapterNameColumn", "iм'яЧастина"},
                    {"show_chapterLegionColumn", "легiонЧастина"},
                    {"show_userColumn", "Власник"},

                    {"script_chooseFileButton", "Вибрати файл"},

                    {"removeKey_label1", "Введіть ключ"},

                    {"removeByWeapon_label1", "Виберіть зброю"},

                    {"insert_keyName", "Ключ"},
                    {"insert_insertButton", "Додавши"}
            };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
