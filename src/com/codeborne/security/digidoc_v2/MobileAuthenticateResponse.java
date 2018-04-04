/**
 * MobileAuthenticateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public class MobileAuthenticateResponse  extends com.codeborne.security.digidoc_v2.AbstractResponseType  implements java.io.Serializable {
    /* The data to be signed by the user. Consists of mixture of
     *                                     data sent by Application Provider
     * in SPChallenge (10
     *                                     bytes) field of the query and
     * data added by DigiDocService (also 10
     *                                     bytes).
     *                                     Returned only if SPChallenge field
     * in the query was set. */
    private java.lang.String challenge;

    public MobileAuthenticateResponse() {
    }

    public MobileAuthenticateResponse(
           java.lang.String sesscode,
           java.lang.String challengeID,
           java.lang.String challenge) {
        super(
            sesscode,
            challengeID);
        this.challenge = challenge;
    }


    /**
     * Gets the challenge value for this MobileAuthenticateResponse.
     * 
     * @return challenge   * The data to be signed by the user. Consists of mixture of
     *                                     data sent by Application Provider
     * in SPChallenge (10
     *                                     bytes) field of the query and
     * data added by DigiDocService (also 10
     *                                     bytes).
     *                                     Returned only if SPChallenge field
     * in the query was set.
     */
    public java.lang.String getChallenge() {
        return challenge;
    }


    /**
     * Sets the challenge value for this MobileAuthenticateResponse.
     * 
     * @param challenge   * The data to be signed by the user. Consists of mixture of
     *                                     data sent by Application Provider
     * in SPChallenge (10
     *                                     bytes) field of the query and
     * data added by DigiDocService (also 10
     *                                     bytes).
     *                                     Returned only if SPChallenge field
     * in the query was set.
     */
    public void setChallenge(java.lang.String challenge) {
        this.challenge = challenge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileAuthenticateResponse)) return false;
        MobileAuthenticateResponse other = (MobileAuthenticateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.challenge==null && other.getChallenge()==null) || 
             (this.challenge!=null &&
              this.challenge.equals(other.getChallenge())));
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
        if (getChallenge() != null) {
            _hashCode += getChallenge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileAuthenticateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", ">MobileAuthenticateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Challenge"));
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
