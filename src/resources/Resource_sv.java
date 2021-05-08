package resources;

import java.util.ListResourceBundle;

public class Resource_sv extends ListResourceBundle {
    private static final Object[][] contents =
            {
                    {"back_button", "Nazaj"},
                    {"nameTitle", "Ime"},
                    {"healthTitle", "Zdravje"},
                    {"heartTitle", "Srca"},
                    {"achieveTitle", "Dosežki"},
                    {"weaponTitle", "Orožje"},
                    {"chapterLegionTitle", "Legija"},
                    {"remove_button", "Odstrani"},
                    {"login_button", "Naprej"},
                    {"marineData_Title", "Podatki o Spacemarine"},
                    {"coordinatesData_Title", "Koordinate"},
                    {"chapterData_Title", "Del"},
                    {"registration", "Registracija"},

                    {"startMenu_closeButton", "Za zaprtje"},

                    {"mainMenu_signOutButton", "Pojdi ven"},
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
                    {"mainMenu_label1", "Dodaj/Uredi"},
                    {"mainMenu_label2", "Informacije o predmetih"},
                    {"mainMenu_label3", "Brisanje postavk"},
                    {"mainMenu_label4", "Storitveni ukazi"},

                    {"filter_label1", "Filtrirno polje:"},
                    {"filter_label2", "Argument:"},
                    {"filter_label3", "Vrsta filtra:"},
                    {"filter_filterButton", "Filter"},

                    {"login_name", "Vhod"},
                    {"login_loginName", "Prijava"},
                    {"login_passwordName", "Geslo"},

                    {"register_loginName", "Prijava"},
                    {"register_passwordName", "Geslo"},
                    {"register_confirmPassword", "Potrdi geslo"},

                    {"show_filterButton", "Filter"},
                    {"show_resetButton", "Pona"},
                    {"show_updateButton", "Posodobi"},
                    {"show_keyColumn", "ključ"},
                    {"show_nameColumn", "ime"},
                    {"show_dateColumn", "datum"},
                    {"show_healthColumn", "zdravje"},
                    {"show_heartColumn", "srca"},
                    {"show_achieveColumn", "dosežki"},
                    {"show_weaponColumn", "orožje"},
                    {"show_chapterNameColumn", "imeDel"},
                    {"show_chapterLegionColumn", "legijaDel"},
                    {"show_userColumn", "Lastnik"},

                    {"script_chooseFileButton", "Izberite datoteko"},

                    {"removeKey_label1", "Vnesite ključ"},

                    {"removeByWeapon_label1", "Izberite orožje"},

                    {"insert_keyName", "Ključ"},
                    {"insert_insertButton", "Dodaj"}
            };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
