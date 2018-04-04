/**
 * SessionAwareType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public abstract class SessionAwareType  implements java.io.Serializable {
    /* Session identifier */
    private java.lang.String sesscode;

    public SessionAwareType() {
    }

    public SessionAwareType(
           java.lang.String sesscode) {
           this.sesscode = sesscode;
    }


    /**
     * Gets the sesscode value for this SessionAwareType.
     * 
     * @return sesscode   * Session identifier
     */
    public java.lang.String getSesscode() {
        return sesscode;
    }


    /**
     * Sets the sesscode value for this SessionAwareType.
     * 
     * @param sesscode   * Session identifier
     */
    public void setSesscode(java.lang.String sesscode) {
        this.sesscode = sesscode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionAwareType)) return false;
        SessionAwareType other = (SessionAwareType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sesscode==null && other.getSesscode()==null) || 
             (this.sesscode!=null &&
              this.sesscode.equals(other.getSesscode())));
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
        if (getSesscode() != null) {
            _hashCode += getSesscode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionAwareType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "SessionAwareType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sesscode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sesscode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
