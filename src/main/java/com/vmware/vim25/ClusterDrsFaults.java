package com.vmware.vim25;

import com.vmware.vim25.ClusterDrsFaults;
import com.vmware.vim25.ClusterDrsFaultsFaultsByVm;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDrsFaults", propOrder = {"reason", "faultsByVm"})
public class ClusterDrsFaults extends DynamicData {
  @XmlElement(required = true)
  protected String reason;
  
  @XmlElement(required = true)
  protected List<ClusterDrsFaultsFaultsByVm> faultsByVm;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public List<ClusterDrsFaultsFaultsByVm> getFaultsByVm() {
    if (this.faultsByVm == null)
      this.faultsByVm = new ArrayList<>(); 
    return this.faultsByVm;
  }
}
