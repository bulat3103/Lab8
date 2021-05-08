package resources;

import java.util.ListResourceBundle;

public class Resource_en extends ListResourceBundle {
    private static final Object[][] contents =
            {
                    {"back_button", "Back"},
                    {"nameTitle", "Name"},
                    {"healthTitle", "Health"},
                    {"heartTitle", "Heart"},
                    {"achieveTitle", "Achieve"},
                    {"weaponTitle", "Weapon"},
                    {"chapterLegionTitle", "Legion"},
                    {"remove_button", "Remove"},
                    {"login_button", "Sign in"},
                    {"marineData_Title", "Spacemarine data"},
                    {"coordinatesData_Title", "Coordinates"},
                    {"chapterData_Title", "Chapter"},
                    {"registration", "Sign up"},

                    {"startMenu_closeButton", "Close"},

                    {"mainMenu_signOutButton", "Sign out"},
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
                    {"mainMenu_label1", "Add/Update"},
                    {"mainMenu_label2", "Objects info"},
                    {"mainMenu_label3", "Remove objects"},
                    {"mainMenu_label4", "Service commands"},

                    {"filter_label1", "Filter field:"},
                    {"filter_label2", "Argument:"},
                    {"filter_label3", "Filter type:"},
                    {"filter_filterButton", "Filter"},

                    {"login_name", "Sign In"},
                    {"login_loginName", "Username"},
                    {"login_passwordName", "Password"},

                    {"register_loginName", "Username"},
                    {"register_passwordName", "Password"},
                    {"register_confirmPassword", "Confirm password"},

                    {"show_filterButton", "Filter"},
                    {"show_resetButton", "Reset"},
                    {"show_updateButton", "Reload"},
                    {"show_keyColumn", "key"},
                    {"show_nameColumn", "name"},
                    {"show_dateColumn", "date"},
                    {"show_healthColumn", "health"},
                    {"show_heartColumn", "heart"},
                    {"show_achieveColumn", "achieve"},
                    {"show_weaponColumn", "weapon"},
                    {"show_chapterNameColumn", "chapterName"},
                    {"show_chapterLegionColumn", "chapterLegion"},
                    {"show_userColumn", "user"},

                    {"script_chooseFileButton", "Choose file"},

                    {"removeKey_label1", "Enter key"},

                    {"removeByWeapon_label1", "Choose weapon"},

                    {"insert_keyName", "key"},
                    {"insert_insertButton", "Insert"}
            };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
