package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.HostHardwareElementInfo;
import com.vmware.vim25.HostStorageElementInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHardwareElementInfo", propOrder = {"name", "status"})
@XmlSeeAlso({HostStorageElementInfo.class})
public class HostHardwareElementInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ElementDescription status;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ElementDescription getStatus() {
    return this.status;
  }
  
  public void setStatus(ElementDescription paramElementDescription) {
    this.status = paramElementDescription;
  }
}
