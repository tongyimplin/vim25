package com.vmware.vim25;

import com.vmware.vim25.HostSriovDevicePoolInfo;
import com.vmware.vim25.HostSriovNetworkDevicePoolInfo;
import com.vmware.vim25.PhysicalNic;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSriovNetworkDevicePoolInfo", propOrder = {"switchKey", "switchUuid", "pnic"})
public class HostSriovNetworkDevicePoolInfo extends HostSriovDevicePoolInfo {
  protected String switchKey;
  
  protected String switchUuid;
  
  protected List<PhysicalNic> pnic;
  
  public String getSwitchKey() {
    return this.switchKey;
  }
  
  public void setSwitchKey(String paramString) {
    this.switchKey = paramString;
  }
  
  public String getSwitchUuid() {
    return this.switchUuid;
  }
  
  public void setSwitchUuid(String paramString) {
    this.switchUuid = paramString;
  }
  
  public List<PhysicalNic> getPnic() {
    if (this.pnic == null)
      this.pnic = new ArrayList<>(); 
    return this.pnic;
  }
}
