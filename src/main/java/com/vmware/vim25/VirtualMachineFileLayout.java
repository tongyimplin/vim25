package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineFileLayout;
import com.vmware.vim25.VirtualMachineFileLayoutDiskLayout;
import com.vmware.vim25.VirtualMachineFileLayoutSnapshotLayout;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayout", propOrder = {"configFile", "logFile", "disk", "snapshot", "swapFile"})
public class VirtualMachineFileLayout extends DynamicData {
  protected List<String> configFile;
  
  protected List<String> logFile;
  
  protected List<VirtualMachineFileLayoutDiskLayout> disk;
  
  protected List<VirtualMachineFileLayoutSnapshotLayout> snapshot;
  
  protected String swapFile;
  
  public List<String> getConfigFile() {
    if (this.configFile == null)
      this.configFile = new ArrayList<>(); 
    return this.configFile;
  }
  
  public List<String> getLogFile() {
    if (this.logFile == null)
      this.logFile = new ArrayList<>(); 
    return this.logFile;
  }
  
  public List<VirtualMachineFileLayoutDiskLayout> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
  
  public List<VirtualMachineFileLayoutSnapshotLayout> getSnapshot() {
    if (this.snapshot == null)
      this.snapshot = new ArrayList<>(); 
    return this.snapshot;
  }
  
  public String getSwapFile() {
    return this.swapFile;
  }
  
  public void setSwapFile(String paramString) {
    this.swapFile = paramString;
  }
}
