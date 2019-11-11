/**
 * ShippingOrderDispatcherServicesBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShippingOrderDispatcherServicesBindingStub extends org.apache.axis.client.Stub implements tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServices {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelReturnShipmentCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsUserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "returnCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "extendedBaseResultVO"));
        oper.setReturnClass(tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ExtendedBaseResultVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsUserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cargoKeys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingCancelResultVO"));
        oper.setReturnClass(tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelResultVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ShippingOrderResultVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsUserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ShippingOrderVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShippingOrderVO"), tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderVO[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingOrderResultVO"));
        oper.setReturnClass(tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ShippingOrderResultVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createShipmentDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsUserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ShippingOrderVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingOrderCreateVO"), tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderCreateVO[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingOrderResultVO"));
        oper.setReturnClass(tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ShippingOrderResultVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsUserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keyType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addHistoricalData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "onlyTracking"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingDeliveryResultVO"));
        oper.setReturnClass(tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryResultVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ShippingDeliveryVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryShipmentDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsUserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keyType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addHistoricalData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "onlyTracking"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "jsonData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shipmentDeliveryResultVO"));
        oper.setReturnClass(tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryResultVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ShipmentDeliveryResultVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveReturnShipmentCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsUserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "returnCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "maxCount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "extendedBaseResultVO"));
        oper.setReturnClass(tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ExtendedBaseResultVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[6] = oper;

    }

    public ShippingOrderDispatcherServicesBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ShippingOrderDispatcherServicesBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ShippingOrderDispatcherServicesBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "baseResultVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.BaseResultVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "extendedBaseResultVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "InvDocCargoVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocCargoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "InvDocFieldVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocFieldVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shipmentDeliveryDetailVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryDetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShipmentDeliveryItemDetailVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryItemDetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shipmentDeliveryResultVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryResultVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingCancelDetailVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelDetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingCancelResultVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelResultVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingDeliveryDetailVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryDetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShippingDeliveryItemDetailVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryItemDetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingDeliveryResultVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryResultVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingOrderCreateVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderCreateVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingOrderDetailVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingOrderResultVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShippingOrderVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.WSExceptions.YurticikargoWSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO cancelReturnShipmentCode(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String fieldName, java.lang.String returnCode) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "cancelReturnShipmentCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUserName, wsPassword, wsLanguage, fieldName, returnCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelResultVO cancelShipment(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String userLanguage, java.lang.String[] cargoKeys) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "cancelShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUserName, wsPassword, userLanguage, cargoKeys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelResultVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelResultVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelResultVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO createShipment(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String userLanguage, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderVO[] shippingOrderVO) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "createShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUserName, wsPassword, userLanguage, shippingOrderVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO createShipmentDetail(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String userLanguage, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderCreateVO[] shippingOrderVO) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "createShipmentDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUserName, wsPassword, userLanguage, shippingOrderVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryResultVO queryShipment(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String[] keys, int keyType, boolean addHistoricalData, boolean onlyTracking) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "queryShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUserName, wsPassword, wsLanguage, keys, new java.lang.Integer(keyType), new java.lang.Boolean(addHistoricalData), new java.lang.Boolean(onlyTracking)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryResultVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryResultVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryResultVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryResultVO queryShipmentDetail(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String[] keys, int keyType, boolean addHistoricalData, boolean onlyTracking, boolean jsonData) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "queryShipmentDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUserName, wsPassword, wsLanguage, keys, new java.lang.Integer(keyType), new java.lang.Boolean(addHistoricalData), new java.lang.Boolean(onlyTracking), new java.lang.Boolean(jsonData)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryResultVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryResultVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryResultVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO saveReturnShipmentCode(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String fieldName, java.lang.String returnCode, java.lang.String startDate, java.lang.String endDate, int maxCount) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "saveReturnShipmentCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUserName, wsPassword, wsLanguage, fieldName, returnCode, startDate, endDate, new java.lang.Integer(maxCount)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
