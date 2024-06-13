package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PerfMetricId;
import com.vmware.vim25.PerfMetricIntSeries;
import com.vmware.vim25.PerfMetricSeries;
import com.vmware.vim25.PerfMetricSeriesCSV;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfMetricSeries", propOrder = {"id"})
@XmlSeeAlso({PerfMetricIntSeries.class, PerfMetricSeriesCSV.class})
public class PerfMetricSeries extends DynamicData {
  @XmlElement(required = true)
  protected PerfMetricId id;
  
  public PerfMetricId getId() {
    return this.id;
  }
  
  public void setId(PerfMetricId paramPerfMetricId) {
    this.id = paramPerfMetricId;
  }
}
