package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVirtualNicManagerNicTypeSelection;
import com.vmware.vim25.HostVirtualNicManagerNicTypeSelection;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVirtualNicManagerNicTypeSelection", propOrder = {"hostVirtualNicManagerNicTypeSelection"})
public class ArrayOfHostVirtualNicManagerNicTypeSelection {
  @XmlElement(name = "HostVirtualNicManagerNicTypeSelection")
  protected List<HostVirtualNicManagerNicTypeSelection> hostVirtualNicManagerNicTypeSelection;
  
  public List<HostVirtualNicManagerNicTypeSelection> getHostVirtualNicManagerNicTypeSelection() {
    if (this.hostVirtualNicManagerNicTypeSelection == null)
      this.hostVirtualNicManagerNicTypeSelection = new ArrayList<>(); 
    return this.hostVirtualNicManagerNicTypeSelection;
  }
}
