package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostInternetScsiHbaStaticTarget;
import com.vmware.vim25.HostInternetScsiHbaStaticTarget;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostInternetScsiHbaStaticTarget", propOrder = {"hostInternetScsiHbaStaticTarget"})
public class ArrayOfHostInternetScsiHbaStaticTarget {
  @XmlElement(name = "HostInternetScsiHbaStaticTarget")
  protected List<HostInternetScsiHbaStaticTarget> hostInternetScsiHbaStaticTarget;
  
  public List<HostInternetScsiHbaStaticTarget> getHostInternetScsiHbaStaticTarget() {
    if (this.hostInternetScsiHbaStaticTarget == null)
      this.hostInternetScsiHbaStaticTarget = new ArrayList<>(); 
    return this.hostInternetScsiHbaStaticTarget;
  }
}
