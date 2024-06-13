package com.vmware.vim25;

import com.vmware.vim25.ArrayOfUpdateVirtualMachineFilesResultFailedVmFileInfo;
import com.vmware.vim25.UpdateVirtualMachineFilesResultFailedVmFileInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdateVirtualMachineFilesResultFailedVmFileInfo", propOrder = {"updateVirtualMachineFilesResultFailedVmFileInfo"})
public class ArrayOfUpdateVirtualMachineFilesResultFailedVmFileInfo {
  @XmlElement(name = "UpdateVirtualMachineFilesResultFailedVmFileInfo")
  protected List<UpdateVirtualMachineFilesResultFailedVmFileInfo> updateVirtualMachineFilesResultFailedVmFileInfo;
  
  public List<UpdateVirtualMachineFilesResultFailedVmFileInfo> getUpdateVirtualMachineFilesResultFailedVmFileInfo() {
    if (this.updateVirtualMachineFilesResultFailedVmFileInfo == null)
      this.updateVirtualMachineFilesResultFailedVmFileInfo = new ArrayList<>(); 
    return this.updateVirtualMachineFilesResultFailedVmFileInfo;
  }
}
