package com.vmware.vim25;

import com.vmware.vim25.HostMemberUplinkHealthCheckResult;
import com.vmware.vim25.NumericRange;
import com.vmware.vim25.VMwareDVSVlanHealthCheckResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSVlanHealthCheckResult", propOrder = {"trunkedVlan", "untrunkedVlan"})
public class VMwareDVSVlanHealthCheckResult extends HostMemberUplinkHealthCheckResult {
  protected List<NumericRange> trunkedVlan;
  
  protected List<NumericRange> untrunkedVlan;
  
  public List<NumericRange> getTrunkedVlan() {
    if (this.trunkedVlan == null)
      this.trunkedVlan = new ArrayList<>(); 
    return this.trunkedVlan;
  }
  
  public List<NumericRange> getUntrunkedVlan() {
    if (this.untrunkedVlan == null)
      this.untrunkedVlan = new ArrayList<>(); 
    return this.untrunkedVlan;
  }
}
