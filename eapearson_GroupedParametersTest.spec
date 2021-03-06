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
        string phone_type;
        string phone_number;
        string phone_comments;
    } Phone;

    typedef structure {
        string first_name;
        string last_name;
        Address address;
        list<Phone> phones;
        string comment;
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
        string effort;
        list<LogEntry> log_entries;        
    } Bug;

    /* Next we will add in workspace refs */


    /* Now some flat groups */

    typedef structure {
        float max_volume;
        float current_volume;
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

    typedef structure {
        string status;
        string detail;
    } TestResults;

    /* Now; just a few flat groups */

    /* Measurement 
       We use this to test all parameter types.
    */

    typedef structure {
        string measure_label;
        string measure_description;
        int measure_int; 
        float measure_float;
        int measure_bool;
        string measure_type;
    } Measure;

    typedef structure {
        int range_min;
        int range_max;
    } Range;

    typedef structure {
        string title;
        string description;
        Measure measure;
        Range range;
    } Measurement;

    typedef structure {
        string stringParam;
        string textareaParam;
        string dropdownParam;
        int booleanParam;
        int integerParam;
        float floatParam;
        string objectRefParam;
        string autocompleteParam;
    } AllParamTypes;

    typedef structure {
        list<string> stringParam;
        list<string> textareaParam;
        list<string> dropdownParam;
        list<int> booleanParam;
        list<int> integerParam;
        list<float> floatParam;
        list<string> objectRefParam;
        list<string> autocompleteParam;
    } AllSequenceTypes;

    /* EMPTY GROUP */

    typedef structure {

    } EmptyGroup;

    typedef structure {
        EmptyGroup group1;
    } EmptyParamGroupInput;

    /* All Configurations of Sequences */
    typedef structure {
        string stringParamOptional1GroupOptional1;
        string stringParamOptional2GroupOptional1;
    } GroupOptional1;

    typedef structure {
        string stringParamRequiredGroupOptional2;
        string stringParamOptionalGroupOptional2;
    } GroupOptional2;

    typedef structure {
        string stringParamOptional1GroupRequired1;
        string stringParamOptiona2GroupRequired1;
    } GroupRequired1;

    typedef structure {
        string stringParamRequiredGroupRequired2;
        string stringParamOptionalGroupRequired2;
    } GroupRequired2;


    typedef structure  {
        list<string> stringParamRequired;
        list<string> stringParamOptional;
        list<GroupOptional1> groupOptional1;
        list<GroupOptional2> groupOptional2;
        list<GroupRequired1> groupRequired1;
        list<GroupRequired2> groupRequired2;
    } ValidateSeqParamsInput;

    typedef structure {
        string errorType;
    } GenerateErrorParamsInput;

    /* Functions */

    funcdef validate_contact(Contact contact)
        returns (TestResults result) authentication required;

    funcdef validate_bug(Bug bug)
        returns (TestResults result) authentication required;

    funcdef validate_measurement(Measurement)
        returns (TestResults result) authentication required;

    funcdef validate_all_params(AllParamTypes)
        returns (TestResults result) authentication required;

    funcdef validate_all_seq_params(AllSequenceTypes)
        returns (TestResults result) authentication required;

    funcdef validate_empty_param_group(EmptyParamGroupInput input)
        returns (TestResults result) authentication required;

    funcdef validate_seq_params(ValidateSeqParamsInput)
        returns (TestResults result) authentication required;

    funcdef generate_error(GenerateErrorParamsInput)
        returns (TestResults result) authentication required;

    /*funcdef validate_checklist(CarChecklist checklist)
        returns (UnspecifiedObject result) authentication required;*/
};
