package com.example.testclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-01-25T14:03:58.883+03:00
 * Generated source version: 3.5.5
 *
 */
@WebService(targetNamespace = "http://server.example.com/", name = "TestService")
@XmlSeeAlso({ObjectFactory.class})
public interface TestService {

    @WebMethod
    @Action(input = "http://server.example.com/TestService/sendPersonRequest", output = "http://server.example.com/TestService/sendPersonResponse")
    @RequestWrapper(localName = "sendPerson", targetNamespace = "http://server.example.com/", className = "com.example.testclient.SendPerson")
    @ResponseWrapper(localName = "sendPersonResponse", targetNamespace = "http://server.example.com/", className = "com.example.testclient.SendPersonResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.example.testclient.Person sendPerson(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2
    );
}
