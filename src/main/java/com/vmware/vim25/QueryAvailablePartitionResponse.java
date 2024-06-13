package com.vmware.vim25;

import com.vmware.vim25.HostDiagnosticPartition;
import com.vmware.vim25.QueryAvailablePartitionResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryAvailablePartitionResponse")
public class QueryAvailablePartitionResponse {
  protected List<HostDiagnosticPartition> returnval;
  
  public List<HostDiagnosticPartition> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
