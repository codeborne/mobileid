/**
 * KeyID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public class KeyID implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected KeyID(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RSA = "RSA";
    public static final java.lang.String _ECC = "ECC";
    public static final java.lang.String _SIGN_RSA = "SIGN_RSA";
    public static final java.lang.String _SIGN_ECC = "SIGN_ECC";
    public static final java.lang.String _AUTH_RSA = "AUTH_RSA";
    public static final java.lang.String _AUTH_ECC = "AUTH_ECC";
    public static final KeyID RSA = new KeyID(_RSA);
    public static final KeyID ECC = new KeyID(_ECC);
    public static final KeyID SIGN_RSA = new KeyID(_SIGN_RSA);
    public static final KeyID SIGN_ECC = new KeyID(_SIGN_ECC);
    public static final KeyID AUTH_RSA = new KeyID(_AUTH_RSA);
    public static final KeyID AUTH_ECC = new KeyID(_AUTH_ECC);
    public java.lang.String getValue() { return _value_;}
    public static KeyID fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        KeyID enumeration = (KeyID)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static KeyID fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(KeyID.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "KeyID"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
