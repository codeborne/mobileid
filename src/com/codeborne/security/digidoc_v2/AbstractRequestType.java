/**
 * AbstractRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public abstract class AbstractRequestType  implements java.io.Serializable {
    /* Personal Identification Code of the user */
    private java.lang.String IDCode;

    /* User’s phone number with country code in form
     *                         +xxxxxxxxx (e.g. +3706234566). */
    private java.lang.String phoneNo;

    /* Language for user dialog in mobile phone.
     *                         3-letters capitalized acronyms are used. Possible
     * values:
     *                         EST,
     *                         ENG, RUS. */
    private com.codeborne.security.digidoc_v2.LanguageType language;

    /* Name of the service – previously agreed with
     *                         Application Provider and DigiDocService operator.
     * Maximum length
     *                         – 20 chars. */
    private java.lang.String serviceName;

    /* Text displayed before asking authentication or
     *                         signing PIN. Maximum length – 40 chars. */
    private java.lang.String messageToDisplay;

    public AbstractRequestType() {
    }

    public AbstractRequestType(
           java.lang.String IDCode,
           java.lang.String phoneNo,
           com.codeborne.security.digidoc_v2.LanguageType language,
           java.lang.String serviceName,
           java.lang.String messageToDisplay) {
           this.IDCode = IDCode;
           this.phoneNo = phoneNo;
           this.language = language;
           this.serviceName = serviceName;
           this.messageToDisplay = messageToDisplay;
    }


    /**
     * Gets the IDCode value for this AbstractRequestType.
     * 
     * @return IDCode   * Personal Identification Code of the user
     */
    public java.lang.String getIDCode() {
        return IDCode;
    }


    /**
     * Sets the IDCode value for this AbstractRequestType.
     * 
     * @param IDCode   * Personal Identification Code of the user
     */
    public void setIDCode(java.lang.String IDCode) {
        this.IDCode = IDCode;
    }


    /**
     * Gets the phoneNo value for this AbstractRequestType.
     * 
     * @return phoneNo   * User’s phone number with country code in form
     *                         +xxxxxxxxx (e.g. +3706234566).
     */
    public java.lang.String getPhoneNo() {
        return phoneNo;
    }


    /**
     * Sets the phoneNo value for this AbstractRequestType.
     * 
     * @param phoneNo   * User’s phone number with country code in form
     *                         +xxxxxxxxx (e.g. +3706234566).
     */
    public void setPhoneNo(java.lang.String phoneNo) {
        this.phoneNo = phoneNo;
    }


    /**
     * Gets the language value for this AbstractRequestType.
     * 
     * @return language   * Language for user dialog in mobile phone.
     *                         3-letters capitalized acronyms are used. Possible
     * values:
     *                         EST,
     *                         ENG, RUS.
     */
    public com.codeborne.security.digidoc_v2.LanguageType getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this AbstractRequestType.
     * 
     * @param language   * Language for user dialog in mobile phone.
     *                         3-letters capitalized acronyms are used. Possible
     * values:
     *                         EST,
     *                         ENG, RUS.
     */
    public void setLanguage(com.codeborne.security.digidoc_v2.LanguageType language) {
        this.language = language;
    }


    /**
     * Gets the serviceName value for this AbstractRequestType.
     * 
     * @return serviceName   * Name of the service – previously agreed with
     *                         Application Provider and DigiDocService operator.
     * Maximum length
     *                         – 20 chars.
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this AbstractRequestType.
     * 
     * @param serviceName   * Name of the service – previously agreed with
     *                         Application Provider and DigiDocService operator.
     * Maximum length
     *                         – 20 chars.
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the messageToDisplay value for this AbstractRequestType.
     * 
     * @return messageToDisplay   * Text displayed before asking authentication or
     *                         signing PIN. Maximum length – 40 chars.
     */
    public java.lang.String getMessageToDisplay() {
        return messageToDisplay;
    }


    /**
     * Sets the messageToDisplay value for this AbstractRequestType.
     * 
     * @param messageToDisplay   * Text displayed before asking authentication or
     *                         signing PIN. Maximum length – 40 chars.
     */
    public void setMessageToDisplay(java.lang.String messageToDisplay) {
        this.messageToDisplay = messageToDisplay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractRequestType)) return false;
        AbstractRequestType other = (AbstractRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDCode==null && other.getIDCode()==null) || 
             (this.IDCode!=null &&
              this.IDCode.equals(other.getIDCode()))) &&
            ((this.phoneNo==null && other.getPhoneNo()==null) || 
             (this.phoneNo!=null &&
              this.phoneNo.equals(other.getPhoneNo()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.messageToDisplay==null && other.getMessageToDisplay()==null) || 
             (this.messageToDisplay!=null &&
              this.messageToDisplay.equals(other.getMessageToDisplay())));
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
        if (getIDCode() != null) {
            _hashCode += getIDCode().hashCode();
        }
        if (getPhoneNo() != null) {
            _hashCode += getPhoneNo().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getMessageToDisplay() != null) {
            _hashCode += getMessageToDisplay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "AbstractRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IDCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PhoneNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "LanguageType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageToDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageToDisplay"));
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
