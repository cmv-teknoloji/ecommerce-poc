/**
 * CustParamsVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.sswIntegrationServices;

public class CustParamsVO  implements java.io.Serializable {
    private java.lang.String[] invCustIdArray;

    private java.lang.String[] senderCustIdArray;

    private java.lang.String[] receiverCustIdArray;

    public CustParamsVO() {
    }

    public CustParamsVO(
           java.lang.String[] invCustIdArray,
           java.lang.String[] senderCustIdArray,
           java.lang.String[] receiverCustIdArray) {
           this.invCustIdArray = invCustIdArray;
           this.senderCustIdArray = senderCustIdArray;
           this.receiverCustIdArray = receiverCustIdArray;
    }


    /**
     * Gets the invCustIdArray value for this CustParamsVO.
     * 
     * @return invCustIdArray
     */
    public java.lang.String[] getInvCustIdArray() {
        return invCustIdArray;
    }


    /**
     * Sets the invCustIdArray value for this CustParamsVO.
     * 
     * @param invCustIdArray
     */
    public void setInvCustIdArray(java.lang.String[] invCustIdArray) {
        this.invCustIdArray = invCustIdArray;
    }

    public java.lang.String getInvCustIdArray(int i) {
        return this.invCustIdArray[i];
    }

    public void setInvCustIdArray(int i, java.lang.String _value) {
        this.invCustIdArray[i] = _value;
    }


    /**
     * Gets the senderCustIdArray value for this CustParamsVO.
     * 
     * @return senderCustIdArray
     */
    public java.lang.String[] getSenderCustIdArray() {
        return senderCustIdArray;
    }


    /**
     * Sets the senderCustIdArray value for this CustParamsVO.
     * 
     * @param senderCustIdArray
     */
    public void setSenderCustIdArray(java.lang.String[] senderCustIdArray) {
        this.senderCustIdArray = senderCustIdArray;
    }

    public java.lang.String getSenderCustIdArray(int i) {
        return this.senderCustIdArray[i];
    }

    public void setSenderCustIdArray(int i, java.lang.String _value) {
        this.senderCustIdArray[i] = _value;
    }


    /**
     * Gets the receiverCustIdArray value for this CustParamsVO.
     * 
     * @return receiverCustIdArray
     */
    public java.lang.String[] getReceiverCustIdArray() {
        return receiverCustIdArray;
    }


    /**
     * Sets the receiverCustIdArray value for this CustParamsVO.
     * 
     * @param receiverCustIdArray
     */
    public void setReceiverCustIdArray(java.lang.String[] receiverCustIdArray) {
        this.receiverCustIdArray = receiverCustIdArray;
    }

    public java.lang.String getReceiverCustIdArray(int i) {
        return this.receiverCustIdArray[i];
    }

    public void setReceiverCustIdArray(int i, java.lang.String _value) {
        this.receiverCustIdArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustParamsVO)) return false;
        CustParamsVO other = (CustParamsVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invCustIdArray==null && other.getInvCustIdArray()==null) || 
             (this.invCustIdArray!=null &&
              java.util.Arrays.equals(this.invCustIdArray, other.getInvCustIdArray()))) &&
            ((this.senderCustIdArray==null && other.getSenderCustIdArray()==null) || 
             (this.senderCustIdArray!=null &&
              java.util.Arrays.equals(this.senderCustIdArray, other.getSenderCustIdArray()))) &&
            ((this.receiverCustIdArray==null && other.getReceiverCustIdArray()==null) || 
             (this.receiverCustIdArray!=null &&
              java.util.Arrays.equals(this.receiverCustIdArray, other.getReceiverCustIdArray())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInvCustIdArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvCustIdArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvCustIdArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSenderCustIdArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSenderCustIdArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSenderCustIdArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiverCustIdArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiverCustIdArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiverCustIdArray(), i);
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
        new org.apache.axis.description.TypeDesc(CustParamsVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "CustParamsVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invCustIdArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invCustIdArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCustIdArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCustIdArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverCustIdArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverCustIdArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
