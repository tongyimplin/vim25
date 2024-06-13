package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPerfCounterInfo;
import com.vmware.vim25.PerfCounterInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerfCounterInfo", propOrder = {"perfCounterInfo"})
public class ArrayOfPerfCounterInfo {
  @XmlElement(name = "PerfCounterInfo")
  protected List<PerfCounterInfo> perfCounterInfo;
  
  public List<PerfCounterInfo> getPerfCounterInfo() {
    if (this.perfCounterInfo == null)
      this.perfCounterInfo = new ArrayList<>(); 
    return this.perfCounterInfo;
  }
}
