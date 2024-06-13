package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.UpdateVirtualMachineFilesResultFailedVmFileInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVirtualMachineFilesResultFailedVmFileInfo", propOrder = {"vmFile", "fault"})
public class UpdateVirtualMachineFilesResultFailedVmFileInfo extends DynamicData {
  @XmlElement(required = true)
  protected String vmFile;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public String getVmFile() {
    return this.vmFile;
  }
  
  public void setVmFile(String paramString) {
    this.vmFile = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
