package common.data;

import java.io.Serializable;

/**
 * Enumeration with marine weapon constants.
 */
public enum Weapon implements Serializable {
    BOLTGUN,
    FLAMER,
    GRENADE;

    /**
     * @return String with all enum values splitted by comma.
     */
    public static String list() {
        String list = "";
        for (Weapon weapon : values()) {
            list += weapon.name() + ", ";
        }
        return list.substring(0, list.length() - 2);
    }
}
