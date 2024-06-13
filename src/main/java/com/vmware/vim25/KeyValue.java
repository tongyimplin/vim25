package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyValue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValue", propOrder = {"key", "value"})
public class KeyValue extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String value;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
