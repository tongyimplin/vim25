package com.vmware.vim25;

import com.vmware.vim25.OvfImport;
import com.vmware.vim25.OvfMissingHardware;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfMissingHardware", propOrder = {"name", "resourceType"})
public class OvfMissingHardware extends OvfImport {
  @XmlElement(required = true)
  protected String name;
  
  protected int resourceType;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public int getResourceType() {
    return this.resourceType;
  }
  
  public void setResourceType(int paramInt) {
    this.resourceType = paramInt;
  }
}
