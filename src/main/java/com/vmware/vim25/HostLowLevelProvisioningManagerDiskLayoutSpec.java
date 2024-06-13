package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLowLevelProvisioningManagerDiskLayoutSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerDiskLayoutSpec", propOrder = {"controllerType", "busNumber", "unitNumber", "srcFilename", "dstFilename"})
public class HostLowLevelProvisioningManagerDiskLayoutSpec extends DynamicData {
  @XmlElement(required = true)
  protected String controllerType;
  
  protected int busNumber;
  
  protected int unitNumber;
  
  @XmlElement(required = true)
  protected String srcFilename;
  
  @XmlElement(required = true)
  protected String dstFilename;
  
  public String getControllerType() {
    return this.controllerType;
  }
  
  public void setControllerType(String paramString) {
    this.controllerType = paramString;
  }
  
  public int getBusNumber() {
    return this.busNumber;
  }
  
  public void setBusNumber(int paramInt) {
    this.busNumber = paramInt;
  }
  
  public int getUnitNumber() {
    return this.unitNumber;
  }
  
  public void setUnitNumber(int paramInt) {
    this.unitNumber = paramInt;
  }
  
  public String getSrcFilename() {
    return this.srcFilename;
  }
  
  public void setSrcFilename(String paramString) {
    this.srcFilename = paramString;
  }
  
  public String getDstFilename() {
    return this.dstFilename;
  }
  
  public void setDstFilename(String paramString) {
    this.dstFilename = paramString;
  }
}
