package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PerfInterval;
import com.vmware.vim25.PerformanceStatisticsDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceStatisticsDescription", propOrder = {"intervals"})
public class PerformanceStatisticsDescription extends DynamicData {
  protected List<PerfInterval> intervals;
  
  public List<PerfInterval> getIntervals() {
    if (this.intervals == null)
      this.intervals = new ArrayList<>(); 
    return this.intervals;
  }
}
