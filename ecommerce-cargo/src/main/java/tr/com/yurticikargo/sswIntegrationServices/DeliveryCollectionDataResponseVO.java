/**
 * DeliveryCollectionDataResponseVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.sswIntegrationServices;

public class DeliveryCollectionDataResponseVO  extends tr.com.yurticikargo.sswIntegrationServices.ExtendedBaseResultVO  implements java.io.Serializable {
    private tr.com.yurticikargo.sswIntegrationServices.QListDeliveryCollectionInfoVO[] deliveryCollectionInfoVOArray;

    public DeliveryCollectionDataResponseVO() {
    }

    public DeliveryCollectionDataResponseVO(
           java.lang.String outFlag,
           java.lang.String outResult,
           java.lang.String errCode,
           tr.com.yurticikargo.sswIntegrationServices.QListDeliveryCollectionInfoVO[] deliveryCollectionInfoVOArray) {
        super(
            outFlag,
            outResult,
            errCode);
        this.deliveryCollectionInfoVOArray = deliveryCollectionInfoVOArray;
    }


    /**
     * Gets the deliveryCollectionInfoVOArray value for this DeliveryCollectionDataResponseVO.
     * 
     * @return deliveryCollectionInfoVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.QListDeliveryCollectionInfoVO[] getDeliveryCollectionInfoVOArray() {
        return deliveryCollectionInfoVOArray;
    }


    /**
     * Sets the deliveryCollectionInfoVOArray value for this DeliveryCollectionDataResponseVO.
     * 
     * @param deliveryCollectionInfoVOArray
     */
    public void setDeliveryCollectionInfoVOArray(tr.com.yurticikargo.sswIntegrationServices.QListDeliveryCollectionInfoVO[] deliveryCollectionInfoVOArray) {
        this.deliveryCollectionInfoVOArray = deliveryCollectionInfoVOArray;
    }

    public tr.com.yurticikargo.sswIntegrationServices.QListDeliveryCollectionInfoVO getDeliveryCollectionInfoVOArray(int i) {
        return this.deliveryCollectionInfoVOArray[i];
    }

    public void setDeliveryCollectionInfoVOArray(int i, tr.com.yurticikargo.sswIntegrationServices.QListDeliveryCollectionInfoVO _value) {
        this.deliveryCollectionInfoVOArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryCollectionDataResponseVO)) return false;
        DeliveryCollectionDataResponseVO other = (DeliveryCollectionDataResponseVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deliveryCollectionInfoVOArray==null && other.getDeliveryCollectionInfoVOArray()==null) || 
             (this.deliveryCollectionInfoVOArray!=null &&
              java.util.Arrays.equals(this.deliveryCollectionInfoVOArray, other.getDeliveryCollectionInfoVOArray())));
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
        if (getDeliveryCollectionInfoVOArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryCollectionInfoVOArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryCollectionInfoVOArray(), i);
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
        new org.apache.axis.description.TypeDesc(DeliveryCollectionDataResponseVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "deliveryCollectionDataResponseVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryCollectionInfoVOArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryCollectionInfoVOArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "qListDeliveryCollectionInfoVO"));
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
