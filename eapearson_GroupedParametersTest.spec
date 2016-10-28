/*
A KBase module: eapearson_GroupedParametersTest
*/

module eapearson_GroupedParametersTest {
    /*
        Insert your typespec information here.
    */

    /* A pure string test of lists of structures (groups) */
    
    typedef structure {
        string street_address;
        string city;
        string state;
        string postal_code;
        string country;
    } Address;

    typedef structure {
        string first_name;
        string last_name;
        list<Address> address;
    } Contact;


    /* Throw in floats and ints */

    typedef structure {
        string time_started;
        float time_spent;
        string comments;
    } LogEntry;

    typedef structure {
        string title;
        string description;
        int severity;
        int effort;
        list<LogEntry> log_entries;        
    } Bug;

    /* Next we will add in workspace refs */


    /* Now some flat groups */

    typedef structure {
        float max_capacity;
        float current_capacity;
    } Fluid;

    typedef structure {
        int checked;
        string condition;
        float repair_cost;
    } InspectionItem;

    typedef structure {
        int year;
        int month;
        int day;
    } Date;

    typedef structure {
        Date date;
        InspectionItem left_door;
        InspectionItem right_door;
        InspectionItem interior;
        Fluid gas;
        Fluid wiper_fluid;
        Fluid coolant;
    } CarChecklist;


    funcdef validate_contact(Contact contact)
        returns (UnspecifiedObject result) authentication required;

    funcdef validate_bug(Bug bug)
        returns (UnspecifiedObject result) authentication required;

    /*funcdef validate_checklist(CarChecklist checklist)
        returns (UnspecifiedObject result) authentication required;*/
};
