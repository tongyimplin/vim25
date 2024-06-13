package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineWipeResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineWipeResult", propOrder = {"diskId", "shrinkableDiskSpace"})
public class VirtualMachineWipeResult extends DynamicData {
  protected int diskId;
  
  protected long shrinkableDiskSpace;
  
  public int getDiskId() {
    return this.diskId;
  }
  
  public void setDiskId(int paramInt) {
    this.diskId = paramInt;
  }
  
  public long getShrinkableDiskSpace() {
    return this.shrinkableDiskSpace;
  }
  
  public void setShrinkableDiskSpace(long paramLong) {
    this.shrinkableDiskSpace = paramLong;
  }
}
