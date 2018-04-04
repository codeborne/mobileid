/**
 * GetMobileAuthenticateStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public class GetMobileAuthenticateStatusRequest  extends com.codeborne.security.digidoc_v2.AbstractGetStatusRequestType  implements java.io.Serializable {
    /* If 'TRUE', certificate of the user is returned.
     *                                     Certificate is useful if AP wants
     * to save it and/or
     *                                     independently verify correctness
     * of the signature
     *                                     and validation data. */
    private java.lang.Boolean returnCertData;

    /* If 'TRUE', OCSP response to the certificate
     *                                     validity query is returned. */
    private java.lang.Boolean returnRevocationData;

    public GetMobileAuthenticateStatusRequest() {
    }

    public GetMobileAuthenticateStatusRequest(
           java.lang.String sesscode,
           java.lang.Boolean waitSignature,
           java.lang.Boolean returnCertData,
           java.lang.Boolean returnRevocationData) {
        super(
            sesscode,
            waitSignature);
        this.returnCertData = returnCertData;
        this.returnRevocationData = returnRevocationData;
    }


    /**
     * Gets the returnCertData value for this GetMobileAuthenticateStatusRequest.
     * 
     * @return returnCertData   * If 'TRUE', certificate of the user is returned.
     *                                     Certificate is useful if AP wants
     * to save it and/or
     *                                     independently verify correctness
     * of the signature
     *                                     and validation data.
     */
    public java.lang.Boolean getReturnCertData() {
        return returnCertData;
    }


    /**
     * Sets the returnCertData value for this GetMobileAuthenticateStatusRequest.
     * 
     * @param returnCertData   * If 'TRUE', certificate of the user is returned.
     *                                     Certificate is useful if AP wants
     * to save it and/or
     *                                     independently verify correctness
     * of the signature
     *                                     and validation data.
     */
    public void setReturnCertData(java.lang.Boolean returnCertData) {
        this.returnCertData = returnCertData;
    }


    /**
     * Gets the returnRevocationData value for this GetMobileAuthenticateStatusRequest.
     * 
     * @return returnRevocationData   * If 'TRUE', OCSP response to the certificate
     *                                     validity query is returned.
     */
    public java.lang.Boolean getReturnRevocationData() {
        return returnRevocationData;
    }


    /**
     * Sets the returnRevocationData value for this GetMobileAuthenticateStatusRequest.
     * 
     * @param returnRevocationData   * If 'TRUE', OCSP response to the certificate
     *                                     validity query is returned.
     */
    public void setReturnRevocationData(java.lang.Boolean returnRevocationData) {
        this.returnRevocationData = returnRevocationData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMobileAuthenticateStatusRequest)) return false;
        GetMobileAuthenticateStatusRequest other = (GetMobileAuthenticateStatusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.returnCertData==null && other.getReturnCertData()==null) || 
             (this.returnCertData!=null &&
              this.returnCertData.equals(other.getReturnCertData()))) &&
            ((this.returnRevocationData==null && other.getReturnRevocationData()==null) || 
             (this.returnRevocationData!=null &&
              this.returnRevocationData.equals(other.getReturnRevocationData())));
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
        if (getReturnCertData() != null) {
            _hashCode += getReturnCertData().hashCode();
        }
        if (getReturnRevocationData() != null) {
            _hashCode += getReturnRevocationData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMobileAuthenticateStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", ">GetMobileAuthenticateStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCertData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReturnCertData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnRevocationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReturnRevocationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
