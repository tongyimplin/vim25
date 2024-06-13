package com.vmware.vim25;

import com.vmware.vim25.HostMemberUplinkHealthCheckResult;
import com.vmware.vim25.NumericRange;
import com.vmware.vim25.VMwareDVSMtuHealthCheckResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSMtuHealthCheckResult", propOrder = {"mtuMismatch", "vlanSupportSwitchMtu", "vlanNotSupportSwitchMtu"})
public class VMwareDVSMtuHealthCheckResult extends HostMemberUplinkHealthCheckResult {
  protected boolean mtuMismatch;
  
  protected List<NumericRange> vlanSupportSwitchMtu;
  
  protected List<NumericRange> vlanNotSupportSwitchMtu;
  
  public boolean isMtuMismatch() {
    return this.mtuMismatch;
  }
  
  public void setMtuMismatch(boolean paramBoolean) {
    this.mtuMismatch = paramBoolean;
  }
  
  public List<NumericRange> getVlanSupportSwitchMtu() {
    if (this.vlanSupportSwitchMtu == null)
      this.vlanSupportSwitchMtu = new ArrayList<>(); 
    return this.vlanSupportSwitchMtu;
  }
  
  public List<NumericRange> getVlanNotSupportSwitchMtu() {
    if (this.vlanNotSupportSwitchMtu == null)
      this.vlanNotSupportSwitchMtu = new ArrayList<>(); 
    return this.vlanNotSupportSwitchMtu;
  }
}
