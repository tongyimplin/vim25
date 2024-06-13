package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.DvsOperationBulkFault;
import com.vmware.vim25.DvsOperationBulkFaultFaultOnHost;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsOperationBulkFault", propOrder = {"hostFault"})
public class DvsOperationBulkFault extends DvsFault {
  @XmlElement(required = true)
  protected List<DvsOperationBulkFaultFaultOnHost> hostFault;
  
  public List<DvsOperationBulkFaultFaultOnHost> getHostFault() {
    if (this.hostFault == null)
      this.hostFault = new ArrayList<>(); 
    return this.hostFault;
  }
}
