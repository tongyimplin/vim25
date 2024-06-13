package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostInternetScsiHbaSendTarget;
import com.vmware.vim25.HostInternetScsiHbaSendTarget;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostInternetScsiHbaSendTarget", propOrder = {"hostInternetScsiHbaSendTarget"})
public class ArrayOfHostInternetScsiHbaSendTarget {
  @XmlElement(name = "HostInternetScsiHbaSendTarget")
  protected List<HostInternetScsiHbaSendTarget> hostInternetScsiHbaSendTarget;
  
  public List<HostInternetScsiHbaSendTarget> getHostInternetScsiHbaSendTarget() {
    if (this.hostInternetScsiHbaSendTarget == null)
      this.hostInternetScsiHbaSendTarget = new ArrayList<>(); 
    return this.hostInternetScsiHbaSendTarget;
  }
}
