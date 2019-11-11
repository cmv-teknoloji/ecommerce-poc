/**
 * ShippingDataV3ResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.sswIntegrationServices;

public class ShippingDataV3ResponseVO  extends tr.com.yurticikargo.sswIntegrationServices.BaseResultVO  implements java.io.Serializable {
    private tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3DetailVO[] shippingDataDetailVOArray;

    public ShippingDataV3ResponseVO() {
    }

    public ShippingDataV3ResponseVO(
           java.lang.String outFlag,
           java.lang.String outResult,
           tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3DetailVO[] shippingDataDetailVOArray) {
        super(
            outFlag,
            outResult);
        this.shippingDataDetailVOArray = shippingDataDetailVOArray;
    }


    /**
     * Gets the shippingDataDetailVOArray value for this ShippingDataV3ResponseVO.
     * 
     * @return shippingDataDetailVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3DetailVO[] getShippingDataDetailVOArray() {
        return shippingDataDetailVOArray;
    }


    /**
     * Sets the shippingDataDetailVOArray value for this ShippingDataV3ResponseVO.
     * 
     * @param shippingDataDetailVOArray
     */
    public void setShippingDataDetailVOArray(tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3DetailVO[] shippingDataDetailVOArray) {
        this.shippingDataDetailVOArray = shippingDataDetailVOArray;
    }

    public tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3DetailVO getShippingDataDetailVOArray(int i) {
        return this.shippingDataDetailVOArray[i];
    }

    public void setShippingDataDetailVOArray(int i, tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3DetailVO _value) {
        this.shippingDataDetailVOArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingDataV3ResponseVO)) return false;
        ShippingDataV3ResponseVO other = (ShippingDataV3ResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.shippingDataDetailVOArray==null && other.getShippingDataDetailVOArray()==null) || 
             (this.shippingDataDetailVOArray!=null &&
              java.util.Arrays.equals(this.shippingDataDetailVOArray, other.getShippingDataDetailVOArray())));
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
        if (getShippingDataDetailVOArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingDataDetailVOArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingDataDetailVOArray(), i);
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
        new org.apache.axis.description.TypeDesc(ShippingDataV3ResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "shippingDataV3ResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDataDetailVOArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingDataDetailVOArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "ShippingDataV3DetailVO"));
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
