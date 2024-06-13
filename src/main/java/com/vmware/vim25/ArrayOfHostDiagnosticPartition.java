package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDiagnosticPartition;
import com.vmware.vim25.HostDiagnosticPartition;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDiagnosticPartition", propOrder = {"hostDiagnosticPartition"})
public class ArrayOfHostDiagnosticPartition {
  @XmlElement(name = "HostDiagnosticPartition")
  protected List<HostDiagnosticPartition> hostDiagnosticPartition;
  
  public List<HostDiagnosticPartition> getHostDiagnosticPartition() {
    if (this.hostDiagnosticPartition == null)
      this.hostDiagnosticPartition = new ArrayList<>(); 
    return this.hostDiagnosticPartition;
  }
}
