package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLowLevelProvisioningManagerFileDeleteResult;
import com.vmware.vim25.LocalizedMethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerFileDeleteResult", propOrder = {"fileName", "fault"})
public class HostLowLevelProvisioningManagerFileDeleteResult extends DynamicData {
  @XmlElement(required = true)
  protected String fileName;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public String getFileName() {
    return this.fileName;
  }
  
  public void setFileName(String paramString) {
    this.fileName = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
