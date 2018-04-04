/**
 * MobileIdServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public class MobileIdServiceLocator extends org.apache.axis.client.Service implements com.codeborne.security.digidoc_v2.MobileIdService {

    public MobileIdServiceLocator() {
    }


    public MobileIdServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MobileIdServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MobileIdService
    private java.lang.String MobileIdService_address = "https://digidocservice.sk.ee/v2/";

    public java.lang.String getMobileIdServiceAddress() {
        return MobileIdService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MobileIdServiceWSDDServiceName = "MobileIdService";

    public java.lang.String getMobileIdServiceWSDDServiceName() {
        return MobileIdServiceWSDDServiceName;
    }

    public void setMobileIdServiceWSDDServiceName(java.lang.String name) {
        MobileIdServiceWSDDServiceName = name;
    }

    public com.codeborne.security.digidoc_v2.MobileId getMobileIdService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MobileIdService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMobileIdService(endpoint);
    }

    public com.codeborne.security.digidoc_v2.MobileId getMobileIdService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.codeborne.security.digidoc_v2.MobileIdServiceStub _stub = new com.codeborne.security.digidoc_v2.MobileIdServiceStub(portAddress, this);
            _stub.setPortName(getMobileIdServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMobileIdServiceEndpointAddress(java.lang.String address) {
        MobileIdService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.codeborne.security.digidoc_v2.MobileId.class.isAssignableFrom(serviceEndpointInterface)) {
                com.codeborne.security.digidoc_v2.MobileIdServiceStub _stub = new com.codeborne.security.digidoc_v2.MobileIdServiceStub(new java.net.URL(MobileIdService_address), this);
                _stub.setPortName(getMobileIdServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MobileIdService".equals(inputPortName)) {
            return getMobileIdService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "MobileIdService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "MobileIdService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MobileIdService".equals(portName)) {
            setMobileIdServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
