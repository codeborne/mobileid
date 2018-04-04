/**
 * ProcessStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public class ProcessStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProcessStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EXPIRED_TRANSACTION = "EXPIRED_TRANSACTION";
    public static final java.lang.String _USER_AUTHENTICATED = "USER_AUTHENTICATED";
    public static final java.lang.String _USER_CANCEL = "USER_CANCEL";
    public static final java.lang.String _SIGNATURE = "SIGNATURE";
    public static final java.lang.String _OUTSTANDING_TRANSACTION = "OUTSTANDING_TRANSACTION";
    public static final java.lang.String _MID_NOT_READY = "MID_NOT_READY";
    public static final java.lang.String _PHONE_ABSENT = "PHONE_ABSENT";
    public static final java.lang.String _SENDING_ERROR = "SENDING_ERROR";
    public static final java.lang.String _SIM_ERROR = "SIM_ERROR";
    public static final java.lang.String _OCSP_UNAUTHORIZED = "OCSP_UNAUTHORIZED";
    public static final java.lang.String _INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final java.lang.String _REVOKED_CERTIFICATE = "REVOKED_CERTIFICATE";
    public static final java.lang.String _NOT_VALID = "NOT_VALID";
    public static final java.lang.String _PHONE_TIMEOUT = "PHONE_TIMEOUT";
    public static final ProcessStatusType EXPIRED_TRANSACTION = new ProcessStatusType(_EXPIRED_TRANSACTION);
    public static final ProcessStatusType USER_AUTHENTICATED = new ProcessStatusType(_USER_AUTHENTICATED);
    public static final ProcessStatusType USER_CANCEL = new ProcessStatusType(_USER_CANCEL);
    public static final ProcessStatusType SIGNATURE = new ProcessStatusType(_SIGNATURE);
    public static final ProcessStatusType OUTSTANDING_TRANSACTION = new ProcessStatusType(_OUTSTANDING_TRANSACTION);
    public static final ProcessStatusType MID_NOT_READY = new ProcessStatusType(_MID_NOT_READY);
    public static final ProcessStatusType PHONE_ABSENT = new ProcessStatusType(_PHONE_ABSENT);
    public static final ProcessStatusType SENDING_ERROR = new ProcessStatusType(_SENDING_ERROR);
    public static final ProcessStatusType SIM_ERROR = new ProcessStatusType(_SIM_ERROR);
    public static final ProcessStatusType OCSP_UNAUTHORIZED = new ProcessStatusType(_OCSP_UNAUTHORIZED);
    public static final ProcessStatusType INTERNAL_ERROR = new ProcessStatusType(_INTERNAL_ERROR);
    public static final ProcessStatusType REVOKED_CERTIFICATE = new ProcessStatusType(_REVOKED_CERTIFICATE);
    public static final ProcessStatusType NOT_VALID = new ProcessStatusType(_NOT_VALID);
    public static final ProcessStatusType PHONE_TIMEOUT = new ProcessStatusType(_PHONE_TIMEOUT);
    public java.lang.String getValue() { return _value_;}
    public static ProcessStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProcessStatusType enumeration = (ProcessStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProcessStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProcessStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "ProcessStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
