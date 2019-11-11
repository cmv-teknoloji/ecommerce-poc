/**
 * ShippingOrderResultVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShippingOrderResultVO  extends tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO  implements java.io.Serializable {
    private long count;

    private long jobId;

    private tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDetailVO[] shippingOrderDetailVO;

    public ShippingOrderResultVO() {
    }

    public ShippingOrderResultVO(
           java.lang.String outFlag,
           java.lang.String outResult,
           java.lang.String errCode,
           long count,
           long jobId,
           tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDetailVO[] shippingOrderDetailVO) {
        super(
            outFlag,
            outResult,
            errCode);
        this.count = count;
        this.jobId = jobId;
        this.shippingOrderDetailVO = shippingOrderDetailVO;
    }


    /**
     * Gets the count value for this ShippingOrderResultVO.
     * 
     * @return count
     */
    public long getCount() {
        return count;
    }


    /**
     * Sets the count value for this ShippingOrderResultVO.
     * 
     * @param count
     */
    public void setCount(long count) {
        this.count = count;
    }


    /**
     * Gets the jobId value for this ShippingOrderResultVO.
     * 
     * @return jobId
     */
    public long getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this ShippingOrderResultVO.
     * 
     * @param jobId
     */
    public void setJobId(long jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the shippingOrderDetailVO value for this ShippingOrderResultVO.
     * 
     * @return shippingOrderDetailVO
     */
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDetailVO[] getShippingOrderDetailVO() {
        return shippingOrderDetailVO;
    }


    /**
     * Sets the shippingOrderDetailVO value for this ShippingOrderResultVO.
     * 
     * @param shippingOrderDetailVO
     */
    public void setShippingOrderDetailVO(tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDetailVO[] shippingOrderDetailVO) {
        this.shippingOrderDetailVO = shippingOrderDetailVO;
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDetailVO getShippingOrderDetailVO(int i) {
        return this.shippingOrderDetailVO[i];
    }

    public void setShippingOrderDetailVO(int i, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDetailVO _value) {
        this.shippingOrderDetailVO[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingOrderResultVO)) return false;
        ShippingOrderResultVO other = (ShippingOrderResultVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.count == other.getCount() &&
            this.jobId == other.getJobId() &&
            ((this.shippingOrderDetailVO==null && other.getShippingOrderDetailVO()==null) || 
             (this.shippingOrderDetailVO!=null &&
              java.util.Arrays.equals(this.shippingOrderDetailVO, other.getShippingOrderDetailVO())));
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
        _hashCode += new Long(getJobId()).hashCode();
        if (getShippingOrderDetailVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingOrderDetailVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingOrderDetailVO(), i);
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
        new org.apache.axis.description.TypeDesc(ShippingOrderResultVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingOrderResultVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOrderDetailVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingOrderDetailVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingOrderDetailVO"));
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
