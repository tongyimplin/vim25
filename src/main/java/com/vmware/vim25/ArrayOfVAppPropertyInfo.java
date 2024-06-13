package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVAppPropertyInfo;
import com.vmware.vim25.VAppPropertyInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppPropertyInfo", propOrder = {"vAppPropertyInfo"})
public class ArrayOfVAppPropertyInfo {
  @XmlElement(name = "VAppPropertyInfo")
  protected List<VAppPropertyInfo> vAppPropertyInfo;
  
  public List<VAppPropertyInfo> getVAppPropertyInfo() {
    if (this.vAppPropertyInfo == null)
      this.vAppPropertyInfo = new ArrayList<>(); 
    return this.vAppPropertyInfo;
  }
}
