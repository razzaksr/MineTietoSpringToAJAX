//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.18 at 01:39:31 AM IST 
//


package services.loans;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services.loans package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services.loans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CallDeletionResponse }
     * 
     */
    public CallDeletionResponse createCallDeletionResponse() {
        return new CallDeletionResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link UpdateLoanResponse }
     * 
     */
    public UpdateLoanResponse createUpdateLoanResponse() {
        return new UpdateLoanResponse();
    }

    /**
     * Create an instance of {@link Loans }
     * 
     */
    public Loans createLoans() {
        return new Loans();
    }

    /**
     * Create an instance of {@link CallDeletionRequest }
     * 
     */
    public CallDeletionRequest createCallDeletionRequest() {
        return new CallDeletionRequest();
    }

    /**
     * Create an instance of {@link UpdateLoanRequest }
     * 
     */
    public UpdateLoanRequest createUpdateLoanRequest() {
        return new UpdateLoanRequest();
    }

}
