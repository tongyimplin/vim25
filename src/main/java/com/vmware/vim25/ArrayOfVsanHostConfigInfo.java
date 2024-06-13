package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanHostConfigInfo;
import com.vmware.vim25.VsanHostConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanHostConfigInfo", propOrder = {"vsanHostConfigInfo"})
public class ArrayOfVsanHostConfigInfo {
  @XmlElement(name = "VsanHostConfigInfo")
  protected List<VsanHostConfigInfo> vsanHostConfigInfo;
  
  public List<VsanHostConfigInfo> getVsanHostConfigInfo() {
    if (this.vsanHostConfigInfo == null)
      this.vsanHostConfigInfo = new ArrayList<>(); 
    return this.vsanHostConfigInfo;
  }
}
