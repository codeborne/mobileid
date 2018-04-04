/**
 * GetMobileSignHashStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public class GetMobileSignHashStatusResponse  extends com.codeborne.security.digidoc_v2.AbstractGetStatusResponseType  implements java.io.Serializable {
    /* Session id */
    private java.lang.String sesscode;

    /* Session certificate int PEM format */
    private byte[] certificateData;

    /* OCSP response for certificate */
    private byte[] revocationData;

    public GetMobileSignHashStatusResponse() {
    }

    public GetMobileSignHashStatusResponse(
           com.codeborne.security.digidoc_v2.ProcessStatusType status,
           byte[] signature,
           java.lang.String sesscode,
           byte[] certificateData,
           byte[] revocationData) {
        super(
            status,
            signature);
        this.sesscode = sesscode;
        this.certificateData = certificateData;
        this.revocationData = revocationData;
    }


    /**
     * Gets the sesscode value for this GetMobileSignHashStatusResponse.
     * 
     * @return sesscode   * Session id
     */
    public java.lang.String getSesscode() {
        return sesscode;
    }


    /**
     * Sets the sesscode value for this GetMobileSignHashStatusResponse.
     * 
     * @param sesscode   * Session id
     */
    public void setSesscode(java.lang.String sesscode) {
        this.sesscode = sesscode;
    }


    /**
     * Gets the certificateData value for this GetMobileSignHashStatusResponse.
     * 
     * @return certificateData   * Session certificate int PEM format
     */
    public byte[] getCertificateData() {
        return certificateData;
    }


    /**
     * Sets the certificateData value for this GetMobileSignHashStatusResponse.
     * 
     * @param certificateData   * Session certificate int PEM format
     */
    public void setCertificateData(byte[] certificateData) {
        this.certificateData = certificateData;
    }


    /**
     * Gets the revocationData value for this GetMobileSignHashStatusResponse.
     * 
     * @return revocationData   * OCSP response for certificate
     */
    public byte[] getRevocationData() {
        return revocationData;
    }


    /**
     * Sets the revocationData value for this GetMobileSignHashStatusResponse.
     * 
     * @param revocationData   * OCSP response for certificate
     */
    public void setRevocationData(byte[] revocationData) {
        this.revocationData = revocationData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMobileSignHashStatusResponse)) return false;
        GetMobileSignHashStatusResponse other = (GetMobileSignHashStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sesscode==null && other.getSesscode()==null) || 
             (this.sesscode!=null &&
              this.sesscode.equals(other.getSesscode()))) &&
            ((this.certificateData==null && other.getCertificateData()==null) || 
             (this.certificateData!=null &&
              java.util.Arrays.equals(this.certificateData, other.getCertificateData()))) &&
            ((this.revocationData==null && other.getRevocationData()==null) || 
             (this.revocationData!=null &&
              java.util.Arrays.equals(this.revocationData, other.getRevocationData())));
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
        if (getSesscode() != null) {
            _hashCode += getSesscode().hashCode();
        }
        if (getCertificateData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificateData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificateData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevocationData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevocationData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevocationData(), i);
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
        new org.apache.axis.description.TypeDesc(GetMobileSignHashStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", ">GetMobileSignHashStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sesscode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sesscode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CertificateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revocationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RevocationData"));
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
