/**
 * AbstractResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public abstract class AbstractResponseType  extends com.codeborne.security.digidoc_v2.SessionAwareType  implements java.io.Serializable {
    /* 4-character control code calculated on basis of the
     *                                 Challenge value to be signed. This
     * code is displayed on
     *                                 mobile phone’s screen and shall be
     * also displayed by
     *                                 Application Provider in order to ensure
     * the user on
     *                                 authencity of the query.
     *                                 NB! Application provider must ask
     * user to verify that those codes
     *                                 are the same. */
    private java.lang.String challengeID;

    public AbstractResponseType() {
    }

    public AbstractResponseType(
           java.lang.String sesscode,
           java.lang.String challengeID) {
        super(
            sesscode);
        this.challengeID = challengeID;
    }


    /**
     * Gets the challengeID value for this AbstractResponseType.
     * 
     * @return challengeID   * 4-character control code calculated on basis of the
     *                                 Challenge value to be signed. This
     * code is displayed on
     *                                 mobile phone’s screen and shall be
     * also displayed by
     *                                 Application Provider in order to ensure
     * the user on
     *                                 authencity of the query.
     *                                 NB! Application provider must ask
     * user to verify that those codes
     *                                 are the same.
     */
    public java.lang.String getChallengeID() {
        return challengeID;
    }


    /**
     * Sets the challengeID value for this AbstractResponseType.
     * 
     * @param challengeID   * 4-character control code calculated on basis of the
     *                                 Challenge value to be signed. This
     * code is displayed on
     *                                 mobile phone’s screen and shall be
     * also displayed by
     *                                 Application Provider in order to ensure
     * the user on
     *                                 authencity of the query.
     *                                 NB! Application provider must ask
     * user to verify that those codes
     *                                 are the same.
     */
    public void setChallengeID(java.lang.String challengeID) {
        this.challengeID = challengeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractResponseType)) return false;
        AbstractResponseType other = (AbstractResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.challengeID==null && other.getChallengeID()==null) || 
             (this.challengeID!=null &&
              this.challengeID.equals(other.getChallengeID())));
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
        if (getChallengeID() != null) {
            _hashCode += getChallengeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "AbstractResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChallengeID"));
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
