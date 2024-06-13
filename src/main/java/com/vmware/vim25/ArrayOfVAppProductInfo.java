package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVAppProductInfo;
import com.vmware.vim25.VAppProductInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppProductInfo", propOrder = {"vAppProductInfo"})
public class ArrayOfVAppProductInfo {
  @XmlElement(name = "VAppProductInfo")
  protected List<VAppProductInfo> vAppProductInfo;
  
  public List<VAppProductInfo> getVAppProductInfo() {
    if (this.vAppProductInfo == null)
      this.vAppProductInfo = new ArrayList<>(); 
    return this.vAppProductInfo;
  }
}
