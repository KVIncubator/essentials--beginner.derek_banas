package best.dima.sandbox.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "HelloService", targetNamespace = "http://wsserver/", wsdlLocation = "http://localhost:1212/hello?wsdl")
public class HelloService
        extends Service
{
    private final static URL HELLOSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(HelloService.class.getName());
    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = HelloService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:1212/hello?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:1212/hello?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        HELLOSERVICE_WSDL_LOCATION = url;
    }
    public HelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }
    public HelloService() {
        super(HELLOSERVICE_WSDL_LOCATION, new QName("http://wsserver/", "HelloService"));
    }
    /**
     *
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloPort")
    public Hello getHelloPort() {
        return super.getPort(new QName("http://wsserver/", "HelloPort"), Hello.class);
    }
    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloPort")
    public Hello getHelloPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsserver/", "HelloPort"), Hello.class, features);
    }
}