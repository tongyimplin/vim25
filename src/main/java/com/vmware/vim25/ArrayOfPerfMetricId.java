package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPerfMetricId;
import com.vmware.vim25.PerfMetricId;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerfMetricId", propOrder = {"perfMetricId"})
public class ArrayOfPerfMetricId {
  @XmlElement(name = "PerfMetricId")
  protected List<PerfMetricId> perfMetricId;
  
  public List<PerfMetricId> getPerfMetricId() {
    if (this.perfMetricId == null)
      this.perfMetricId = new ArrayList<>(); 
    return this.perfMetricId;
  }
}
