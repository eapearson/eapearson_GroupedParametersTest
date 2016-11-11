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
    private static final String version = "0.0.1";
    private static final String gitUrl = "ssh://git@github.com/eapearson/eapearson_GroupedParametersTest";
    private static final String gitCommitHash = "8b62b2bd867cb0ad0bdcc18a63e24d08287874f8";

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
    public TestResults validateBug(Bug bug, AuthToken authPart, RpcContext jsonRpcContext) throws Exception {
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
