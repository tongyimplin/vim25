package com.vmware.vim25;

import com.vmware.vim25.PerfProviderSummary;
import com.vmware.vim25.QueryPerfProviderSummaryResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryPerfProviderSummaryResponse")
public class QueryPerfProviderSummaryResponse {
  @XmlElement(required = true)
  protected PerfProviderSummary returnval;
  
  public PerfProviderSummary getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(PerfProviderSummary paramPerfProviderSummary) {
    this.returnval = paramPerfProviderSummary;
  }
}
