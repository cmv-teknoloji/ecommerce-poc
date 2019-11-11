/**
 * ShippingDeliveryResultVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShippingDeliveryResultVO  extends tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO  implements java.io.Serializable {
    private long count;

    private long senderCustId;

    private tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryDetailVO[] shippingDeliveryDetailVO;

    public ShippingDeliveryResultVO() {
    }

    public ShippingDeliveryResultVO(
           java.lang.String outFlag,
           java.lang.String outResult,
           java.lang.String errCode,
           long count,
           long senderCustId,
           tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryDetailVO[] shippingDeliveryDetailVO) {
        super(
            outFlag,
            outResult,
            errCode);
        this.count = count;
        this.senderCustId = senderCustId;
        this.shippingDeliveryDetailVO = shippingDeliveryDetailVO;
    }


    /**
     * Gets the count value for this ShippingDeliveryResultVO.
     * 
     * @return count
     */
    public long getCount() {
        return count;
    }


    /**
     * Sets the count value for this ShippingDeliveryResultVO.
     * 
     * @param count
     */
    public void setCount(long count) {
        this.count = count;
    }


    /**
     * Gets the senderCustId value for this ShippingDeliveryResultVO.
     * 
     * @return senderCustId
     */
    public long getSenderCustId() {
        return senderCustId;
    }


    /**
     * Sets the senderCustId value for this ShippingDeliveryResultVO.
     * 
     * @param senderCustId
     */
    public void setSenderCustId(long senderCustId) {
        this.senderCustId = senderCustId;
    }


    /**
     * Gets the shippingDeliveryDetailVO value for this ShippingDeliveryResultVO.
     * 
     * @return shippingDeliveryDetailVO
     */
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryDetailVO[] getShippingDeliveryDetailVO() {
        return shippingDeliveryDetailVO;
    }


    /**
     * Sets the shippingDeliveryDetailVO value for this ShippingDeliveryResultVO.
     * 
     * @param shippingDeliveryDetailVO
     */
    public void setShippingDeliveryDetailVO(tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryDetailVO[] shippingDeliveryDetailVO) {
        this.shippingDeliveryDetailVO = shippingDeliveryDetailVO;
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryDetailVO getShippingDeliveryDetailVO(int i) {
        return this.shippingDeliveryDetailVO[i];
    }

    public void setShippingDeliveryDetailVO(int i, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryDetailVO _value) {
        this.shippingDeliveryDetailVO[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingDeliveryResultVO)) return false;
        ShippingDeliveryResultVO other = (ShippingDeliveryResultVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.count == other.getCount() &&
            this.senderCustId == other.getSenderCustId() &&
            ((this.shippingDeliveryDetailVO==null && other.getShippingDeliveryDetailVO()==null) || 
             (this.shippingDeliveryDetailVO!=null &&
              java.util.Arrays.equals(this.shippingDeliveryDetailVO, other.getShippingDeliveryDetailVO())));
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
        _hashCode += new Long(getSenderCustId()).hashCode();
        if (getShippingDeliveryDetailVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingDeliveryDetailVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingDeliveryDetailVO(), i);
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
        new org.apache.axis.description.TypeDesc(ShippingDeliveryResultVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingDeliveryResultVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDeliveryDetailVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingDeliveryDetailVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingDeliveryDetailVO"));
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
