package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineFileInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileInfo", propOrder = {"vmPathName", "snapshotDirectory", "suspendDirectory", "logDirectory", "ftMetadataDirectory"})
public class VirtualMachineFileInfo extends DynamicData {
  protected String vmPathName;
  
  protected String snapshotDirectory;
  
  protected String suspendDirectory;
  
  protected String logDirectory;
  
  protected String ftMetadataDirectory;
  
  public String getVmPathName() {
    return this.vmPathName;
  }
  
  public void setVmPathName(String paramString) {
    this.vmPathName = paramString;
  }
  
  public String getSnapshotDirectory() {
    return this.snapshotDirectory;
  }
  
  public void setSnapshotDirectory(String paramString) {
    this.snapshotDirectory = paramString;
  }
  
  public String getSuspendDirectory() {
    return this.suspendDirectory;
  }
  
  public void setSuspendDirectory(String paramString) {
    this.suspendDirectory = paramString;
  }
  
  public String getLogDirectory() {
    return this.logDirectory;
  }
  
  public void setLogDirectory(String paramString) {
    this.logDirectory = paramString;
  }
  
  public String getFtMetadataDirectory() {
    return this.ftMetadataDirectory;
  }
  
  public void setFtMetadataDirectory(String paramString) {
    this.ftMetadataDirectory = paramString;
  }
}
