package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPerfMetricSeries;
import com.vmware.vim25.PerfMetricSeries;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerfMetricSeries", propOrder = {"perfMetricSeries"})
public class ArrayOfPerfMetricSeries {
  @XmlElement(name = "PerfMetricSeries")
  protected List<PerfMetricSeries> perfMetricSeries;
  
  public List<PerfMetricSeries> getPerfMetricSeries() {
    if (this.perfMetricSeries == null)
      this.perfMetricSeries = new ArrayList<>(); 
    return this.perfMetricSeries;
  }
}
