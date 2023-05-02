package com.example.testclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-01-25T14:03:58.886+03:00
 * Generated source version: 3.5.5
 *
 */
@WebServiceClient(name = "Tester",
                  wsdlLocation = "file:/Users/holdsworth/IdeaProjects/TestClient/src/main/java/com/example/testclient/Tester2.wsdl",
                  targetNamespace = "http://server.example.com/")
public class Tester extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.example.com/", "Tester");
    public final static QName TestServicePort = new QName("http://server.example.com/", "TestServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/holdsworth/IdeaProjects/TestClient/src/main/java/com/example/testclient/Tester2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Tester.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/holdsworth/IdeaProjects/TestClient/src/main/java/com/example/testclient/Tester2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Tester(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Tester(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Tester() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Tester(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Tester(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Tester(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TestService
     */
    @WebEndpoint(name = "TestServicePort")
    public TestService getTestServicePort() {
        return super.getPort(TestServicePort, TestService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TestService
     */
    @WebEndpoint(name = "TestServicePort")
    public TestService getTestServicePort(WebServiceFeature... features) {
        return super.getPort(TestServicePort, TestService.class, features);
    }

}