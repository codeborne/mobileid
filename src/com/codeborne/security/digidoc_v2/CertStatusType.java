/**
 * CertStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public class CertStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CertStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _GOOD = "GOOD";
    public static final java.lang.String _REVOKED = "REVOKED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _SUSPENDED = "SUSPENDED";
    public static final java.lang.String _OCSP_UNAUTHORIZED = "OCSP_UNAUTHORIZED";
    public static final CertStatusType GOOD = new CertStatusType(_GOOD);
    public static final CertStatusType REVOKED = new CertStatusType(_REVOKED);
    public static final CertStatusType UNKNOWN = new CertStatusType(_UNKNOWN);
    public static final CertStatusType EXPIRED = new CertStatusType(_EXPIRED);
    public static final CertStatusType SUSPENDED = new CertStatusType(_SUSPENDED);
    public static final CertStatusType OCSP_UNAUTHORIZED = new CertStatusType(_OCSP_UNAUTHORIZED);
    public java.lang.String getValue() { return _value_;}
    public static CertStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CertStatusType enumeration = (CertStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CertStatusType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "CertStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
