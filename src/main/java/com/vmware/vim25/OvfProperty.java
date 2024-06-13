package com.vmware.vim25;

import com.vmware.vim25.OvfInvalidPackage;
import com.vmware.vim25.OvfProperty;
import com.vmware.vim25.OvfPropertyNetwork;
import com.vmware.vim25.OvfPropertyQualifier;
import com.vmware.vim25.OvfPropertyQualifierDuplicate;
import com.vmware.vim25.OvfPropertyQualifierIgnored;
import com.vmware.vim25.OvfPropertyType;
import com.vmware.vim25.OvfPropertyValue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfProperty", propOrder = {"type", "value"})
@XmlSeeAlso({OvfPropertyValue.class, OvfPropertyNetwork.class, OvfPropertyQualifierDuplicate.class, OvfPropertyQualifier.class, OvfPropertyQualifierIgnored.class, OvfPropertyType.class})
public class OvfProperty extends OvfInvalidPackage {
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String value;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
