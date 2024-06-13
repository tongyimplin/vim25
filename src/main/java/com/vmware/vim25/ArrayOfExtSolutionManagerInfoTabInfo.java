package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtSolutionManagerInfoTabInfo;
import com.vmware.vim25.ExtSolutionManagerInfoTabInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtSolutionManagerInfoTabInfo", propOrder = {"extSolutionManagerInfoTabInfo"})
public class ArrayOfExtSolutionManagerInfoTabInfo {
  @XmlElement(name = "ExtSolutionManagerInfoTabInfo")
  protected List<ExtSolutionManagerInfoTabInfo> extSolutionManagerInfoTabInfo;
  
  public List<ExtSolutionManagerInfoTabInfo> getExtSolutionManagerInfoTabInfo() {
    if (this.extSolutionManagerInfoTabInfo == null)
      this.extSolutionManagerInfoTabInfo = new ArrayList<>(); 
    return this.extSolutionManagerInfoTabInfo;
  }
}
