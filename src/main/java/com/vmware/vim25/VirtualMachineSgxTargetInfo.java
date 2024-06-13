package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineSgxTargetInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSgxTargetInfo", propOrder = {"maxEpcSize", "flcModes", "lePubKeyHashes"})
public class VirtualMachineSgxTargetInfo extends VirtualMachineTargetInfo {
  protected long maxEpcSize;
  
  protected List<String> flcModes;
  
  protected List<String> lePubKeyHashes;
  
  public long getMaxEpcSize() {
    return this.maxEpcSize;
  }
  
  public void setMaxEpcSize(long paramLong) {
    this.maxEpcSize = paramLong;
  }
  
  public List<String> getFlcModes() {
    if (this.flcModes == null)
      this.flcModes = new ArrayList<>(); 
    return this.flcModes;
  }
  
  public List<String> getLePubKeyHashes() {
    if (this.lePubKeyHashes == null)
      this.lePubKeyHashes = new ArrayList<>(); 
    return this.lePubKeyHashes;
  }
}
