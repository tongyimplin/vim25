package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.UpdateVirtualMachineFilesResult;
import com.vmware.vim25.UpdateVirtualMachineFilesResultFailedVmFileInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVirtualMachineFilesResult", propOrder = {"failedVmFile"})
public class UpdateVirtualMachineFilesResult extends DynamicData {
  protected List<UpdateVirtualMachineFilesResultFailedVmFileInfo> failedVmFile;
  
  public List<UpdateVirtualMachineFilesResultFailedVmFileInfo> getFailedVmFile() {
    if (this.failedVmFile == null)
      this.failedVmFile = new ArrayList<>(); 
    return this.failedVmFile;
  }
}
