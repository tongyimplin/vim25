package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualNicConnection;
import com.vmware.vim25.HostVirtualNicManagerNicTypeSelection;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualNicManagerNicTypeSelection", propOrder = {"vnic", "nicType"})
public class HostVirtualNicManagerNicTypeSelection extends DynamicData {
  @XmlElement(required = true)
  protected HostVirtualNicConnection vnic;
  
  protected List<String> nicType;
  
  public HostVirtualNicConnection getVnic() {
    return this.vnic;
  }
  
  public void setVnic(HostVirtualNicConnection paramHostVirtualNicConnection) {
    this.vnic = paramHostVirtualNicConnection;
  }
  
  public List<String> getNicType() {
    if (this.nicType == null)
      this.nicType = new ArrayList<>(); 
    return this.nicType;
  }
}
