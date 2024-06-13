package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineBootOptions;
import com.vmware.vim25.VirtualMachineBootOptionsBootableDevice;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineBootOptions", propOrder = {"bootDelay", "enterBIOSSetup", "efiSecureBootEnabled", "bootRetryEnabled", "bootRetryDelay", "bootOrder", "networkBootProtocol"})
public class VirtualMachineBootOptions extends DynamicData {
  protected Long bootDelay;
  
  protected Boolean enterBIOSSetup;
  
  protected Boolean efiSecureBootEnabled;
  
  protected Boolean bootRetryEnabled;
  
  protected Long bootRetryDelay;
  
  protected List<VirtualMachineBootOptionsBootableDevice> bootOrder;
  
  protected String networkBootProtocol;
  
  public Long getBootDelay() {
    return this.bootDelay;
  }
  
  public void setBootDelay(Long paramLong) {
    this.bootDelay = paramLong;
  }
  
  public Boolean isEnterBIOSSetup() {
    return this.enterBIOSSetup;
  }
  
  public void setEnterBIOSSetup(Boolean paramBoolean) {
    this.enterBIOSSetup = paramBoolean;
  }
  
  public Boolean isEfiSecureBootEnabled() {
    return this.efiSecureBootEnabled;
  }
  
  public void setEfiSecureBootEnabled(Boolean paramBoolean) {
    this.efiSecureBootEnabled = paramBoolean;
  }
  
  public Boolean isBootRetryEnabled() {
    return this.bootRetryEnabled;
  }
  
  public void setBootRetryEnabled(Boolean paramBoolean) {
    this.bootRetryEnabled = paramBoolean;
  }
  
  public Long getBootRetryDelay() {
    return this.bootRetryDelay;
  }
  
  public void setBootRetryDelay(Long paramLong) {
    this.bootRetryDelay = paramLong;
  }
  
  public List<VirtualMachineBootOptionsBootableDevice> getBootOrder() {
    if (this.bootOrder == null)
      this.bootOrder = new ArrayList<>(); 
    return this.bootOrder;
  }
  
  public String getNetworkBootProtocol() {
    return this.networkBootProtocol;
  }
  
  public void setNetworkBootProtocol(String paramString) {
    this.networkBootProtocol = paramString;
  }
}
