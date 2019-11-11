/**
 * ShippingCancelResultVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShippingCancelResultVO  extends tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO  implements java.io.Serializable {
    private long count;

    private long senderCustId;

    private tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelDetailVO[] shippingCancelDetailVO;

    public ShippingCancelResultVO() {
    }

    public ShippingCancelResultVO(
           java.lang.String outFlag,
           java.lang.String outResult,
           java.lang.String errCode,
           long count,
           long senderCustId,
           tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelDetailVO[] shippingCancelDetailVO) {
        super(
            outFlag,
            outResult,
            errCode);
        this.count = count;
        this.senderCustId = senderCustId;
        this.shippingCancelDetailVO = shippingCancelDetailVO;
    }


    /**
     * Gets the count value for this ShippingCancelResultVO.
     * 
     * @return count
     */
    public long getCount() {
        return count;
    }


    /**
     * Sets the count value for this ShippingCancelResultVO.
     * 
     * @param count
     */
    public void setCount(long count) {
        this.count = count;
    }


    /**
     * Gets the senderCustId value for this ShippingCancelResultVO.
     * 
     * @return senderCustId
     */
    public long getSenderCustId() {
        return senderCustId;
    }


    /**
     * Sets the senderCustId value for this ShippingCancelResultVO.
     * 
     * @param senderCustId
     */
    public void setSenderCustId(long senderCustId) {
        this.senderCustId = senderCustId;
    }


    /**
     * Gets the shippingCancelDetailVO value for this ShippingCancelResultVO.
     * 
     * @return shippingCancelDetailVO
     */
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelDetailVO[] getShippingCancelDetailVO() {
        return shippingCancelDetailVO;
    }


    /**
     * Sets the shippingCancelDetailVO value for this ShippingCancelResultVO.
     * 
     * @param shippingCancelDetailVO
     */
    public void setShippingCancelDetailVO(tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelDetailVO[] shippingCancelDetailVO) {
        this.shippingCancelDetailVO = shippingCancelDetailVO;
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelDetailVO getShippingCancelDetailVO(int i) {
        return this.shippingCancelDetailVO[i];
    }

    public void setShippingCancelDetailVO(int i, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelDetailVO _value) {
        this.shippingCancelDetailVO[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingCancelResultVO)) return false;
        ShippingCancelResultVO other = (ShippingCancelResultVO) obj;
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
            ((this.shippingCancelDetailVO==null && other.getShippingCancelDetailVO()==null) || 
             (this.shippingCancelDetailVO!=null &&
              java.util.Arrays.equals(this.shippingCancelDetailVO, other.getShippingCancelDetailVO())));
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
        if (getShippingCancelDetailVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingCancelDetailVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingCancelDetailVO(), i);
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
        new org.apache.axis.description.TypeDesc(ShippingCancelResultVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingCancelResultVO"));
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
        elemField.setFieldName("shippingCancelDetailVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingCancelDetailVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingCancelDetailVO"));
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
