/**
 * ShipmentDeliveryResultVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShipmentDeliveryResultVO  extends tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO  implements java.io.Serializable {
    private long count;

    private java.lang.String deliveryResultData;

    private long senderCustId;

    private tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryDetailVO[] shipmentDeliveryDetailVO;

    public ShipmentDeliveryResultVO() {
    }

    public ShipmentDeliveryResultVO(
           java.lang.String outFlag,
           java.lang.String outResult,
           java.lang.String errCode,
           long count,
           java.lang.String deliveryResultData,
           long senderCustId,
           tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryDetailVO[] shipmentDeliveryDetailVO) {
        super(
            outFlag,
            outResult,
            errCode);
        this.count = count;
        this.deliveryResultData = deliveryResultData;
        this.senderCustId = senderCustId;
        this.shipmentDeliveryDetailVO = shipmentDeliveryDetailVO;
    }


    /**
     * Gets the count value for this ShipmentDeliveryResultVO.
     * 
     * @return count
     */
    public long getCount() {
        return count;
    }


    /**
     * Sets the count value for this ShipmentDeliveryResultVO.
     * 
     * @param count
     */
    public void setCount(long count) {
        this.count = count;
    }


    /**
     * Gets the deliveryResultData value for this ShipmentDeliveryResultVO.
     * 
     * @return deliveryResultData
     */
    public java.lang.String getDeliveryResultData() {
        return deliveryResultData;
    }


    /**
     * Sets the deliveryResultData value for this ShipmentDeliveryResultVO.
     * 
     * @param deliveryResultData
     */
    public void setDeliveryResultData(java.lang.String deliveryResultData) {
        this.deliveryResultData = deliveryResultData;
    }


    /**
     * Gets the senderCustId value for this ShipmentDeliveryResultVO.
     * 
     * @return senderCustId
     */
    public long getSenderCustId() {
        return senderCustId;
    }


    /**
     * Sets the senderCustId value for this ShipmentDeliveryResultVO.
     * 
     * @param senderCustId
     */
    public void setSenderCustId(long senderCustId) {
        this.senderCustId = senderCustId;
    }


    /**
     * Gets the shipmentDeliveryDetailVO value for this ShipmentDeliveryResultVO.
     * 
     * @return shipmentDeliveryDetailVO
     */
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryDetailVO[] getShipmentDeliveryDetailVO() {
        return shipmentDeliveryDetailVO;
    }


    /**
     * Sets the shipmentDeliveryDetailVO value for this ShipmentDeliveryResultVO.
     * 
     * @param shipmentDeliveryDetailVO
     */
    public void setShipmentDeliveryDetailVO(tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryDetailVO[] shipmentDeliveryDetailVO) {
        this.shipmentDeliveryDetailVO = shipmentDeliveryDetailVO;
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryDetailVO getShipmentDeliveryDetailVO(int i) {
        return this.shipmentDeliveryDetailVO[i];
    }

    public void setShipmentDeliveryDetailVO(int i, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryDetailVO _value) {
        this.shipmentDeliveryDetailVO[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentDeliveryResultVO)) return false;
        ShipmentDeliveryResultVO other = (ShipmentDeliveryResultVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.count == other.getCount() &&
            ((this.deliveryResultData==null && other.getDeliveryResultData()==null) || 
             (this.deliveryResultData!=null &&
              this.deliveryResultData.equals(other.getDeliveryResultData()))) &&
            this.senderCustId == other.getSenderCustId() &&
            ((this.shipmentDeliveryDetailVO==null && other.getShipmentDeliveryDetailVO()==null) || 
             (this.shipmentDeliveryDetailVO!=null &&
              java.util.Arrays.equals(this.shipmentDeliveryDetailVO, other.getShipmentDeliveryDetailVO())));
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
        _hashCode += new Long(getCount()).hashCode();
        if (getDeliveryResultData() != null) {
            _hashCode += getDeliveryResultData().hashCode();
        }
        _hashCode += new Long(getSenderCustId()).hashCode();
        if (getShipmentDeliveryDetailVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentDeliveryDetailVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentDeliveryDetailVO(), i);
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
        new org.apache.axis.description.TypeDesc(ShipmentDeliveryResultVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shipmentDeliveryResultVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryResultData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryResultData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDeliveryDetailVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipmentDeliveryDetailVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shipmentDeliveryDetailVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
