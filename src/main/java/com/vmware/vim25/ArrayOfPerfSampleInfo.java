package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPerfSampleInfo;
import com.vmware.vim25.PerfSampleInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerfSampleInfo", propOrder = {"perfSampleInfo"})
public class ArrayOfPerfSampleInfo {
  @XmlElement(name = "PerfSampleInfo")
  protected List<PerfSampleInfo> perfSampleInfo;
  
  public List<PerfSampleInfo> getPerfSampleInfo() {
    if (this.perfSampleInfo == null)
      this.perfSampleInfo = new ArrayList<>(); 
    return this.perfSampleInfo;
  }
}
