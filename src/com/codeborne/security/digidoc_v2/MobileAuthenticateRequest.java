/**
 * MobileAuthenticateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public class MobileAuthenticateRequest  extends com.codeborne.security.digidoc_v2.AbstractRequestType  implements java.io.Serializable {
    /* 10-byte random challenge generated by the
     *                                     Application Provider witch would
     * be part of the
     *                                     message for
     *                                     signing by user during authentication.
     * Must be in HEX form.
     *                                     NB!
     *                                     For security reasons it’s recommended
     * to
     *                                     always fill this
     *                                     parameter with different random
     * value every time. */
    private java.lang.String SPChallenge;

    public MobileAuthenticateRequest() {
    }

    public MobileAuthenticateRequest(
           java.lang.String IDCode,
           java.lang.String phoneNo,
           com.codeborne.security.digidoc_v2.LanguageType language,
           java.lang.String serviceName,
           java.lang.String messageToDisplay,
           java.lang.String SPChallenge) {
        super(
            IDCode,
            phoneNo,
            language,
            serviceName,
            messageToDisplay);
        this.SPChallenge = SPChallenge;
    }


    /**
     * Gets the SPChallenge value for this MobileAuthenticateRequest.
     * 
     * @return SPChallenge   * 10-byte random challenge generated by the
     *                                     Application Provider witch would
     * be part of the
     *                                     message for
     *                                     signing by user during authentication.
     * Must be in HEX form.
     *                                     NB!
     *                                     For security reasons it’s recommended
     * to
     *                                     always fill this
     *                                     parameter with different random
     * value every time.
     */
    public java.lang.String getSPChallenge() {
        return SPChallenge;
    }


    /**
     * Sets the SPChallenge value for this MobileAuthenticateRequest.
     * 
     * @param SPChallenge   * 10-byte random challenge generated by the
     *                                     Application Provider witch would
     * be part of the
     *                                     message for
     *                                     signing by user during authentication.
     * Must be in HEX form.
     *                                     NB!
     *                                     For security reasons it’s recommended
     * to
     *                                     always fill this
     *                                     parameter with different random
     * value every time.
     */
    public void setSPChallenge(java.lang.String SPChallenge) {
        this.SPChallenge = SPChallenge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileAuthenticateRequest)) return false;
        MobileAuthenticateRequest other = (MobileAuthenticateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.SPChallenge==null && other.getSPChallenge()==null) || 
             (this.SPChallenge!=null &&
              this.SPChallenge.equals(other.getSPChallenge())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSPChallenge() != null) {
            _hashCode += getSPChallenge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileAuthenticateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", ">MobileAuthenticateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SPChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}