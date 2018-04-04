/**
 * AbstractGetStatusRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public abstract class AbstractGetStatusRequestType  extends com.codeborne.security.digidoc_v2.SessionAwareType  implements java.io.Serializable {
    /* If „TRUE“ then the Service will wait for response from MSSP
     * before
     *                                 responding. „FALSE“ will cause the
     * Service to respond immediately. */
    private java.lang.Boolean waitSignature;

    public AbstractGetStatusRequestType() {
    }

    public AbstractGetStatusRequestType(
           java.lang.String sesscode,
           java.lang.Boolean waitSignature) {
        super(
            sesscode);
        this.waitSignature = waitSignature;
    }


    /**
     * Gets the waitSignature value for this AbstractGetStatusRequestType.
     * 
     * @return waitSignature   * If „TRUE“ then the Service will wait for response from MSSP
     * before
     *                                 responding. „FALSE“ will cause the
     * Service to respond immediately.
     */
    public java.lang.Boolean getWaitSignature() {
        return waitSignature;
    }


    /**
     * Sets the waitSignature value for this AbstractGetStatusRequestType.
     * 
     * @param waitSignature   * If „TRUE“ then the Service will wait for response from MSSP
     * before
     *                                 responding. „FALSE“ will cause the
     * Service to respond immediately.
     */
    public void setWaitSignature(java.lang.Boolean waitSignature) {
        this.waitSignature = waitSignature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractGetStatusRequestType)) return false;
        AbstractGetStatusRequestType other = (AbstractGetStatusRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.waitSignature==null && other.getWaitSignature()==null) || 
             (this.waitSignature!=null &&
              this.waitSignature.equals(other.getWaitSignature())));
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
        if (getWaitSignature() != null) {
            _hashCode += getWaitSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractGetStatusRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "AbstractGetStatusRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waitSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WaitSignature"));
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
