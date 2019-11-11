/**
 * KOPSWebServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class KOPSWebServicesLocator extends org.apache.axis.client.Service implements tr.com.yurticikargo.ShippingOrderDispatcherServices.KOPSWebServices {

    public KOPSWebServicesLocator() {
    }


    public KOPSWebServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public KOPSWebServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ShippingOrderDispatcherServicesPort
    private java.lang.String ShippingOrderDispatcherServicesPort_address = "http://webservices.yurticikargo.com:8080/KOPSWebServices/ShippingOrderDispatcherServices";

    public java.lang.String getShippingOrderDispatcherServicesPortAddress() {
        return ShippingOrderDispatcherServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ShippingOrderDispatcherServicesPortWSDDServiceName = "ShippingOrderDispatcherServicesPort";

    public java.lang.String getShippingOrderDispatcherServicesPortWSDDServiceName() {
        return ShippingOrderDispatcherServicesPortWSDDServiceName;
    }

    public void setShippingOrderDispatcherServicesPortWSDDServiceName(java.lang.String name) {
        ShippingOrderDispatcherServicesPortWSDDServiceName = name;
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServices getShippingOrderDispatcherServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ShippingOrderDispatcherServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getShippingOrderDispatcherServicesPort(endpoint);
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServices getShippingOrderDispatcherServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServicesBindingStub _stub = new tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServicesBindingStub(portAddress, this);
            _stub.setPortName(getShippingOrderDispatcherServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setShippingOrderDispatcherServicesPortEndpointAddress(java.lang.String address) {
        ShippingOrderDispatcherServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServices.class.isAssignableFrom(serviceEndpointInterface)) {
                tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServicesBindingStub _stub = new tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServicesBindingStub(new java.net.URL(ShippingOrderDispatcherServicesPort_address), this);
                _stub.setPortName(getShippingOrderDispatcherServicesPortWSDDServiceName());
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
        if ("ShippingOrderDispatcherServicesPort".equals(inputPortName)) {
            return getShippingOrderDispatcherServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "KOPSWebServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShippingOrderDispatcherServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ShippingOrderDispatcherServicesPort".equals(portName)) {
            setShippingOrderDispatcherServicesPortEndpointAddress(address);
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
