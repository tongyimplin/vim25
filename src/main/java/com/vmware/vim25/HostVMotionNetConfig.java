package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVMotionNetConfig;
import com.vmware.vim25.HostVirtualNic;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVMotionNetConfig", propOrder = {"candidateVnic", "selectedVnic"})
public class HostVMotionNetConfig extends DynamicData {
  protected List<HostVirtualNic> candidateVnic;
  
  protected String selectedVnic;
  
  public List<HostVirtualNic> getCandidateVnic() {
    if (this.candidateVnic == null)
      this.candidateVnic = new ArrayList<>(); 
    return this.candidateVnic;
  }
  
  public String getSelectedVnic() {
    return this.selectedVnic;
  }
  
  public void setSelectedVnic(String paramString) {
    this.selectedVnic = paramString;
  }
}
