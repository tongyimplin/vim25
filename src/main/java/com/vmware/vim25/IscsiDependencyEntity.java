package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IscsiDependencyEntity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscsiDependencyEntity", propOrder = {"pnicDevice", "vnicDevice", "vmhbaName"})
public class IscsiDependencyEntity extends DynamicData {
  @XmlElement(required = true)
  protected String pnicDevice;
  
  @XmlElement(required = true)
  protected String vnicDevice;
  
  @XmlElement(required = true)
  protected String vmhbaName;
  
  public String getPnicDevice() {
    return this.pnicDevice;
  }
  
  public void setPnicDevice(String paramString) {
    this.pnicDevice = paramString;
  }
  
  public String getVnicDevice() {
    return this.vnicDevice;
  }
  
  public void setVnicDevice(String paramString) {
    this.vnicDevice = paramString;
  }
  
  public String getVmhbaName() {
    return this.vmhbaName;
  }
  
  public void setVmhbaName(String paramString) {
    this.vmhbaName = paramString;
  }
}
