package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDiagnosticPartitionCreateOption;
import com.vmware.vim25.HostDiagnosticPartitionCreateOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDiagnosticPartitionCreateOption", propOrder = {"hostDiagnosticPartitionCreateOption"})
public class ArrayOfHostDiagnosticPartitionCreateOption {
  @XmlElement(name = "HostDiagnosticPartitionCreateOption")
  protected List<HostDiagnosticPartitionCreateOption> hostDiagnosticPartitionCreateOption;
  
  public List<HostDiagnosticPartitionCreateOption> getHostDiagnosticPartitionCreateOption() {
    if (this.hostDiagnosticPartitionCreateOption == null)
      this.hostDiagnosticPartitionCreateOption = new ArrayList<>(); 
    return this.hostDiagnosticPartitionCreateOption;
  }
}
