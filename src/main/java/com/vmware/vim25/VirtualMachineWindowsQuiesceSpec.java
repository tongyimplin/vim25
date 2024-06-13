package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineGuestQuiesceSpec;
import com.vmware.vim25.VirtualMachineWindowsQuiesceSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineWindowsQuiesceSpec", propOrder = {"vssBackupType", "vssBootableSystemState", "vssPartialFileSupport", "vssBackupContext"})
public class VirtualMachineWindowsQuiesceSpec extends VirtualMachineGuestQuiesceSpec {
  protected Integer vssBackupType;
  
  protected Boolean vssBootableSystemState;
  
  protected Boolean vssPartialFileSupport;
  
  protected String vssBackupContext;
  
  public Integer getVssBackupType() {
    return this.vssBackupType;
  }
  
  public void setVssBackupType(Integer paramInteger) {
    this.vssBackupType = paramInteger;
  }
  
  public Boolean isVssBootableSystemState() {
    return this.vssBootableSystemState;
  }
  
  public void setVssBootableSystemState(Boolean paramBoolean) {
    this.vssBootableSystemState = paramBoolean;
  }
  
  public Boolean isVssPartialFileSupport() {
    return this.vssPartialFileSupport;
  }
  
  public void setVssPartialFileSupport(Boolean paramBoolean) {
    this.vssPartialFileSupport = paramBoolean;
  }
  
  public String getVssBackupContext() {
    return this.vssBackupContext;
  }
  
  public void setVssBackupContext(String paramString) {
    this.vssBackupContext = paramString;
  }
}
