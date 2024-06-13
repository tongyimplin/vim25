package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaParamValue;
import com.vmware.vim25.OptionValue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionValue", propOrder = {"key", "value"})
@XmlSeeAlso({HostInternetScsiHbaParamValue.class})
public class OptionValue extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected Object value;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public Object getValue() {
    return this.value;
  }
  
  public void setValue(Object paramObject) {
    this.value = paramObject;
  }
}
