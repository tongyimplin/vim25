package com.vmware.vim25;

import com.vmware.vim25.CannotMoveVsanEnabledHost;
import com.vmware.vim25.DestinationVsanDisabled;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationVsanDisabled", propOrder = {"destinationCluster"})
public class DestinationVsanDisabled extends CannotMoveVsanEnabledHost {
  @XmlElement(required = true)
  protected String destinationCluster;
  
  public String getDestinationCluster() {
    return this.destinationCluster;
  }
  
  public void setDestinationCluster(String paramString) {
    this.destinationCluster = paramString;
  }
}
