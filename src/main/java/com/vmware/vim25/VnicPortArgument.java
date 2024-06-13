package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortConnection;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VnicPortArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VnicPortArgument", propOrder = {"vnic", "port"})
public class VnicPortArgument extends DynamicData {
  @XmlElement(required = true)
  protected String vnic;
  
  @XmlElement(required = true)
  protected DistributedVirtualSwitchPortConnection port;
  
  public String getVnic() {
    return this.vnic;
  }
  
  public void setVnic(String paramString) {
    this.vnic = paramString;
  }
  
  public DistributedVirtualSwitchPortConnection getPort() {
    return this.port;
  }
  
  public void setPort(DistributedVirtualSwitchPortConnection paramDistributedVirtualSwitchPortConnection) {
    this.port = paramDistributedVirtualSwitchPortConnection;
  }
}
