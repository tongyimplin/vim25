package com.vmware.vim25;

import com.vmware.vim25.PerfEntityMetricBase;
import com.vmware.vim25.QueryPerfResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryPerfResponse")
public class QueryPerfResponse {
  protected List<PerfEntityMetricBase> returnval;
  
  public List<PerfEntityMetricBase> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
