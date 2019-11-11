/**
 * XShippingV2ResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.sswIntegrationServices;

public class XShippingV2ResponseVO  extends tr.com.yurticikargo.sswIntegrationServices.BaseResultVO  implements java.io.Serializable {
    private tr.com.yurticikargo.sswIntegrationServices.XShippingV2DetailVO[] shippingDetailVOArray;

    public XShippingV2ResponseVO() {
    }

    public XShippingV2ResponseVO(
           java.lang.String outFlag,
           java.lang.String outResult,
           tr.com.yurticikargo.sswIntegrationServices.XShippingV2DetailVO[] shippingDetailVOArray) {
        super(
            outFlag,
            outResult);
        this.shippingDetailVOArray = shippingDetailVOArray;
    }


    /**
     * Gets the shippingDetailVOArray value for this XShippingV2ResponseVO.
     * 
     * @return shippingDetailVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.XShippingV2DetailVO[] getShippingDetailVOArray() {
        return shippingDetailVOArray;
    }


    /**
     * Sets the shippingDetailVOArray value for this XShippingV2ResponseVO.
     * 
     * @param shippingDetailVOArray
     */
    public void setShippingDetailVOArray(tr.com.yurticikargo.sswIntegrationServices.XShippingV2DetailVO[] shippingDetailVOArray) {
        this.shippingDetailVOArray = shippingDetailVOArray;
    }

    public tr.com.yurticikargo.sswIntegrationServices.XShippingV2DetailVO getShippingDetailVOArray(int i) {
        return this.shippingDetailVOArray[i];
    }

    public void setShippingDetailVOArray(int i, tr.com.yurticikargo.sswIntegrationServices.XShippingV2DetailVO _value) {
        this.shippingDetailVOArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XShippingV2ResponseVO)) return false;
        XShippingV2ResponseVO other = (XShippingV2ResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.shippingDetailVOArray==null && other.getShippingDetailVOArray()==null) || 
             (this.shippingDetailVOArray!=null &&
              java.util.Arrays.equals(this.shippingDetailVOArray, other.getShippingDetailVOArray())));
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
        if (getShippingDetailVOArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingDetailVOArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingDetailVOArray(), i);
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
        new org.apache.axis.description.TypeDesc(XShippingV2ResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "xShippingV2ResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDetailVOArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingDetailVOArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "XShippingV2DetailVO"));
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
