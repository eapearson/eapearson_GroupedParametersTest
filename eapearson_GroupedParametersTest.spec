/*
A KBase module: eapearson_GroupedParametersTest
*/

module eapearson_GroupedParametersTest {
    /*
        Insert your typespec information here.
    */

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


    funcdef validate_params(Contact contact)
        returns (UnspecifiedObject result) authentication required;
};
