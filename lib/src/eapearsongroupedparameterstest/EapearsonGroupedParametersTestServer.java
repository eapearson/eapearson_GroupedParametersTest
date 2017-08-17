package eapearsongroupedparameterstest;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import us.kbase.auth.AuthToken;
import us.kbase.common.service.JsonServerMethod;
import us.kbase.common.service.JsonServerServlet;
import us.kbase.common.service.JsonServerSyslog;
import us.kbase.common.service.RpcContext;

//BEGIN_HEADER
//END_HEADER

/**
 * <p>Original spec-file module name: eapearson_GroupedParametersTest</p>
 * <pre>
 * A KBase module: eapearson_GroupedParametersTest
 * </pre>
 */
public class EapearsonGroupedParametersTestServer extends JsonServerServlet {
    private static final long serialVersionUID = 1L;
    private static final String version = "0.0.2";
    private static final String gitUrl = "ssh://git@github.com/eapearson/eapearson_GroupedParametersTest";
    private static final String gitCommitHash = "6d02f82705d01913101d2b405208a28a8cf9d3d1";

    //BEGIN_CLASS_HEADER
    //END_CLASS_HEADER

    public EapearsonGroupedParametersTestServer() throws Exception {
        super("eapearson_GroupedParametersTest");
        //BEGIN_CONSTRUCTOR
        //END_CONSTRUCTOR
    }

    /**
     * <p>Original spec-file function name: validate_contact</p>
     * <pre>
     * Functions
     * </pre>
     * @param   contact   instance of type {@link eapearsongroupedparameterstest.Contact Contact}
     * @return   parameter "result" of type {@link eapearsongroupedparameterstest.TestResults TestResults}
     */
    @JsonServerMethod(rpc = "eapearson_GroupedParametersTest.validate_contact", async=true)
    public TestResults validateContact(Contact contact, AuthToken authPart, RpcContext jsonRpcContext) throws Exception {
        TestResults returnVal = null;
        //BEGIN validate_contact
        returnVal = new TestResults()
        .withStatus("Okay!")
        .withDetail("Really, okay for now");
        //END validate_contact
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: validate_bug</p>
     * <pre>
     * </pre>
     * @param   bug   instance of type {@link eapearsongroupedparameterstest.Bug Bug}
     * @return   parameter "result" of type {@link eapearsongroupedparameterstest.TestResults TestResults}
     */
    @JsonServerMethod(rpc = "eapearson_GroupedParametersTest.validate_bug", async=true)
    public TestResults validateBug(Bug bug, RpcContext jsonRpcContext) throws Exception {
        TestResults returnVal = null;
        //BEGIN validate_bug
          returnVal = new TestResults()
            .withStatus("Okay!")
            .withDetail("Your bug looks fine, thanks.");
        //END validate_bug
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: validate_measurement</p>
     * <pre>
     * </pre>
     * @param   arg1   instance of type {@link eapearsongroupedparameterstest.Measurement Measurement}
     * @return   parameter "result" of type {@link eapearsongroupedparameterstest.TestResults TestResults}
     */
    @JsonServerMethod(rpc = "eapearson_GroupedParametersTest.validate_measurement", async=true)
    public TestResults validateMeasurement(Measurement arg1, AuthToken authPart, RpcContext jsonRpcContext) throws Exception {
        TestResults returnVal = null;
        //BEGIN validate_measurement
        //END validate_measurement
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: validate_all_params</p>
     * <pre>
     * </pre>
     * @param   arg1   instance of type {@link eapearsongroupedparameterstest.AllParamTypes AllParamTypes}
     * @return   parameter "result" of type {@link eapearsongroupedparameterstest.TestResults TestResults}
     */
    @JsonServerMethod(rpc = "eapearson_GroupedParametersTest.validate_all_params", async=true)
    public TestResults validateAllParams(AllParamTypes arg1, AuthToken authPart, RpcContext jsonRpcContext) throws Exception {
        TestResults returnVal = null;
        //BEGIN validate_all_params
        //END validate_all_params
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: validate_all_seq_params</p>
     * <pre>
     * </pre>
     * @param   arg1   instance of type {@link eapearsongroupedparameterstest.AllSequenceTypes AllSequenceTypes}
     * @return   parameter "result" of type {@link eapearsongroupedparameterstest.TestResults TestResults}
     */
    @JsonServerMethod(rpc = "eapearson_GroupedParametersTest.validate_all_seq_params", async=true)
    public TestResults validateAllSeqParams(AllSequenceTypes arg1, AuthToken authPart, RpcContext jsonRpcContext) throws Exception {
        TestResults returnVal = null;
        //BEGIN validate_all_seq_params
        //END validate_all_seq_params
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: validate_empty_param_group</p>
     * <pre>
     * </pre>
     * @param   input   instance of type {@link eapearsongroupedparameterstest.EmptyParamGroupInput EmptyParamGroupInput}
     * @return   parameter "result" of type {@link eapearsongroupedparameterstest.TestResults TestResults}
     */
    @JsonServerMethod(rpc = "eapearson_GroupedParametersTest.validate_empty_param_group", async=true)
    public TestResults validateEmptyParamGroup(EmptyParamGroupInput input, AuthToken authPart, RpcContext jsonRpcContext) throws Exception {
        TestResults returnVal = null;
        //BEGIN validate_empty_param_group
        //END validate_empty_param_group
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: validate_seq_params</p>
     * <pre>
     * </pre>
     * @param   arg1   instance of type {@link eapearsongroupedparameterstest.ValidateSeqParamsInput ValidateSeqParamsInput}
     * @return   parameter "result" of type {@link eapearsongroupedparameterstest.TestResults TestResults}
     */
    @JsonServerMethod(rpc = "eapearson_GroupedParametersTest.validate_seq_params", async=true)
    public TestResults validateSeqParams(ValidateSeqParamsInput arg1, AuthToken authPart, RpcContext jsonRpcContext) throws Exception {
        TestResults returnVal = null;
        //BEGIN validate_seq_params
        //END validate_seq_params
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: generate_error</p>
     * <pre>
     * </pre>
     * @param   arg1   instance of type {@link eapearsongroupedparameterstest.GenerateErrorParamsInput GenerateErrorParamsInput}
     * @return   parameter "result" of type {@link eapearsongroupedparameterstest.TestResults TestResults}
     */
    @JsonServerMethod(rpc = "eapearson_GroupedParametersTest.generate_error", async=true)
    public TestResults generateError(GenerateErrorParamsInput arg1, AuthToken authPart, RpcContext jsonRpcContext) throws Exception {
        TestResults returnVal = null;
        //BEGIN generate_error
        returnVal = new TestResults();
        returnVal.setStatus("Really?");
        returnVal.setDetail(arg1.getErrorType());
        if (arg1.getErrorType() == null) {
            throw new IllegalArgumentException("Hmm, no errorType?");
        } else if (arg1.getErrorType().equals("runtime-divide-by-zero")) {
            // do a divide by zero
            int x = 5/0;
        } else if (arg1.getErrorType().equals("runtime-null-pointer")) {
            // do a divide by zero
            TestResults y = null;
            y.setStatus("I'm a null pointer!");
        } else if (arg1.getErrorType().equals("validation")) {
            // simulate a validation error
            throw new Exception("That was exceptional!");
        } else if (arg1.getErrorType().equals("none")) {
            returnVal.setStatus("OK");
            returnVal.setDetail("Geez, no error here.");
        }
        //END generate_error
        return returnVal;
    }
    @JsonServerMethod(rpc = "eapearson_GroupedParametersTest.status")
    public Map<String, Object> status() {
        Map<String, Object> returnVal = null;
        //BEGIN_STATUS
        returnVal = new LinkedHashMap<String, Object>();
        returnVal.put("state", "OK");
        returnVal.put("message", "");
        returnVal.put("version", version);
        returnVal.put("git_url", gitUrl);
        returnVal.put("git_commit_hash", gitCommitHash);
        //END_STATUS
        return returnVal;
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 1) {
            new EapearsonGroupedParametersTestServer().startupServer(Integer.parseInt(args[0]));
        } else if (args.length == 3) {
            JsonServerSyslog.setStaticUseSyslog(false);
            JsonServerSyslog.setStaticMlogFile(args[1] + ".log");
            new EapearsonGroupedParametersTestServer().processRpcCall(new File(args[0]), new File(args[1]), args[2]);
        } else {
            System.out.println("Usage: <program> <server_port>");
            System.out.println("   or: <program> <context_json_file> <output_json_file> <token>");
            return;
        }
    }
}
