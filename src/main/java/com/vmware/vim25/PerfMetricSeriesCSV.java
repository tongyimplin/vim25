package com.vmware.vim25;

import com.vmware.vim25.PerfMetricSeries;
import com.vmware.vim25.PerfMetricSeriesCSV;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfMetricSeriesCSV", propOrder = {"value"})
public class PerfMetricSeriesCSV extends PerfMetricSeries {
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
