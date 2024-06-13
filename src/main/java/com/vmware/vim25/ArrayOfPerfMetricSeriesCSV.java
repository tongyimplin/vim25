package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPerfMetricSeriesCSV;
import com.vmware.vim25.PerfMetricSeriesCSV;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerfMetricSeriesCSV", propOrder = {"perfMetricSeriesCSV"})
public class ArrayOfPerfMetricSeriesCSV {
  @XmlElement(name = "PerfMetricSeriesCSV")
  protected List<PerfMetricSeriesCSV> perfMetricSeriesCSV;
  
  public List<PerfMetricSeriesCSV> getPerfMetricSeriesCSV() {
    if (this.perfMetricSeriesCSV == null)
      this.perfMetricSeriesCSV = new ArrayList<>(); 
    return this.perfMetricSeriesCSV;
  }
}
