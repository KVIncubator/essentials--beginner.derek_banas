package best.dima.sandbox.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(name = "Hello", targetNamespace = "http://wsserver/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Hello {
    /**
     *
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String sayHello(
            @WebParam(name = "arg0", partName = "arg0")
                    String arg0);
}
