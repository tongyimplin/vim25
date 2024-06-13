package com.vmware.vim25;

import com.vmware.vim25.PerfCompositeMetric;
import com.vmware.vim25.QueryPerfCompositeResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryPerfCompositeResponse")
public class QueryPerfCompositeResponse {
  @XmlElement(required = true)
  protected PerfCompositeMetric returnval;
  
  public PerfCompositeMetric getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(PerfCompositeMetric paramPerfCompositeMetric) {
    this.returnval = paramPerfCompositeMetric;
  }
}
