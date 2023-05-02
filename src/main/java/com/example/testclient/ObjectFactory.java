
package com.example.testclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.testclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendPerson_QNAME = new QName("http://server.example.com/", "sendPerson");
    private final static QName _SendPersonResponse_QNAME = new QName("http://server.example.com/", "sendPersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.testclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendPerson }
     * 
     */
    public SendPerson createSendPerson() {
        return new SendPerson();
    }

    /**
     * Create an instance of {@link SendPersonResponse }
     * 
     */
    public SendPersonResponse createSendPersonResponse() {
        return new SendPersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.com/", name = "sendPerson")
    public JAXBElement<SendPerson> createSendPerson(SendPerson value) {
        return new JAXBElement<SendPerson>(_SendPerson_QNAME, SendPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.example.com/", name = "sendPersonResponse")
    public JAXBElement<SendPersonResponse> createSendPersonResponse(SendPersonResponse value) {
        return new JAXBElement<SendPersonResponse>(_SendPersonResponse_QNAME, SendPersonResponse.class, null, value);
    }

}
