package auribises.com.teacher;

import android.net.Uri;

/**
 * Created by Dell on 11/04/17.
 */

public class Util {


    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "Teacher.db";


    public static final String TAB_NAME = "Teacher";
    public static final String COL_ID = "_ID";
    public static final String COL_NAME = "NAME";
    public static final String COL_PHONE = "PHONE";
    public static final String COL_EMAIL = "EMAIL";
    public static final String COL_GENDER = "GENDER";
    public static final String COL_ADDRESS = "ADDRESS";
    public static final String COL_PURPOSE = "PURPOSE";
    public static final String COL_DATE = "DATE";
    public static final String COL_TIME = "TIME";
    public static final String COL_ROOM = "ROOM";

    public static final String CREATE_TAB_QUERY = "create table Teacher(" +
            "_ID integer primary key autoincrement," +
            "NAME varchar(256)," +
            "PHONE varchar(20)," +
            "EMAIL varchar(256)," +
            "GENDER varchar(10)," +
            "ADDRESS varchar(256)," +
            "PURPOSE varchar(256)," +
            "DATE varchar(256)," +
            "TIME varchar(256)," +
            "ROOM varchar(256)," +
            ")";

    public static final String KEY_NAME = "keyName";
    public static final String KEY_PHONE = "keyPhone";
    public static final String KEY_EMAIL = "keyEmail";
    public static final String KEY_ADDRESS = "keyAddress";
    public static final String KEY_PURPOSE = "keyPurpose";
    public static final String KEY_DATE = "keyDate";
    public static final String KEY_TIME = "keyTime";
    public static final String KEY_ROOM = "keyRoom";

    public static final Uri TEACHER_URI = Uri.parse("content://auribises.com.teacher.teacherprovider/"+TAB_NAME);


    final static String URI = "http://sheenu.esy.es/Teacher/";

    public static final String INSERT_TEACHER_PHP = "http://sheenu.esy.es/Teacher/insert.php";

    public static final String RETRIEVE_TEACHER_PHP = "http://sheenu.esy.es/Teacher/retrive.php";

    public static final String DELETE_TEACHER_PHP = "http://sheenu.esy.es/Teacher/delete.php";

    public static final String UPDATE_TEACHER_PHP = "http://sheenu.esy.es/Teacher/update.php";
}

