package com.vmware.vim25;

import com.vmware.vim25.QueryDatastorePerformanceSummaryResponse;
import com.vmware.vim25.StoragePerformanceSummary;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryDatastorePerformanceSummaryResponse")
public class QueryDatastorePerformanceSummaryResponse {
  protected List<StoragePerformanceSummary> returnval;
  
  public List<StoragePerformanceSummary> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
