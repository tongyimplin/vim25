package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostStorageOperationalInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostStorageOperationalInfo", propOrder = {"property", "value"})
public class HostStorageOperationalInfo extends DynamicData {
  @XmlElement(required = true)
  protected String property;
  
  @XmlElement(required = true)
  protected String value;
  
  public String getProperty() {
    return this.property;
  }
  
  public void setProperty(String paramString) {
    this.property = paramString;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
