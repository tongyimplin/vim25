package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanHostMembershipInfo;
import com.vmware.vim25.VsanHostMembershipInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanHostMembershipInfo", propOrder = {"vsanHostMembershipInfo"})
public class ArrayOfVsanHostMembershipInfo {
  @XmlElement(name = "VsanHostMembershipInfo")
  protected List<VsanHostMembershipInfo> vsanHostMembershipInfo;
  
  public List<VsanHostMembershipInfo> getVsanHostMembershipInfo() {
    if (this.vsanHostMembershipInfo == null)
      this.vsanHostMembershipInfo = new ArrayList<>(); 
    return this.vsanHostMembershipInfo;
  }
}
