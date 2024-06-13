package com.vmware.vim25;

import com.vmware.vim25.PerfEntityMetric;
import com.vmware.vim25.PerfEntityMetricBase;
import com.vmware.vim25.PerfMetricSeries;
import com.vmware.vim25.PerfSampleInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfEntityMetric", propOrder = {"sampleInfo", "value"})
public class PerfEntityMetric extends PerfEntityMetricBase {
  protected List<PerfSampleInfo> sampleInfo;
  
  protected List<PerfMetricSeries> value;
  
  public List<PerfSampleInfo> getSampleInfo() {
    if (this.sampleInfo == null)
      this.sampleInfo = new ArrayList<>(); 
    return this.sampleInfo;
  }
  
  public List<PerfMetricSeries> getValue() {
    if (this.value == null)
      this.value = new ArrayList<>(); 
    return this.value;
  }
}
