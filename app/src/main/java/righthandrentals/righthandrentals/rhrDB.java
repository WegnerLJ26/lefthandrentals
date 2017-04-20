package righthandrentals.righthandrentals;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class rhrDB {

    // db constants
    public static final String DB_NAME = "rhr.db";
    public static final int DB_VERSION = 1;

    // User table contents
    public static final String USER_TABLE = "user";

    public static final String USER_ID = "_id";
    public static final int USER_ID_COL = 0;

    public static final String USER_NAME = "user_name";
    public static final int USER_NAME_COL = 1;

    public static final String USER_PASSWORD = "password";
    public static final int USER_PASSWORD_COL = 2;

    public static final String USER_ACCOUNT_TYPE = "account_type";
    public static final int USER_ACCOUNT_TYPE_COL = 3;

    // Property table contents
    public static final String PROPERTY_TABLE = "property";

    public static final String PROPERTY_ID = "property_id";
    public static final int PROPERTY_ID_COL = 0;

    public static final String PROPERTY_ADDRESS = "property_address";
    public static final int PROPERTY_ADDRESS_COL = 1;

    public static final String PROPERTY_COMPANY_ID = "property_cid";
    public static final int PROPERTY_COMPANY_ID_COL = 2;

    public static final String PROPERTY_MANAGER_ID = "property_mgr_id";
    public static final int PROPERTY_MANAGER_ID_COL = 3;

    public static final String PROPERTY_NUM_UNIT = "property_num_unit";
    public static final int PROPERTY_NUM_UNIT_COL = 4;

    public static final String PROPERTY_NUM_EMPTY_UNITS = "property_num_empty_units";
    public static int PROPERTY_NUM_EMPTY_UNITS_COL = 5;

    public static final String PROPERTY_STATE = "property_state";
    public static int PROPERTY_STATE_COL = 6;

    public static final String PROPERTY_ZIPCODE = "property_zipcode";
    public static int PROPERTY_ZIPCODE_COL = 7;

    public static final String PROPERTY_CITY = "property_city";
    public static int PROPERTY_CITY_COL = 8;

    // Company table contents
    public static final String COMPANY_TABLE = "company";

    public static final String COMPANY_ID = "company_id";
    public static final int COMPANY_ID_COL = 0;

    public static final String COMPANY_NAME = "company_name";
    public static final int COMPANY_NAME_COL = 1;

    public static final String COMPANY_ADDRESS = "company_address";
    public static final int COMPANY_ADDRESS_COL = 2;

    public static final String COMPANY_STATE = "company_state";
    public static final int COMPANY_STATE_COL = 3;

    public static final String COMPANY_CITY = "company_city";
    public static final int COMPANY_CITY_COL = 4;

    public static final String COMPANY_ZIPCODE = "company_zipcode";
    public static final int COMPANY_ZIPCODE_COL = 5;

    // Tenant table contents
    public static final String TENANT_TABLE = "tenant";

    public static final String TENANT_ID = "tenant_id";
    public static final int TENANT_ID_COL = 0;

    public static final String TENANT_FIRSTNAME = "first_name";
    public static final int TENANT_FIRSTNAME_COL = 1;

    public static final String TENANT_LASTNAME = "last_name";
    public static final int TENANT_LASTNAME_COL = 2;

    public static final String TENANT_EMAIL = "email";
    public static final int TENANT_EMAIL_COL = 3;

    public static final String TENANT_PHONE = "phone";
    public static final int TENANT_PHONE_COL = 4;

    public static final String TENANT_UNIT_ID = "tenant_unit_id";
    public static final int TENANT_UNIT_ID_COL = 5;

    // Unit table contents
    public static final String UNIT_TABLE = "unit";

    public static final String UNIT_ID = "unit_id";
    public static final int UNIT_ID_COL = 0;

    public static final String UNIT_ROOMS = "rooms";
    public static final int UNIT_ROOMS_COL = 1;

    public static final String UNIT_BATHS = "baths";
    public static final int UNIT_BATHS_COL = 2;

    public static final String UNIT_MAX_OCCUPANTS = "max_occupants";
    public static final int UNIT_MAX_OCCUPANTS_COL = 3;

    public static final String UNIT_PETS = "pets";
    public static final int UNIT_PETS_COL = 4;

    public static final String UNIT_PRICE_MONTHLY = "price_monthly";
    public static final int UNIT_PRICE_MONTHLY_COL = 5;

    public static final String UNIT_PROPERTY_ID = "unit_property_id";
    public static final int UNIT_PROPERTY_ID_COL = 6;

    // Manager table contents
    public static final String MANAGER_TABLE ="manager";

    public static final String MANAGER_ID = "manager_id";
    public static final int MANAGER_ID_COL = 0;

    public static final String MANAGER_FIRSTNAME = "first_name";
    public static final int MANAGER_FIRSTNAME_COL = 1;

    public static final String MANAGER_LASTNAME = "last_name";
    public static final int MANAGER_LASTNAME_COL = 2;

    public static final String MANAGER_EMAIL = "email";
    public static final int MANAGER_EMAIL_COL = 3;

    public static final String MANAGER_PHONE = "phone";
    public static final int MANAGER_PHONE_COL = 4;

    public static final String MANAGER_COMPANYID = "manager_companyid";
    public static final int MANAGER_COMPANYID_COL = 5;

    // database object and database helper object
    private SQLiteDatabase db;
    private DBHelper dbHelper;

    // constructor
    public rhrDB(Context context) {
        dbHelper = new DBHelper(context, DB_NAME, null, DB_VERSION);
    }

    // private methods
    private void openReadableDB() {
        db = dbHelper.getReadableDatabase();
    }

    private void openWritableDB() {
        db = dbHelper.getWritableDatabase();
    }

    private void closeDB() {
        if (db != null)
            db.close();
    }



    // CREATE and DROP TABLE Statements
    public static final String CREATE_USER_TABLE =
            "CREATE TABLE " + USER_TABLE + " (" +
                    USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    USER_NAME + " TEXT NOT NULL, " +
                    USER_PASSWORD + " TEXT NOT NULL, " +
                    USER_ACCOUNT_TYPE + "INTEGER NOT NULL);";

    public static final String CREATE_PROPERTY_TABLE =
            "CREATE TABLE " + PROPERTY_TABLE + " (" +
                    PROPERTY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    PROPERTY_ADDRESS + " TEXT NOT NULL, " +
                    PROPERTY_COMPANY_ID + " INTEGER NOT NULL, " +
                    PROPERTY_MANAGER_ID + " INTEGER NOT NULL, " +
                    PROPERTY_NUM_UNIT + " INTEGER NOT NULL, " +
                    PROPERTY_NUM_EMPTY_UNITS + " INTEGER NOT NULL, " +
                    PROPERTY_STATE + " TEXT NOT NULL, " +
                    PROPERTY_ZIPCODE + " INTEGER NOT NULL, " +
                    PROPERTY_CITY + " TEXT NOT NULL);";

    public static final String CREATE_COMPANY_TABLE =
            "CREATE TABLE " + COMPANY_TABLE + " (" +
                    COMPANY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COMPANY_NAME + " TEXT NOT NULL, " +
                    COMPANY_ADDRESS + " TEXT NOT NULL, " +
                    COMPANY_STATE + " TEXT NOT NULL, " +
                    COMPANY_CITY + " TEXT NOT NULL, " +
                    COMPANY_ZIPCODE + " INTEGER NOT NULL);";

    public static final String CREATE_TENANT_TABLE =
            "CREATE TABLE " + TENANT_TABLE + " (" +
                    TENANT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    TENANT_FIRSTNAME + " TEXT NOT NULL, " +
                    TENANT_LASTNAME + " TEXT NOT NULL, " +
                    TENANT_EMAIL + " TEXT NOT NULL, " +
                    TENANT_PHONE + " TEXT NOT NULL, " +
                    TENANT_UNIT_ID + " INTEGER NOT NULL;)";

    public static final String CREATE_UNIT_TABLE =
            "CREATE TABLE " + UNIT_TABLE + " (" +
                    UNIT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    UNIT_ROOMS + " INTEGER NOT NULL, " +
                    UNIT_BATHS + " INTEGER NOT NULL, " +
                    UNIT_MAX_OCCUPANTS + " INTEGER NOT NULL, " +
                    UNIT_PETS + " TEXT NOT NULL, " +
                    UNIT_PRICE_MONTHLY + " INTEGER NOT NULL, " +
                    UNIT_PROPERTY_ID + " INTEGER NOT NULL;)";

    public static final String CREATE_MANAGER_TABLE =
            "CREATE TABLE " + MANAGER_TABLE + " (" +
                    MANAGER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    MANAGER_FIRSTNAME + " TEXT NOT NULL, " +
                    MANAGER_LASTNAME + " TEXT NOT NULL, " +
                    MANAGER_EMAIL + " TEXT NOT NULL, " +
                    MANAGER_PHONE + " TEXT NOT NULL, " +
                    MANAGER_COMPANYID + " INTEGER NOT NULL;)";

    public static final String DROP_USER_TABLE =
            "DROP TABLE IF EXISTS " + UNIT_TABLE;

    public static final String DROP_PROPERTY_TABLE =
            "DROP TABLE IF EXISTS " + PROPERTY_TABLE;

    public static final String DROP_COMPANY_TABLE =
            "DROP TABLE IF EXISTS " + COMPANY_TABLE;

    public static final String DROP_TENANT_TABLE =
            "DROP TABLE IF EXISTS " + TENANT_TABLE;

    public static final String DROP_UNIT_TABLE =
            "DROP TABLE IF EXISTS " + UNIT_TABLE;

    public static final String DROP_MANAGER_TABLE =
            "DROP TABLE IF EXISTS " + MANAGER_TABLE;

    private static class DBHelper extends SQLiteOpenHelper {

        public DBHelper(Context context, String name,
                        SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_USER_TABLE);
            db.execSQL(CREATE_PROPERTY_TABLE);
            db.execSQL(CREATE_COMPANY_TABLE);
            db.execSQL(CREATE_TENANT_TABLE);
            db.execSQL(CREATE_UNIT_TABLE);
            db.execSQL(CREATE_MANAGER_TABLE);

            // can insert sample entries in all tables in this function
        }

        @Override
        public void onUpgrade(SQLiteDatabase db,
                              int oldVersion, int newVersion) {

            Log.d("RHR", "Upgrading db from version "
                    + oldVersion + "to " + newVersion);

            db.execSQL(rhrDB.DROP_USER_TABLE);
            db.execSQL(rhrDB.DROP_PROPERTY_TABLE);
            db.execSQL(rhrDB.DROP_COMPANY_TABLE);
            db.execSQL(rhrDB.DROP_TENANT_TABLE);
            db.execSQL(rhrDB.DROP_UNIT_TABLE);
            db.execSQL(rhrDB.DROP_MANAGER_TABLE);
            onCreate(db);
        }
    }





}
