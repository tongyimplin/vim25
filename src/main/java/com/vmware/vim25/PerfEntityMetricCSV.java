package com.vmware.vim25;

import com.vmware.vim25.PerfEntityMetricBase;
import com.vmware.vim25.PerfEntityMetricCSV;
import com.vmware.vim25.PerfMetricSeriesCSV;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfEntityMetricCSV", propOrder = {"sampleInfoCSV", "value"})
public class PerfEntityMetricCSV extends PerfEntityMetricBase {
  @XmlElement(required = true)
  protected String sampleInfoCSV;
  
  protected List<PerfMetricSeriesCSV> value;
  
  public String getSampleInfoCSV() {
    return this.sampleInfoCSV;
  }
  
  public void setSampleInfoCSV(String paramString) {
    this.sampleInfoCSV = paramString;
  }
  
  public List<PerfMetricSeriesCSV> getValue() {
    if (this.value == null)
      this.value = new ArrayList<>(); 
    return this.value;
  }
}
