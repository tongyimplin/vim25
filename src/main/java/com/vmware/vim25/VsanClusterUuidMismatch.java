package com.vmware.vim25;

import com.vmware.vim25.CannotMoveVsanEnabledHost;
import com.vmware.vim25.VsanClusterUuidMismatch;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanClusterUuidMismatch", propOrder = {"hostClusterUuid", "destinationClusterUuid"})
public class VsanClusterUuidMismatch extends CannotMoveVsanEnabledHost {
  @XmlElement(required = true)
  protected String hostClusterUuid;
  
  @XmlElement(required = true)
  protected String destinationClusterUuid;
  
  public String getHostClusterUuid() {
    return this.hostClusterUuid;
  }
  
  public void setHostClusterUuid(String paramString) {
    this.hostClusterUuid = paramString;
  }
  
  public String getDestinationClusterUuid() {
    return this.destinationClusterUuid;
  }
  
  public void setDestinationClusterUuid(String paramString) {
    this.destinationClusterUuid = paramString;
  }
}
