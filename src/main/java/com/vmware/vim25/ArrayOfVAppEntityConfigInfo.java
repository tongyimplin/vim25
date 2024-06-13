package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVAppEntityConfigInfo;
import com.vmware.vim25.VAppEntityConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppEntityConfigInfo", propOrder = {"vAppEntityConfigInfo"})
public class ArrayOfVAppEntityConfigInfo {
  @XmlElement(name = "VAppEntityConfigInfo")
  protected List<VAppEntityConfigInfo> vAppEntityConfigInfo;
  
  public List<VAppEntityConfigInfo> getVAppEntityConfigInfo() {
    if (this.vAppEntityConfigInfo == null)
      this.vAppEntityConfigInfo = new ArrayList<>(); 
    return this.vAppEntityConfigInfo;
  }
}
