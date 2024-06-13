package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaSendTarget;
import com.vmware.vim25.HostInternetScsiHbaStaticTarget;
import com.vmware.vim25.HostInternetScsiHbaTargetSet;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaTargetSet", propOrder = {"staticTargets", "sendTargets"})
public class HostInternetScsiHbaTargetSet extends DynamicData {
  protected List<HostInternetScsiHbaStaticTarget> staticTargets;
  
  protected List<HostInternetScsiHbaSendTarget> sendTargets;
  
  public List<HostInternetScsiHbaStaticTarget> getStaticTargets() {
    if (this.staticTargets == null)
      this.staticTargets = new ArrayList<>(); 
    return this.staticTargets;
  }
  
  public List<HostInternetScsiHbaSendTarget> getSendTargets() {
    if (this.sendTargets == null)
      this.sendTargets = new ArrayList<>(); 
    return this.sendTargets;
  }
}
