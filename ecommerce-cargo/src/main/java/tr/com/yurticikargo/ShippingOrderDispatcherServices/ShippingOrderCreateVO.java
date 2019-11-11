/**
 * ShippingOrderCreateVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShippingOrderCreateVO  extends tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderVO  implements java.io.Serializable {
    private java.lang.String orderData;

    public ShippingOrderCreateVO() {
    }

    public ShippingOrderCreateVO(
           java.lang.String cargoKey,
           java.lang.String invoiceKey,
           java.lang.String receiverCustName,
           java.lang.String receiverAddress,
           java.lang.String cityName,
           java.lang.String townName,
           java.lang.String receiverPhone1,
           java.lang.String receiverPhone2,
           java.lang.String receiverPhone3,
           java.lang.String emailAddress,
           long taxOfficeId,
           java.lang.String taxNumber,
           java.lang.String taxOfficeName,
           java.lang.Double desi,
           java.lang.Double kg,
           int cargoCount,
           java.lang.String waybillNo,
           java.lang.String specialField1,
           java.lang.String specialField2,
           java.lang.String specialField3,
           java.lang.Double ttInvoiceAmount,
           long ttDocumentId,
           java.lang.String ttCollectionType,
           java.lang.String ttDocumentSaveType,
           long dcSelectedCredit,
           long dcCreditRule,
           java.lang.String description,
           java.lang.String orgGeoCode,
           java.lang.String privilegeOrder,
           java.lang.String custProdId,
           java.lang.String orgReceiverCustId,
           java.lang.String orderData) {
        super(
            cargoKey,
            invoiceKey,
            receiverCustName,
            receiverAddress,
            cityName,
            townName,
            receiverPhone1,
            receiverPhone2,
            receiverPhone3,
            emailAddress,
            taxOfficeId,
            taxNumber,
            taxOfficeName,
            desi,
            kg,
            cargoCount,
            waybillNo,
            specialField1,
            specialField2,
            specialField3,
            ttInvoiceAmount,
            ttDocumentId,
            ttCollectionType,
            ttDocumentSaveType,
            dcSelectedCredit,
            dcCreditRule,
            description,
            orgGeoCode,
            privilegeOrder,
            custProdId,
            orgReceiverCustId);
        this.orderData = orderData;
    }


    /**
     * Gets the orderData value for this ShippingOrderCreateVO.
     * 
     * @return orderData
     */
    public java.lang.String getOrderData() {
        return orderData;
    }


    /**
     * Sets the orderData value for this ShippingOrderCreateVO.
     * 
     * @param orderData
     */
    public void setOrderData(java.lang.String orderData) {
        this.orderData = orderData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingOrderCreateVO)) return false;
        ShippingOrderCreateVO other = (ShippingOrderCreateVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderData==null && other.getOrderData()==null) || 
             (this.orderData!=null &&
              this.orderData.equals(other.getOrderData())));
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
        if (getOrderData() != null) {
            _hashCode += getOrderData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingOrderCreateVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingOrderCreateVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderData"));
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
