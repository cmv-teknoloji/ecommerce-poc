/**
 * ShippingDataV2ResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.sswIntegrationServices;

public class ShippingDataV2ResponseVO  extends tr.com.yurticikargo.sswIntegrationServices.ExtendedBaseResultVO  implements java.io.Serializable {
    private tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2DetailVO[] shippingDataV2DetailVOArray;

    public ShippingDataV2ResponseVO() {
    }

    public ShippingDataV2ResponseVO(
           java.lang.String outFlag,
           java.lang.String outResult,
           java.lang.String errCode,
           tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2DetailVO[] shippingDataV2DetailVOArray) {
        super(
            outFlag,
            outResult,
            errCode);
        this.shippingDataV2DetailVOArray = shippingDataV2DetailVOArray;
    }


    /**
     * Gets the shippingDataV2DetailVOArray value for this ShippingDataV2ResponseVO.
     * 
     * @return shippingDataV2DetailVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2DetailVO[] getShippingDataV2DetailVOArray() {
        return shippingDataV2DetailVOArray;
    }


    /**
     * Sets the shippingDataV2DetailVOArray value for this ShippingDataV2ResponseVO.
     * 
     * @param shippingDataV2DetailVOArray
     */
    public void setShippingDataV2DetailVOArray(tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2DetailVO[] shippingDataV2DetailVOArray) {
        this.shippingDataV2DetailVOArray = shippingDataV2DetailVOArray;
    }

    public tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2DetailVO getShippingDataV2DetailVOArray(int i) {
        return this.shippingDataV2DetailVOArray[i];
    }

    public void setShippingDataV2DetailVOArray(int i, tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2DetailVO _value) {
        this.shippingDataV2DetailVOArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingDataV2ResponseVO)) return false;
        ShippingDataV2ResponseVO other = (ShippingDataV2ResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.shippingDataV2DetailVOArray==null && other.getShippingDataV2DetailVOArray()==null) || 
             (this.shippingDataV2DetailVOArray!=null &&
              java.util.Arrays.equals(this.shippingDataV2DetailVOArray, other.getShippingDataV2DetailVOArray())));
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
        if (getShippingDataV2DetailVOArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingDataV2DetailVOArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingDataV2DetailVOArray(), i);
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
        new org.apache.axis.description.TypeDesc(ShippingDataV2ResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "shippingDataV2ResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDataV2DetailVOArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingDataV2DetailVOArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "ShippingDataV2DetailVO"));
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
