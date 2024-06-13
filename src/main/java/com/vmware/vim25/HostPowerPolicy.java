package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPowerPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPowerPolicy", propOrder = {"key", "name", "shortName", "description"})
public class HostPowerPolicy extends DynamicData {
  protected int key;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String shortName;
  
  @XmlElement(required = true)
  protected String description;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getShortName() {
    return this.shortName;
  }
  
  public void setShortName(String paramString) {
    this.shortName = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
