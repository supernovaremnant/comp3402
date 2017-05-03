
package helloservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DivideNumbersException", targetNamespace = "http://helloservice/")
public class DivideNumbersException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DivideNumbersException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DivideNumbersException_Exception(String message, DivideNumbersException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DivideNumbersException_Exception(String message, DivideNumbersException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: helloservice.DivideNumbersException
     */
    public DivideNumbersException getFaultInfo() {
        return faultInfo;
    }

}