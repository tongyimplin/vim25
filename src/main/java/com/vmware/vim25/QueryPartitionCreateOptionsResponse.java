package com.vmware.vim25;

import com.vmware.vim25.HostDiagnosticPartitionCreateOption;
import com.vmware.vim25.QueryPartitionCreateOptionsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryPartitionCreateOptionsResponse")
public class QueryPartitionCreateOptionsResponse {
  protected List<HostDiagnosticPartitionCreateOption> returnval;
  
  public List<HostDiagnosticPartitionCreateOption> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
