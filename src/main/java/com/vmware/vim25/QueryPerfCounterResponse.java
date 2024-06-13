package com.vmware.vim25;

import com.vmware.vim25.PerfCounterInfo;
import com.vmware.vim25.QueryPerfCounterResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryPerfCounterResponse")
public class QueryPerfCounterResponse {
  protected List<PerfCounterInfo> returnval;
  
  public List<PerfCounterInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
