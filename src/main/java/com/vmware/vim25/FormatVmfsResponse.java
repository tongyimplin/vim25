package com.vmware.vim25;

import com.vmware.vim25.FormatVmfsResponse;
import com.vmware.vim25.HostVmfsVolume;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "FormatVmfsResponse")
public class FormatVmfsResponse {
  @XmlElement(required = true)
  protected HostVmfsVolume returnval;
  
  public HostVmfsVolume getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostVmfsVolume paramHostVmfsVolume) {
    this.returnval = paramHostVmfsVolume;
  }
}
