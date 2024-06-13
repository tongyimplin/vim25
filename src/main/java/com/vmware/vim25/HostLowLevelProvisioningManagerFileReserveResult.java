package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLowLevelProvisioningManagerFileReserveResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerFileReserveResult", propOrder = {"baseName", "parentDir", "reservedName"})
public class HostLowLevelProvisioningManagerFileReserveResult extends DynamicData {
  @XmlElement(required = true)
  protected String baseName;
  
  @XmlElement(required = true)
  protected String parentDir;
  
  @XmlElement(required = true)
  protected String reservedName;
  
  public String getBaseName() {
    return this.baseName;
  }
  
  public void setBaseName(String paramString) {
    this.baseName = paramString;
  }
  
  public String getParentDir() {
    return this.parentDir;
  }
  
  public void setParentDir(String paramString) {
    this.parentDir = paramString;
  }
  
  public String getReservedName() {
    return this.reservedName;
  }
  
  public void setReservedName(String paramString) {
    this.reservedName = paramString;
  }
}
