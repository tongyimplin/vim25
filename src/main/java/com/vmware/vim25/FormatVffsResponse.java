package com.vmware.vim25;

import com.vmware.vim25.FormatVffsResponse;
import com.vmware.vim25.HostVffsVolume;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "FormatVffsResponse")
public class FormatVffsResponse {
  @XmlElement(required = true)
  protected HostVffsVolume returnval;
  
  public HostVffsVolume getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostVffsVolume paramHostVffsVolume) {
    this.returnval = paramHostVffsVolume;
  }
}
