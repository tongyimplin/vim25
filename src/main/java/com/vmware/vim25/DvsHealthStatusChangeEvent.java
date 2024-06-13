package com.vmware.vim25;

import com.vmware.vim25.DvsHealthStatusChangeEvent;
import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostMemberHealthCheckResult;
import com.vmware.vim25.MtuMatchEvent;
import com.vmware.vim25.MtuMismatchEvent;
import com.vmware.vim25.TeamingMatchEvent;
import com.vmware.vim25.TeamingMisMatchEvent;
import com.vmware.vim25.UplinkPortMtuNotSupportEvent;
import com.vmware.vim25.UplinkPortMtuSupportEvent;
import com.vmware.vim25.UplinkPortVlanTrunkedEvent;
import com.vmware.vim25.UplinkPortVlanUntrunkedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHealthStatusChangeEvent", propOrder = {"switchUuid", "healthResult"})
@XmlSeeAlso({UplinkPortMtuSupportEvent.class, MtuMatchEvent.class, UplinkPortVlanTrunkedEvent.class, UplinkPortVlanUntrunkedEvent.class, TeamingMatchEvent.class, UplinkPortMtuNotSupportEvent.class, TeamingMisMatchEvent.class, MtuMismatchEvent.class})
public class DvsHealthStatusChangeEvent extends HostEvent {
  @XmlElement(required = true)
  protected String switchUuid;
  
  protected HostMemberHealthCheckResult healthResult;
  
  public String getSwitchUuid() {
    return this.switchUuid;
  }
  
  public void setSwitchUuid(String paramString) {
    this.switchUuid = paramString;
  }
  
  public HostMemberHealthCheckResult getHealthResult() {
    return this.healthResult;
  }
  
  public void setHealthResult(HostMemberHealthCheckResult paramHostMemberHealthCheckResult) {
    this.healthResult = paramHostMemberHealthCheckResult;
  }
}
