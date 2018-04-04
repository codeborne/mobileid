/**
 * AbstractGetStatusResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public abstract class AbstractGetStatusResponseType  implements java.io.Serializable {
    /* Process status */
    private com.codeborne.security.digidoc_v2.ProcessStatusType status;

    /* Signature value in PKCS#1 container in BASE64
     *                         encoding.
     *                         NB! For security reasons it’s recommended
     * for
     *                         application provider to verify the signature,
     * by using a)
     *                         value that was signed (Challenge parameter
     * from
     *                         MobileAuthenticate method response), b) public
     * key
     *                         from Mobile-ID user’s certificate and c)
     *                         signature (that is calculated by RSA algorithm). */
    private byte[] signature;

    public AbstractGetStatusResponseType() {
    }

    public AbstractGetStatusResponseType(
           com.codeborne.security.digidoc_v2.ProcessStatusType status,
           byte[] signature) {
           this.status = status;
           this.signature = signature;
    }


    /**
     * Gets the status value for this AbstractGetStatusResponseType.
     * 
     * @return status   * Process status
     */
    public com.codeborne.security.digidoc_v2.ProcessStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AbstractGetStatusResponseType.
     * 
     * @param status   * Process status
     */
    public void setStatus(com.codeborne.security.digidoc_v2.ProcessStatusType status) {
        this.status = status;
    }


    /**
     * Gets the signature value for this AbstractGetStatusResponseType.
     * 
     * @return signature   * Signature value in PKCS#1 container in BASE64
     *                         encoding.
     *                         NB! For security reasons it’s recommended
     * for
     *                         application provider to verify the signature,
     * by using a)
     *                         value that was signed (Challenge parameter
     * from
     *                         MobileAuthenticate method response), b) public
     * key
     *                         from Mobile-ID user’s certificate and c)
     *                         signature (that is calculated by RSA algorithm).
     */
    public byte[] getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this AbstractGetStatusResponseType.
     * 
     * @param signature   * Signature value in PKCS#1 container in BASE64
     *                         encoding.
     *                         NB! For security reasons it’s recommended
     * for
     *                         application provider to verify the signature,
     * by using a)
     *                         value that was signed (Challenge parameter
     * from
     *                         MobileAuthenticate method response), b) public
     * key
     *                         from Mobile-ID user’s certificate and c)
     *                         signature (that is calculated by RSA algorithm).
     */
    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractGetStatusResponseType)) return false;
        AbstractGetStatusResponseType other = (AbstractGetStatusResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              java.util.Arrays.equals(this.signature, other.getSignature())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSignature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignature(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractGetStatusResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "AbstractGetStatusResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "ProcessStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
