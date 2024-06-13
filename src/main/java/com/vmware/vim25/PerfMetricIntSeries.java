package com.vmware.vim25;

import com.vmware.vim25.PerfMetricIntSeries;
import com.vmware.vim25.PerfMetricSeries;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfMetricIntSeries", propOrder = {"value"})
public class PerfMetricIntSeries extends PerfMetricSeries {
  @XmlElement(type = Long.class)
  protected List<Long> value;
  
  public List<Long> getValue() {
    if (this.value == null)
      this.value = new ArrayList<>(); 
    return this.value;
  }
}
