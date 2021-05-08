package resources;

import java.util.ListResourceBundle;

public class Resource_ru extends ListResourceBundle {
    private static final Object[][] contents =
            {
                    {"back_button", "Назад"},
                    {"nameTitle", "Имя"},
                    {"healthTitle", "Здоровье"},
                    {"heartTitle", "Сердца"},
                    {"achieveTitle", "Достижения"},
                    {"weaponTitle", "Оружие"},
                    {"chapterLegionTitle", "Легион"},
                    {"remove_button", "Удалить"},
                    {"login_button", "Войти"},
                    {"marineData_Title", "Данные о Spacemarine"},
                    {"coordinatesData_Title", "Координаты"},
                    {"chapterData_Title", "Часть"},
                    {"registration", "Регистрация"},

                    {"startMenu_closeButton", "Закрыть"},

                    {"mainMenu_signOutButton", "Выйти"},
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
                    {"mainMenu_label1", "Добавление/изменение"},
                    {"mainMenu_label2", "Информация об объектах"},
                    {"mainMenu_label3", "Удаление элементов"},
                    {"mainMenu_label4", "Служебные команды"},

                    {"filter_label1", "Поле фильтра:"},
                    {"filter_label2", "Аргумент:"},
                    {"filter_label3", "Тип фильтра:"},
                    {"filter_filterButton", "Фильтровать"},

                    {"login_name", "Вход"},
                    {"login_loginName", "Логин"},
                    {"login_passwordName", "Пароль"},

                    {"register_loginName", "Логин"},
                    {"register_passwordName", "Пароль"},
                    {"register_confirmPassword", "Подтверждение пароля"},

                    {"show_filterButton", "Фильтр"},
                    {"show_resetButton", "Сброс"},
                    {"show_updateButton", "Обновить"},
                    {"show_keyColumn", "ключ"},
                    {"show_nameColumn", "имя"},
                    {"show_dateColumn", "дата"},
                    {"show_healthColumn", "здоровье"},
                    {"show_heartColumn", "сердца"},
                    {"show_achieveColumn", "достижения"},
                    {"show_weaponColumn", "оружие"},
                    {"show_chapterNameColumn", "имяЧасти"},
                    {"show_chapterLegionColumn", "легионЧасти"},
                    {"show_userColumn", "Владелец"},

                    {"script_chooseFileButton", "Выбрать файл"},

                    {"removeKey_label1", "Введите ключ"},

                    {"removeByWeapon_label1", "Выберите оружие"},

                    {"insert_keyName", "Ключ"},
                    {"insert_insertButton", "Добавить"}
            };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
