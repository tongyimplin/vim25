package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualNic;
import com.vmware.vim25.VirtualNicManagerNetConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNicManagerNetConfig", propOrder = {"nicType", "multiSelectAllowed", "candidateVnic", "selectedVnic"})
public class VirtualNicManagerNetConfig extends DynamicData {
  @XmlElement(required = true)
  protected String nicType;
  
  protected boolean multiSelectAllowed;
  
  protected List<HostVirtualNic> candidateVnic;
  
  protected List<String> selectedVnic;
  
  public String getNicType() {
    return this.nicType;
  }
  
  public void setNicType(String paramString) {
    this.nicType = paramString;
  }
  
  public boolean isMultiSelectAllowed() {
    return this.multiSelectAllowed;
  }
  
  public void setMultiSelectAllowed(boolean paramBoolean) {
    this.multiSelectAllowed = paramBoolean;
  }
  
  public List<HostVirtualNic> getCandidateVnic() {
    if (this.candidateVnic == null)
      this.candidateVnic = new ArrayList<>(); 
    return this.candidateVnic;
  }
  
  public List<String> getSelectedVnic() {
    if (this.selectedVnic == null)
      this.selectedVnic = new ArrayList<>(); 
    return this.selectedVnic;
  }
}
