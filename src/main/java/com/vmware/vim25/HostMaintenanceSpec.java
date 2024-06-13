package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMaintenanceSpec;
import com.vmware.vim25.VsanHostDecommissionMode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMaintenanceSpec", propOrder = {"vsanMode", "purpose"})
public class HostMaintenanceSpec extends DynamicData {
  protected VsanHostDecommissionMode vsanMode;
  
  protected String purpose;
  
  public VsanHostDecommissionMode getVsanMode() {
    return this.vsanMode;
  }
  
  public void setVsanMode(VsanHostDecommissionMode paramVsanHostDecommissionMode) {
    this.vsanMode = paramVsanHostDecommissionMode;
  }
  
  public String getPurpose() {
    return this.purpose;
  }
  
  public void setPurpose(String paramString) {
    this.purpose = paramString;
  }
}
