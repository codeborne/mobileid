/**
 * MobileSignHashRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public class MobileSignHashRequest  extends com.codeborne.security.digidoc_v2.AbstractRequestType  implements java.io.Serializable {
    /* Hash to sign in HEX form. */
    private java.lang.String hash;

    /* Hash algorithm */
    private com.codeborne.security.digidoc_v2.HashType hashType;

    /* Key algorithm to sign the hash */
    private com.codeborne.security.digidoc_v2.KeyID keyID;

    public MobileSignHashRequest() {
    }

    public MobileSignHashRequest(
           java.lang.String IDCode,
           java.lang.String phoneNo,
           com.codeborne.security.digidoc_v2.LanguageType language,
           java.lang.String serviceName,
           java.lang.String messageToDisplay,
           java.lang.String hash,
           com.codeborne.security.digidoc_v2.HashType hashType,
           com.codeborne.security.digidoc_v2.KeyID keyID) {
        super(
            IDCode,
            phoneNo,
            language,
            serviceName,
            messageToDisplay);
        this.hash = hash;
        this.hashType = hashType;
        this.keyID = keyID;
    }


    /**
     * Gets the hash value for this MobileSignHashRequest.
     * 
     * @return hash   * Hash to sign in HEX form.
     */
    public java.lang.String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this MobileSignHashRequest.
     * 
     * @param hash   * Hash to sign in HEX form.
     */
    public void setHash(java.lang.String hash) {
        this.hash = hash;
    }


    /**
     * Gets the hashType value for this MobileSignHashRequest.
     * 
     * @return hashType   * Hash algorithm
     */
    public com.codeborne.security.digidoc_v2.HashType getHashType() {
        return hashType;
    }


    /**
     * Sets the hashType value for this MobileSignHashRequest.
     * 
     * @param hashType   * Hash algorithm
     */
    public void setHashType(com.codeborne.security.digidoc_v2.HashType hashType) {
        this.hashType = hashType;
    }


    /**
     * Gets the keyID value for this MobileSignHashRequest.
     * 
     * @return keyID   * Key algorithm to sign the hash
     */
    public com.codeborne.security.digidoc_v2.KeyID getKeyID() {
        return keyID;
    }


    /**
     * Sets the keyID value for this MobileSignHashRequest.
     * 
     * @param keyID   * Key algorithm to sign the hash
     */
    public void setKeyID(com.codeborne.security.digidoc_v2.KeyID keyID) {
        this.keyID = keyID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileSignHashRequest)) return false;
        MobileSignHashRequest other = (MobileSignHashRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hash==null && other.getHash()==null) || 
             (this.hash!=null &&
              this.hash.equals(other.getHash()))) &&
            ((this.hashType==null && other.getHashType()==null) || 
             (this.hashType!=null &&
              this.hashType.equals(other.getHashType()))) &&
            ((this.keyID==null && other.getKeyID()==null) || 
             (this.keyID!=null &&
              this.keyID.equals(other.getKeyID())));
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
        if (getHash() != null) {
            _hashCode += getHash().hashCode();
        }
        if (getHashType() != null) {
            _hashCode += getHashType().hashCode();
        }
        if (getKeyID() != null) {
            _hashCode += getKeyID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileSignHashRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", ">MobileSignHashRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HashType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "HashType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "KeyID"));
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
