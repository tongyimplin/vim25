package com.vmware.vim25;

import com.vmware.vim25.HostDiagnosticPartitionCreateDescription;
import com.vmware.vim25.QueryPartitionCreateDescResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryPartitionCreateDescResponse")
public class QueryPartitionCreateDescResponse {
  @XmlElement(required = true)
  protected HostDiagnosticPartitionCreateDescription returnval;
  
  public HostDiagnosticPartitionCreateDescription getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostDiagnosticPartitionCreateDescription paramHostDiagnosticPartitionCreateDescription) {
    this.returnval = paramHostDiagnosticPartitionCreateDescription;
  }
}
