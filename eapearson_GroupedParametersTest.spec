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
        string stringParamRequiredGroup1;
        string stringParamOptionalGroup1;
    } Group1;

    typedef structure {
        string stringParamOptional1Group2;
        string stringParamOptional2Group2;
    } Group2;

    typedef structure {
        string stringParamRequiredGroup3;
        string stringParamOptionalGroup3;
    } Group3;

    typedef structure {
        string stringParamOptional1Group4;
        string stringParamOptiona2Group4;
    } Group4;

    typedef structure  {
        list<string> stringParamRequired;
        list<string> stringParamOptional;
        list<Group1> group1;
        list<Group2> group2;
        list<Group3> group3;
        list<Group4> group4;
    } ValidateSeqParamsInput;

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

    /*funcdef validate_checklist(CarChecklist checklist)
        returns (UnspecifiedObject result) authentication required;*/
};
