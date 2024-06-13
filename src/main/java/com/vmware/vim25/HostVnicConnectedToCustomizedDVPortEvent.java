package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostVnicConnectedToCustomizedDVPortEvent;
import com.vmware.vim25.VnicPortArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVnicConnectedToCustomizedDVPortEvent", propOrder = {"vnic", "prevPortKey"})
public class HostVnicConnectedToCustomizedDVPortEvent extends HostEvent {
  @XmlElement(required = true)
  protected VnicPortArgument vnic;
  
  protected String prevPortKey;
  
  public VnicPortArgument getVnic() {
    return this.vnic;
  }
  
  public void setVnic(VnicPortArgument paramVnicPortArgument) {
    this.vnic = paramVnicPortArgument;
  }
  
  public String getPrevPortKey() {
    return this.prevPortKey;
  }
  
  public void setPrevPortKey(String paramString) {
    this.prevPortKey = paramString;
  }
}
