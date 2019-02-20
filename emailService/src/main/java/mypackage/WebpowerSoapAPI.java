
package mypackage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * 
 *             This is the webpower SOAP webservice.
 * 
 *             In order to be able to use this webservice, you need to have a login for webpower. A login consists of a
 *             username and a password. Each SOAP call in the webservice needs this username and password for access!
 *             Please inquire with the webpower administrator for a login.
 *         
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebpowerSoapAPI", targetNamespace = "http://dmdelivery.com/webservice/", wsdlLocation = "https://unicemall.webpower.eu/x/soap-v5.1/wsdl.php")
public class WebpowerSoapAPI
    extends Service
{

    private final static URL WEBPOWERSOAPAPI_WSDL_LOCATION;
    private final static WebServiceException WEBPOWERSOAPAPI_EXCEPTION;
    private final static QName WEBPOWERSOAPAPI_QNAME = new QName("http://dmdelivery.com/webservice/", "WebpowerSoapAPI");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://unicemall.webpower.eu/x/soap-v5.1/wsdl.php");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBPOWERSOAPAPI_WSDL_LOCATION = url;
        WEBPOWERSOAPAPI_EXCEPTION = e;
    }

    public WebpowerSoapAPI() {
        super(__getWsdlLocation(), WEBPOWERSOAPAPI_QNAME);
    }

    public WebpowerSoapAPI(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBPOWERSOAPAPI_QNAME, features);
    }

    public WebpowerSoapAPI(URL wsdlLocation) {
        super(wsdlLocation, WEBPOWERSOAPAPI_QNAME);
    }

    public WebpowerSoapAPI(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBPOWERSOAPAPI_QNAME, features);
    }

    public WebpowerSoapAPI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebpowerSoapAPI(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebpowerSoapAPIPort
     */
    @WebEndpoint(name = "WebpowerSoapAPIPort")
    public WebpowerSoapAPIPort getWebpowerSoapAPIPort() {
        return super.getPort(new QName("http://dmdelivery.com/webservice/", "WebpowerSoapAPIPort"), WebpowerSoapAPIPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebpowerSoapAPIPort
     */
    @WebEndpoint(name = "WebpowerSoapAPIPort")
    public WebpowerSoapAPIPort getWebpowerSoapAPIPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dmdelivery.com/webservice/", "WebpowerSoapAPIPort"), WebpowerSoapAPIPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBPOWERSOAPAPI_EXCEPTION!= null) {
            throw WEBPOWERSOAPAPI_EXCEPTION;
        }
        return WEBPOWERSOAPAPI_WSDL_LOCATION;
    }

}