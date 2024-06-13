package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPatchManagerStatus;
import com.vmware.vim25.HostPatchManagerStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPatchManagerStatus", propOrder = {"hostPatchManagerStatus"})
public class ArrayOfHostPatchManagerStatus {
  @XmlElement(name = "HostPatchManagerStatus")
  protected List<HostPatchManagerStatus> hostPatchManagerStatus;
  
  public List<HostPatchManagerStatus> getHostPatchManagerStatus() {
    if (this.hostPatchManagerStatus == null)
      this.hostPatchManagerStatus = new ArrayList<>(); 
    return this.hostPatchManagerStatus;
  }
}
